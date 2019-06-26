package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Produit;

@Service
public class ProduitMockServiceImpl implements IProduit  {

	private List<Produit> produits;
	
	public ProduitMockServiceImpl() {
		 produits =new ArrayList<Produit>();
		 
		produits.add(new Produit("p1",20,30));
		produits.add(new Produit("p2",30,40));
		produits.add(new Produit("p3",40,50));
	}
	@Override
	public List<Produit> getProduit() {
		// TODO Auto-generated method stub
		return produits;
	}

	@Override
	public void addProduit(Produit produit) {
		// TODO Auto-generated method stub
		produits.add(produit);
	}

	@Override
	public void updateProduit(Produit produit) {
		// TODO Auto-generated method stub
		produits.remove(produit);
		produits.add(produit);
		
	}

	@Override
	public void deleteProduit(String ref) {
		// TODO Auto-generated method stub
		Produit produit =new Produit();
		produit.setRef(ref);
		produits.remove(produit);
		
	}

}
