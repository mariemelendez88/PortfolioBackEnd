package com.portfolio.backend.controller;

import com.portfolio.backend.entity.Proyectos;
import com.portfolio.backend.service.SProyectos;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController //anotacion del spring o controlador
@CrossOrigin(origins = "http://localhost:4200") //con que se va a cruzar, o sea, angular
public class CProyectos {
	
	@Autowired
	SProyectos sproyectos;
	
	@GetMapping("/proyectos")
	@ResponseBody
	public List<Proyectos> listarItems(){
		return sproyectos.listarItems();
	}
	
	@PostMapping("/proyectos")
	@ResponseBody
	public String crearItem(@RequestBody Proyectos proyecto){
		sproyectos.crearItem(proyecto);
		return "El proyecto fue creado correctamente!!";
	}
	
	@DeleteMapping("/proyectos/{id}")
	public String borrarExperiencia(@PathVariable Long id){
		sproyectos.borrarItem(id);
		return "El proyecto fue eliminado correctamente!!";
	}
	
	@GetMapping("/proyectos/{id}")
	@ResponseBody
	public Proyectos cargarItem(@PathVariable Long id){
		return sproyectos.cargarItem(id);
	}
	
	@PutMapping("/proyectos")
	public String modificarItem(@RequestBody Proyectos proyecto){
		sproyectos.modificarItem(proyecto);
		return "El proyecto fue modificado correctamente!!";
	}
}
