package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.exception.ExceptionResponse;
import com.example.demo.model.Professor;
import com.example.demo.model.dao.ProfessorRepositorio;

@Service
public class ProfessorService {
	
	static String erroProfessorCadastrado = "Professor já cadastrado";
	static String sucessoProfessorCadastrado = "Professor cadastrado com sucesso";
	static String erro  = "Falha ao cadastrar disciplina";
	static String erroNenhumProfessor  = "Nenhum professor cadastrado";

		
	@Autowired
	ProfessorRepositorio professorRepositorio;


	
public ResponseEntity<?>inserirProfessor(Professor professor) throws ExceptionResponse{				
		
	try {
		if( professorRepositorio.findByMatricula(professor.getMatricula()) != null)
			return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(erroProfessorCadastrado);				
		
		professorRepositorio.save(professor);	
		
	} catch (Exception e) {		
		throw new ExceptionResponse(erro, 1);
	}		
		return ResponseEntity.ok(sucessoProfessorCadastrado);
		
}


public ResponseEntity<?> listarProfessor() throws ExceptionResponse{				
	
	List<Professor> professor;
	
	try {
		professor = professorRepositorio.findAll();
		if( professor == null)
			return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(erroNenhumProfessor);				
		
		
	} catch (Exception e) {		
		throw new ExceptionResponse(erro, 1);
	}		
	return ResponseEntity.ok(professor);		
	}
}
