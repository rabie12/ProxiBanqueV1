package com.proxibanque.service;

import com.proxibanque.dao.ClientDAO;
import com.proxibanque.dao.VirementDAO;
import com.proxibanque.model.Client;
import com.proxibanque.model.CompteBancaire;
import com.proxibanque.model.CompteCourant;
import com.proxibanque.model.ConseillerClient;

public class ServiceVirement {
	private VirementDAO virement = new VirementDAO();
	private double amount;
	
	public void effectuerVirement(ConseillerClient cc) {
			
			virement.effectuerVirement(cc);
	}
	
}




