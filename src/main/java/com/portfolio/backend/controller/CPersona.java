package com.portfolio.backend.controller;

import com.portfolio.backend.entity.Persona;
import com.portfolio.backend.service.PersonaDTO;
import com.portfolio.backend.service.SPersona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController //anotacion del spring o controlador
//@CrossOrigin(origins = "http://localhost:4200") //con que se va a cruzar, o sea, angular
@CrossOrigin(origins = "https://portfoliofrontend-mariem.web.app")
public class CPersona {
	
	@Autowired
	SPersona spersona;
	
	// @GetMapping("/persona")
	// @ResponseBody
	// public List<Persona> listarItems(){
	// 	return spersona.listarItems();
	// }
	 
	// @PostMapping("/persona")
	// @ResponseBody
	// public String crearItem(@RequestBody Persona persona){
	// 	spersona.crearItem(persona);
	// 	return "La persona fue creada correctamente!!";
	// }
	
	// @DeleteMapping("/persona/{id}")
	// public String borrarExperiencia(@PathVariable Long id){
	// 	spersona.borrarItem(id);
	// 	return "La persona fue eliminada correctamente!!";
	// }
	
	@GetMapping("/persona/{id}")
	@ResponseBody
	public Persona cargarItem(@PathVariable Long id){
		return spersona.cargarItem(id);
	}
	
	@PutMapping("/persona")
	public String modificarItem(@RequestBody Persona persona){
		spersona.modificarItem(persona);
		return "La persona fue modificada correctamente!!";
	}
	
	@PostMapping("/login")
	@ResponseBody
	public PersonaDTO login(@RequestBody Persona persona){
		return spersona.login(persona.getEmail(), persona.getPassword());
	}

}
