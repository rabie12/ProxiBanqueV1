package com.proxibanque.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CompteEpargne extends CompteBancaire {
	
	private static double tauxRmuneration = 0.03;


	public CompteEpargne(String numeroCb, double solde, String dateOuverture) {
		super(numeroCb, solde, dateOuverture);
		// TODO Auto-generated constructor stub
	}

	public CompteEpargne() {
		Double numRandom = (Math.random()) * Math.pow(10, 9);
		Integer intRandom = numRandom.intValue();
		this.numeroCb = Integer.toString(intRandom);
		this.solde = 0.0;

		String format = "dd/MM/yyyy";
		SimpleDateFormat formater = new java.text.SimpleDateFormat(format);
		Date date = new java.util.Date();
		this.dateOuverture = formater.format(date);
	}
	
	
	
	

}
