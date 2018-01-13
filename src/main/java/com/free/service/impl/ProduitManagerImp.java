package com.free.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.free.dao.ProduitRepository;
import com.free.entities.Produit;
import com.free.service.ProduitManager;

@Service
@Transactional
public class ProduitManagerImp implements ProduitManager {

	@Autowired
	private ProduitRepository produitDao;

	public Produit save(Produit p) {
		return produitDao.save(p);
	}

	public Produit findOne(Long id) {
		return produitDao.findOne(id);
	}

	public List<Produit> findAll() {
		return produitDao.findAll();
	}

	/*public Produit update(Produit p) {
		return produitDao.(p);
	}*/

	public void delete(Long id) {
		produitDao.delete(id);
	}

}