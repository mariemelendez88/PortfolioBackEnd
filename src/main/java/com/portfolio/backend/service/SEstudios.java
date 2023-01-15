package com.portfolio.backend.service;

import com.portfolio.backend.entity.Estudios;
import com.portfolio.backend.repository.REstudios;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SEstudios {
	@Autowired
	REstudios rexperiencias;
	
	public void crearEstudio(Estudios experiencia){
		rexperiencias.save(experiencia);
	}
	
	public void borrarEstudio(Long id){
		rexperiencias.deleteById(id);
	}
	
	public List<Estudios> listarEstudios(){
		return rexperiencias.findAll();
	}
	
	public Estudios buscarEstudioPorId(Long id){
		return rexperiencias.findById(id).orElse(null);
	}
	
	public void modificarEstudio(Estudios experiencia){
		rexperiencias.save(experiencia);
	}
}
