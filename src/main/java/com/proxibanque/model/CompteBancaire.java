package com.proxibanque.model;

public class CompteBancaire {
	protected String numeroCb;
	protected double solde;
	protected String dateOuverture;
	
	public CompteBancaire(String numeroCb, double solde, String dateOuverture) {
		super();
		this.numeroCb = numeroCb;
		this.solde = solde;
		this.dateOuverture = dateOuverture;
	}
	
	public CompteBancaire() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNumeroCb() {
		return numeroCb;
	}

	public void setNumeroCb(String numeroCb) {
		this.numeroCb = numeroCb;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public String getDateOuverture() {
		return dateOuverture;
	}

	public void setDateOuverture(String dateOuverture) {
		this.dateOuverture = dateOuverture;
	}
	

	@Override
	public String toString() {
		return "CompteBancaire [numeroCb=" + numeroCb + ", solde=" + solde + ", dateOuverture=" + dateOuverture + "]";
	}
	
	
}
