package com.portfolio.backend.controller;

import com.portfolio.backend.entity.Referencias;
import com.portfolio.backend.service.SReferencias;
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
public class CReferencias {
	
	@Autowired
	SReferencias sreferencias;
	
	@GetMapping("/referencias")
	@ResponseBody
	public List<Referencias> listarItems(){
		return sreferencias.listarItems();
	}
	
	@PostMapping("/referencias")
	@ResponseBody
	public String crearItem(@RequestBody Referencias referencia){
		sreferencias.crearItem(referencia);
		return "La referencia fue creada correctamente!!";
	}
	
	@DeleteMapping("/referencias/{id}")
	public String borrarReferencia(@PathVariable Long id){
		sreferencias.borrarItem(id);
		return "La referencia fue eliminada correctamente!!";
	}
	
	@GetMapping("/referencias/{id}")
	@ResponseBody
	public Referencias cargarItem(@PathVariable Long id){
		return sreferencias.cargarItem(id);
	}
	
	@PutMapping("/referencias")
	public String modificarItem(@RequestBody Referencias referencia){
		sreferencias.modificarItem(referencia);
		return "La referencia fue modificada correctamente!!";
	}
}
