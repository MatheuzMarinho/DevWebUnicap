package com.example.demo.model.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Professor;

public interface ProfessorRepositorio extends JpaRepository<Professor, String> {
	
	List<Professor> findByNome(String nome);

	Professor findByMatricula(String matricula);

	//@Query(value="select * from tb_disciplina where descricao like :descricao",nativeQuery=true)
	//List<Professor> findDisciplinaByDescr(@Param( "nome") String descricao);
}
