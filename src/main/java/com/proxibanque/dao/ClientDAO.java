package com.proxibanque.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.proxibanque.model.Client;
import com.proxibanque.model.ConseillerClient;

public class ClientDAO {
	
	List<Client> listeClient = new ArrayList<Client>();
	
	public ArrayList<Client> listeClients() {
		ArrayList<Client> listeClient = new ArrayList<Client>();
		listeClient.add(new Client(1,"ABRAK","Nabila","Oulfa","20220","Casablanca","0629159176"));	
		listeClient.add(new Client(2,"HABACHI","Rabie","Riad","20242","Rabat","0629159177"));
		listeClient.add(new Client(3,"QUINOUNI","Issam","Hay Hassani","20235","Tanger","0629159178"));
		listeClient.add(new Client(4,"SAIB","Selma","Bouskoura","20334","Casablanca","0629159179"));
		return listeClient;
		
	}
	
	//Fonction pour ajouter le client dans la liste dédiée au conseiller client
		public void ajouterClient(ConseillerClient conseiller) {
			
			ArrayList<Client> listCc = conseiller.getListeClients();
			
			if(conseiller.getListeClients().size() < conseiller.getMaxclients()) {
				
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Veuillez saisir l'id");
				int id = sc.nextInt();
				sc.nextLine();
				
				System.out.println("Veuillez saisir le nom");
				String nom = sc.nextLine();
				
				System.out.println("Veuillez saisir le prenom");
				String prenom = sc.nextLine();
				
				System.out.println("Veuillez saisir l'adresse");
				String adresse = sc.nextLine();
				
				System.out.println("Veuillez saisir le code postale");
				String cp = sc.nextLine();
				
				System.out.println("Veuillez saisir la ville");
				String ville = sc.nextLine();
				
				System.out.println("Veuillez saisir le telephone");
				String telephone = sc.nextLine();
				
				Client newClient = new Client(id,nom,prenom,adresse,cp,ville,telephone);
				listCc.add(newClient);
				
				System.out.println("Vous venez d'ajouter un nouveau client! Nom: "+newClient.getNom()+" Prénom: "+newClient.getPrenom());
				
			}else {
				System.out.println("Opération impossible! Vous avez atteint le nombre maximum de clients");
			}
		}
		
		
		//Fonction pour modifier un client dans la base de données
		public void modifierClient(ConseillerClient conseiller) {
			
			System.out.println("Selctionner un client à modifier. ");
			
			ArrayList<Client> listCc = conseiller.getListeClients();
			
			for(int i=0; i<listCc.size(); i++) {
				System.out.println(i+ " ==> "+ listCc.get(i));
			}
			
			
			Scanner scn = new Scanner(System.in);
			
			int choice = scn.nextInt();
			scn.nextLine();
			
			if(choice> listCc.size()) {
				System.out.println("Ce client n'existe pas! ");
			}else {
				Client selected = listCc.get(choice);
				System.out.println("Vous avez selectionner ce client " + selected);
				
				String reponse = "Y";
				
				do {
					
					System.out.println("Selectionner le champ que vous souhaitez modifier");
					
					
					System.out.println( "0 => Nom" + "\n" + "1 => Prenom"+ "\n" +"2 =>Adresse"+ "\n"+ "3 => CodePostal"+ "\n"+ "4 => Ville" +"\n" +"5 => Telephone");	
					
					int champ = scn.nextInt();
					scn.nextLine();
					
			
					switch(champ) {
						case 0 : 
							System.out.println("Saisir nom");
							String nom = scn.nextLine();
							selected.setNom(nom);
							break;
						case 1 : 
							System.out.println("Introduiser un nouveau prenom");
							String prenom = scn.nextLine();
							selected.setPrenom(prenom);
							break;
							
						case 2 : 
							System.out.println("Introduiser une nouvelle adresse");
							String adresse = scn.nextLine();
							selected.setAdresse(adresse);
							break;
						case 3 : 
							System.out.println("Introduiser un nouveau code postal");
							String codePostal = scn.nextLine();
							selected.setCodePostal(codePostal);
							break;
						case 4 : 
							System.out.println("Introduiser une nouvelle ville");
							String ville = scn.nextLine();
							selected.setVille(ville);
							break;
						case 5 : 
							System.out.println("Introduiser un nouveau numero de telephone");
							String telephone = scn.nextLine();
							selected.setTelephone(telephone);
							break;
							
						default: 
							System.out.println("Vous avez entré un numero invalide");
					}
					
					System.out.println("Vous voulez modifier un autre champ ? [Y/N]");
					reponse = scn.nextLine();
					
				}while(reponse.equals("Y"));
				
					System.out.println("Des modification on été faites sur le client Numéro " + selected.getId()+" : "+selected.getNom()+" "+selected.getPrenom());
				}
			}
		
		
		//fonction pour afficher la liste des clients
		public void afficherListeClients(ConseillerClient cc) {
			System.out.println("Selectionner le client que vous voulez afficher: ");
			
			ArrayList<Client> listeClients = cc.getListeClients();
			
			for(int i = 0; i < listeClients.size(); i++) {
						
				System.out.println(i + " " + listeClients.get(i));
			}
			
			Scanner sc = new Scanner(System.in);
					
			int selected = sc.nextInt();
			
			if(selected > listeClients.size()) {
				System.out.println("Ce nombre est invalide!");
			} else {
				Client selectedClient = listeClients.get(selected);
				
				System.out.println("Voici les informations du Client");

				System.out.println(selectedClient.infosClient());
				System.out.println(selectedClient.infosCompte());
				
			}
			
		}
		
		
		//fonction pour supprimer un client
		public void supprimerClient(ConseillerClient cc) {
			ArrayList<Client> listeClients = cc.getListeClients();
			
			System.out.println("Selectionnez le client que vous voulez supprimer:");
			
			for(int i = 0; i < listeClients.size(); i++) {
				System.out.println(i + " " + listeClients.get(i));
			}
			
			Scanner sc = new Scanner(System.in);
			int choix = sc.nextInt();
			
			if(choix > listeClients.size()) {
				System.out.println("Choix invalide!");
			}else {
				Client selectedClient = listeClients.get(choix);
				System.out.println("Le client " + selectedClient.getNom()+" "+selectedClient.getPrenom()+ " vient d'être supprimé!");
				listeClients.remove(choix);
			}
		}
		
		



}
