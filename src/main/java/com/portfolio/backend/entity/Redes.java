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
public class Redes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	@Lob
	@Column(name = "urlred", length = 800)
	private String urlred;
	
	@Lob
	@Column(name = "iconred", length = 800)
	private String iconred;

	public Redes() {
	}

	public Redes(String urlred, String iconred) {
		this.urlred = urlred;
		this.iconred = iconred;
	}
	
	
}
