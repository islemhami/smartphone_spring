package com.nadhem.produit.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Smartphone {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idSmartphone;
	private String nomModele;
	private String color;
	private Double prix;
	
	@ManyToOne
	private Marque marque;
	
	
	public Smartphone() {
		super();
	
	}
	
	public Smartphone(String nomModele, String color, Double prix) {
		super();
		this.nomModele = nomModele;
		this.color = color;
		this.prix = prix;
	}

	public Long getIdSmartphone() {
		return idSmartphone;
	}

	public void setIdSmartphone(Long idSmartphone) {
		this.idSmartphone = idSmartphone;
	}

	public String getNomModele() {
		return nomModele;
	}

	public void setNomModele(String nomModele) {
		this.nomModele = nomModele;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Double getPrix() {
		return prix;
	}

	public void setPrix(Double prix) {
		this.prix = prix;
	}

	public Marque getMarque() {
		return marque;
	}

	public void setMarque(Marque marque) {
		this.marque = marque;
	}

	@Override
	public String toString() {
		return "Smartphone [idSmartphone=" + idSmartphone + ", nomModele=" + nomModele + ", color=" + color + ", prix="
				+ prix + ", marque=" + marque + "]";
	}

	
}
