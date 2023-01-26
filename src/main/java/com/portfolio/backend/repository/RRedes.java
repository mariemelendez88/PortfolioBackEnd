package com.portfolio.backend.repository;

import com.portfolio.backend.entity.Redes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RRedes extends JpaRepository<Redes, Long>  {
	
}
