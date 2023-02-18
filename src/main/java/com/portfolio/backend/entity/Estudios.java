package com.portfolio.backend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Estudios {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	@Lob
	@Column(name = "logo", length = 800)
	private String logo;
	
	@Lob
	@Column(name = "link_instit", length = 800)
	private String link_instit;
	
	private String instit;
	
	private String inicio;
	
	private String fin;
	
	@Lob
	@Column(name = "titulo", length = 800)
	private String titulo;
	
	@Lob
	@Column(name = "descripcion", length = 800)
	private String descripcion;

	public Estudios() {
	}

	public Estudios(String logo, String link_instit, String instit, String inicio, String fin, String titulo, String descripcion) {
		this.logo = logo;
		this.link_instit = link_instit;
		this.instit = instit;
		this.inicio = inicio;
		this.fin = fin;
		this.titulo = titulo;
		this.descripcion = descripcion;
	}
	
	
}
