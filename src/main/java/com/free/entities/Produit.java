package com.free.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Produit implements Serializable {

	@Override
	public String toString() {
		return "Produit [id=" + id + ", designation=" + designation + ", quantite=" + quantite + "]";
	}

	@Id
	@GeneratedValue
	private Long id;
	
	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	@Column(length=70)
	private String designation;
	private double prix;
	private int quantite;

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Produit(String designation, double prix, int quantite) {
		super();
		this.designation = designation;
		this.setPrix(prix);
		this.quantite = quantite;
	}

	public Produit() {
	}

}
