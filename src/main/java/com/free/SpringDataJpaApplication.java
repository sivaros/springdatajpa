package com.free;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;

import com.free.entities.Produit;
import com.free.service.ProduitManager;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringDataJpaApplication.class, args);
		
		ProduitManager pm = ctx.getBean(ProduitManager.class);
		
		pm.save(new Produit("HP Ordinateur", 500, 10));
    	pm.save(new Produit("Clavier", 15, 5));
    	pm.save(new Produit("Table", 150, 8));
    	
    	List<Produit> produits = pm.findAll();
    	
    	for(Produit p : produits) {
    		System.out.println(p.toString());
    	}
    	
    	//produitManager.delete(id);
    	
        
    	//System.out.println( "Hello World!" );

	}
}
