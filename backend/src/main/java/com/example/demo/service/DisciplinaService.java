package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.exception.ExceptionResponse;
import com.example.demo.model.Disciplina;
import com.example.demo.model.Professor;
import com.example.demo.model.dao.DisciplinaDao;
import com.example.demo.model.dao.ProfessorRepositorio;

@Service
public class DisciplinaService {
	
	
	static String erroDisciplinaCadastrado = "Disciplina já cadastrado";
	static String sucessoDisciplinaCadastrado = "Disciplina cadastrado com sucesso";

	static String erro  = "Falha ao cadastrar disciplina";
	static String erroDisciplinaInexistente  = "Falha buscar disciplina";
	

	@Autowired 
	ProfessorRepositorio professorRepository;
		
	@Autowired
	DisciplinaDao disciplinaRepositorio;

	
	public ResponseEntity<?>inserirDisciplina (Disciplina disciplina, String matricula) throws ExceptionResponse{				
		
		try {			
			if( disciplinaRepositorio.findByCodigo(disciplina.getCodigo()) != null)
				return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(erroDisciplinaCadastrado);		
			Professor p = professorRepository.findByMatricula(matricula);
			if( p != null) {			
				disciplina.setProfessor(p);
				disciplinaRepositorio.save(disciplina);
			}		
		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw new ExceptionResponse(erro, 1);
		}			
		return ResponseEntity.ok(sucessoDisciplinaCadastrado);		
	}
	
	public ResponseEntity<?> findByCodigo(String codigo) throws ExceptionResponse{				
		
		Disciplina disciplina;
		
		try {
			disciplina = disciplinaRepositorio.findByCodigo(codigo);
			if( disciplina == null)
				return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(erroDisciplinaInexistente);				
			
			
		} catch (Exception e) {		
			throw new ExceptionResponse(erro, 1);
		}		
		return ResponseEntity.ok(disciplina);		
	}

	public void saveSuperHero(Disciplina disciplina) {

		disciplinaRepositorio.save(disciplina);
		
	}

}