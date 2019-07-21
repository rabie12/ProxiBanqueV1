package com.proxibanque.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CompteCourant extends CompteBancaire {
	
	private double decouvert = 1000;

	

	public CompteCourant(String numeroCb, double solde, String dateOuverture, double decouvert) {
		super(numeroCb, solde, dateOuverture);
		this.decouvert = decouvert;
	}

	
	public CompteCourant() {
		Double numRandom = (Math.random()) * Math.pow(10, 9);
		Integer intRandom = numRandom.intValue();
		this.numeroCb = Integer.toString(intRandom);
		this.solde = 10000.0;

		String format = "dd/MM/yyyy";
		SimpleDateFormat formater = new java.text.SimpleDateFormat(format);
		Date date = new java.util.Date();
		this.dateOuverture = formater.format(date);
	}
	

	
}
