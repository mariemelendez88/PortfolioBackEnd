package com.portfolio.backend.controller;

import com.portfolio.backend.entity.Redes;
import com.portfolio.backend.service.SRedes;
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
public class CRedes {
	
	@Autowired
	SRedes sredes;
	
	@GetMapping("/redes")
	@ResponseBody
	public List<Redes> listarItems(){
		return sredes.listarItems();
	}
	
	@PostMapping("/redes")
	@ResponseBody
	public String crearItem(@RequestBody Redes red){
		sredes.crearItem(red);
		return "La rede fue creada correctamente!!";
	}
	
	@DeleteMapping("/redes/{id}")
	public String borrarRede(@PathVariable Long id){
		sredes.borrarItem(id);
		return "La red fue eliminada correctamente!!";
	}
	
	@GetMapping("/redes/{id}")
	@ResponseBody
	public Redes cargarItem(@PathVariable Long id){
		return sredes.cargarItem(id);
	}
	
	@PutMapping("/redes")
	public String modificarItem(@RequestBody Redes red){
		sredes.modificarItem(red);
		return "La red fue modificada correctamente!!";
	}
}
