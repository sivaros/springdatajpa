package com.free.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.free.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long>{
	
}
