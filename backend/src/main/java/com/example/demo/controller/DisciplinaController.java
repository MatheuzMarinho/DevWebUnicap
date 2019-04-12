package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.ExceptionResponse;
import com.example.demo.model.Disciplina;
import com.example.demo.model.dao.DisciplinaDao;
import com.example.demo.model.dao.ProfessorRepositorio;
import com.example.demo.service.DisciplinaService;


@RestController
@CrossOrigin
@RequestMapping("/disciplina")
public class DisciplinaController {
	
	@Autowired 
	DisciplinaDao disciplinaRepository;
	
	@Autowired(required=true)
	DisciplinaService disciplinaService;

	@Autowired 
	ProfessorRepositorio professorRepository;
	
	
	@GetMapping
    public List<Disciplina> listarDisciplinas() {	
		
        return disciplinaRepository.findAll();
    }
	@PostMapping("/{matricula}")	
    public ResponseEntity<?> inserir(@PathVariable String matricula,
            @RequestBody Disciplina disciplina) throws ExceptionResponse {	
		
        return disciplinaService.inserirDisciplina(disciplina,matricula);
    }
	@GetMapping("/{codigo}")
	public ResponseEntity<?> findByCodigo(@PathVariable String codigo) throws ExceptionResponse {	
        return disciplinaService.findByCodigo(codigo);
    }

}
