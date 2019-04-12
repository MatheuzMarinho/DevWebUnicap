package com.example.demo.model.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.Disciplina;

public interface DisciplinaDao extends JpaRepository<Disciplina, String> {
	
	List<Disciplina> findByDescricao(String descricao);

	Disciplina findByCodigo(String codigo);
	
	//@Query(value="select * from tb_disciplina where descricao like :descricao",nativeQuery=true)
	//List<Disciplina> findDisciplinaByDescr(@Param( "descricao") String descricao);
	
}