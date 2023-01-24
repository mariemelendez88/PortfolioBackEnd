package com.portfolio.backend.service;

import com.portfolio.backend.entity.Skills;
import com.portfolio.backend.repository.RSkills;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SSkills {
	@Autowired
	RSkills rskills;
	
	public List<Skills> listarItems(){
		return rskills.findAll();
	}
	
	public Skills cargarItem(Long id){
		return rskills.findById(id).orElse(null);
	}
	
	public void crearItem(Skills skill){
		rskills.save(skill);
	}
	
	public void borrarItem(Long id){
		rskills.deleteById(id);
	}
	
	public void modificarItem(Skills skill){
		rskills.save(skill);
	}
}
