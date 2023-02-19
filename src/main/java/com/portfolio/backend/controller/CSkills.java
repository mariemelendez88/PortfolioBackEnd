package com.portfolio.backend.controller;

import com.portfolio.backend.entity.Skills;
import com.portfolio.backend.service.SSkills;
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
//@CrossOrigin(origins = "http://localhost:4200") //con que se va a cruzar, o sea, angular
@CrossOrigin(origins = "https://portfoliofrontend-mariem.web.app")
public class CSkills {
	
	@Autowired
	SSkills sskills;
	
	@GetMapping("/skills")
	@ResponseBody
	public List<Skills> listarItems(){
		return sskills.listarItems();
	}
	
	@PostMapping("/skills")
	@ResponseBody
	public String crearItem(@RequestBody Skills skill){
		sskills.crearItem(skill);
		return "La skill fue creada correctamente!!";
	}
	
	@DeleteMapping("/skills/{id}")
	public String borrarSkill(@PathVariable Long id){
		sskills.borrarItem(id);
		return "La skill fue eliminada correctamente!!";
	}
	
	@GetMapping("/skills/{id}")
	@ResponseBody
	public Skills cargarItem(@PathVariable Long id){
		return sskills.cargarItem(id);
	}
	
	@PutMapping("/skills")
	public String modificarItem(@RequestBody Skills skill){
		sskills.modificarItem(skill);
		return "La skill fue modificada correctamente!!";
	}
}
