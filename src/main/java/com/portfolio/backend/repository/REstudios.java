package com.portfolio.backend.repository;

import com.portfolio.backend.entity.Estudios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface REstudios extends JpaRepository<Estudios, Long>  {
	
}

