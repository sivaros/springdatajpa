package com.free.service;

import java.util.List;

import com.free.entities.Produit;

public interface ProduitManager {
    public Produit save(Produit p);
	public Produit findOne(Long id);
	public List<Produit> findAll();
	//public Produit update(Produit e);
	public void delete(Long id);
}