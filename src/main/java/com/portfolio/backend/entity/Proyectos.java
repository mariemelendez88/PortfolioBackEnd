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
public class Proyectos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	@Lob
	@Column(name = "logo", length = 800)
	private String logo;
	
	@Lob
	@Column(name = "link_repo", length = 800)
	private String link_repo;
	
	private String fin;
	
	@Lob
	@Column(name = "titulo", length = 800)
	private String titulo;
	
	@Lob
	@Column(name = "descripcion", length = 800)
	private String descripcion;

	public Proyectos() {
	}

	public Proyectos(String logo, String link_repo, String fin, String titulo, String descripcion) {
		this.logo = logo;
		this.link_repo = link_repo;
		this.fin = fin;
		this.titulo = titulo;
		this.descripcion = descripcion;
	}
	
	
}
