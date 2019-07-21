package com.proxibanque.model;

import com.proxibanque.model.CompteCourant;

public class CarteBancaire {
	private int numCarte;
	private CompteCourant compteCc;

	public CarteBancaire(int numCarte, CompteCourant compteCc) {
		super();
		this.numCarte = numCarte;
		this.compteCc = compteCc;
	}

	public int getNumCarte() {
		return numCarte;
	}

	public void setNumCarte(int numCarte) {
		this.numCarte = numCarte;
	}
	
	public CompteCourant getCompteCc() {
		return compteCc;
	}

	public void setCompteCc(CompteCourant compteCc) {
		this.compteCc = compteCc;
	}
	
}
