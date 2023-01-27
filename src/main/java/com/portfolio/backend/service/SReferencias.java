package com.portfolio.backend.service;

import com.portfolio.backend.entity.Referencias;
import com.portfolio.backend.repository.RReferencias;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SReferencias {
	@Autowired
	RReferencias rreferencias;
	
	public List<Referencias> listarItems(){
		return rreferencias.findAll();
	}
	
	public Referencias cargarItem(Long id){
		return rreferencias.findById(id).orElse(null);
	}
	
	public void crearItem(Referencias referencia){
		rreferencias.save(referencia);
	}
	
	public void borrarItem(Long id){
		rreferencias.deleteById(id);
	}
	
	public void modificarItem(Referencias referencia){
		rreferencias.save(referencia);
	}
}
