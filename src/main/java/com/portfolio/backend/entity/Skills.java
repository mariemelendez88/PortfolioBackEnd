package com.portfolio.backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Skills {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	private String habilidad;
	
	private String porcentaje;
	
	private String iconskill;
	
	private String tipo;

	public Skills() {
	}

	public Skills(String habilidad, String porcentaje, String puesto, String iconskill, String tipo) {
		this.habilidad = habilidad;
		this.porcentaje = porcentaje;
		this.iconskill = iconskill;
		this.tipo = tipo;
	}
	
	
}
