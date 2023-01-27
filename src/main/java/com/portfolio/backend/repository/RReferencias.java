package com.portfolio.backend.repository;

import com.portfolio.backend.entity.Referencias;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RReferencias extends JpaRepository<Referencias, Long>  {
	
}
