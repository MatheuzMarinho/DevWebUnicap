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
import com.example.demo.model.Professor;
import com.example.demo.model.dao.ProfessorRepositorio;
import com.example.demo.service.ProfessorService;

@RestController
@CrossOrigin
@RequestMapping("/professor")
public class ProfessorController {
	
	
	
	@Autowired 
	ProfessorRepositorio professorRepository;
	
	@Autowired(required=true)
	ProfessorService professorService;
	
	
	@GetMapping 
	public List<Professor> listarProfessores() {	
        return professorRepository.findAll();
    }
	
	@GetMapping("/{matricula}")
	public Professor professorByMatricula(@PathVariable("matricula") String matricula) {
		return professorRepository.findByMatricula(matricula);
	}
	
	@PostMapping
    public ResponseEntity<?> inserir(@RequestBody Professor professor) throws ExceptionResponse {	
        return professorService.inserirProfessor(professor);
    }
	

}
