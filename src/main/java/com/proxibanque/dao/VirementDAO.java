package com.proxibanque.dao;

import java.util.ArrayList;
import java.util.Scanner;

import com.proxibanque.model.Client;
import com.proxibanque.model.CompteCourant;
import com.proxibanque.model.ConseillerClient;


public class VirementDAO{
	
	
	public void effectuerVirement(ConseillerClient cc) {
			
			System.out.println("Veuillez choisir le client emetteur");
			
			ArrayList<Client> listClient = cc.getListeClients();
			
			for(int i = 0; i < listClient.size();i++) {
				System.out.println(i + " " + listClient.get(i));
			}
			
			Scanner sc = new Scanner(System.in);
			
			int clientSel = Integer.parseInt(sc.nextLine());
			
			Client clientEm = listClient.get(clientSel);
			
			
			
			System.out.println("Veuillez choisir le client recepteur");
			for(int i = 0; i < listClient.size();i++) {
				System.out.println(i + " " +listClient.get(i));
			}
			
			
			
			int clientSel2 = Integer.parseInt(sc.nextLine());
			
			Client clientRe = listClient.get(clientSel2);
			System.out.println("Le client �metteur est le client num�ro: " + clientEm.getId()+" "+clientEm.getPrenom()+" "+clientEm.getNom());
			System.out.println("Le client r�cepteur est le client num�ro: " + clientRe.getId()+" "+clientRe.getPrenom()+" "+clientRe.getNom());
			
			System.out.println("Entrer le montant voulu: ");
			int amount = Integer.parseInt(sc.nextLine());
			
			if(amount > clientEm.getCompteCourant().getSolde()) {
				System.out.println("Op�ration impossible! Solde insuffisant!");
			} else {
				double nouveauSolde = clientEm.getCompteCourant().getSolde() - amount;
				double nouveauSoldeR = clientRe.getCompteCourant().getSolde() + amount;
				clientEm.getCompteCourant().setSolde(nouveauSolde);
				clientRe.getCompteCourant().setSolde(nouveauSoldeR);
				
				
				System.out.println("Op�ration effectu�e avec succ�s!");
				System.out.println("Le compte �metteur: "+clientEm.getPrenom()+" "+clientEm.getNom() +" a actuellement: "+ clientEm.getCompteCourant().getSolde()+" MAD");
				System.out.println("Le compte r�cepteur: "+clientRe.getPrenom()+" "+clientRe.getNom() +" a actuellement: "+ clientRe.getCompteCourant().getSolde()+" MAD \n");
				
			}
	}
}
