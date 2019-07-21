package com.proxibanque.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.proxibanque.dao.ClientDAO;
import com.proxibanque.model.Client;
import com.proxibanque.model.ConseillerClient;


public class ServiceClient {

	ClientDAO clientDao = new ClientDAO();
	
	//Afficher le liste de clients qui se trouve dans DAO
	public ArrayList<Client> afficher(ClientDAO clientDao){
		return clientDao.listeClients();
	}
	
	public void ajouterClient(ConseillerClient cc) {
		
		clientDao.ajouterClient(cc);;
	}
	
	
	public void afficherListeClients(ConseillerClient cc) {
		
		clientDao.afficherListeClients(cc);;
	
	}
	
	public void modifierClient(ConseillerClient cc) {
		
		clientDao.modifierClient(cc);
	
	}
	
	
	public void supprimerClient(ConseillerClient cc) {
		clientDao.supprimerClient(cc);
	}
	
	
	
	
}
