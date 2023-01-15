package com.portfolio.backend.controller;

import com.portfolio.backend.entity.Estudios;
import com.portfolio.backend.service.SEstudios;
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
public class CEstudios {
	
	@Autowired
	SEstudios sestudios;
	
	@GetMapping("/estudios")
	@ResponseBody
	public List<Estudios> listarEstudios(){
		return sestudios.listarEstudios();
	}
	
	@PostMapping("/estudios")
	@ResponseBody
	public String crearEstudio(@RequestBody Estudios experiencia){
		sestudios.crearEstudio(experiencia);
		return "La experiencia fue creada correctamente!!";
	}
	
	@DeleteMapping("/estudios/{id}")
	public String borrarEstudio(@PathVariable Long id){
		sestudios.borrarEstudio(id);
		return "La experiencia fue eliminada correctamente!!";
	}
	
	@GetMapping("/estudios/{id}")
	@ResponseBody
	public Estudios buscarEstudioPorId(@PathVariable Long id){
		return sestudios.buscarEstudioPorId(id);
	}
	
	@PutMapping("/estudios/{id}")
	public String modificarEstudio(@RequestBody Estudios experiencia){
		sestudios.modificarEstudio(experiencia);
		return "La experiencia fue modificada correctamente!!";
	}
}
