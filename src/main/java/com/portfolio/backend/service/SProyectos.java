package com.portfolio.backend.service;

import com.portfolio.backend.entity.Proyectos;
import com.portfolio.backend.repository.RProyectos;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SProyectos {
	@Autowired
	RProyectos rproyectos;
	
	public List<Proyectos> listarItems(){
		return rproyectos.findAll();
	}
	
	public Proyectos cargarItem(Long id){
		return rproyectos.findById(id).orElse(null);
	}
	
	public void crearItem(Proyectos proyecto){
		rproyectos.save(proyecto);
	}
	
	public void borrarItem(Long id){
		rproyectos.deleteById(id);
	}
	
	public void modificarItem(Proyectos proyecto){
		rproyectos.save(proyecto);
	}
}
