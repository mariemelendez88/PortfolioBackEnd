package com.portfolio.backend.repository;

import com.portfolio.backend.entity.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RProyectos extends JpaRepository<Proyectos, Long>  {
	
}

