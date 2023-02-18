package com.portfolio.backend.service;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PersonaDTO {
	
	Long id;
	
	private String nombre;
	
	private String apellido;
	
	private String titulo;
	
	private String frase;
	
	private String acercade;
	
	private String img_banner;
	
	private String img_pfp;
	
	private String cvpdf;
	
	private String textofooter;

	public PersonaDTO() {
	}

	public PersonaDTO(Long id, String nombre, String apellido, String titulo, String frase, String acercade, String img_banner, String img_pfp, String cvpdf, String textofooter) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.titulo = titulo;
		this.frase = frase;
		this.acercade = acercade;
		this.img_banner = img_banner;
		this.img_pfp = img_pfp;
		this.cvpdf = cvpdf;
		this.textofooter = textofooter;
	}
	
	
}
