package com.proxibanque.presentation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.proxibanque.dao.ClientDAO;
import com.proxibanque.model.Client;
import com.proxibanque.model.ConseillerClient;
import com.proxibanque.service.ServiceClient;
import com.proxibanque.service.ServiceVirement;

//import sun.print.resources.serviceui;

public class MonApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Déclarations et instanciations
		ConseillerClient leConseiller = new ConseillerClient(1, "Ghanim", "Yahya");
		
		ClientDAO lesClients = new ClientDAO();
		
		ServiceClient leService = new ServiceClient();
		
		leConseiller.setListeClients(leService.afficher(lesClients)); 
		
		ServiceVirement leVirement = new ServiceVirement();
		
		
		//===========================================================================
		 
		System.out.println(">>> Bienvenue sur l'application ProxiBanque <<<");
		System.out.println("***********************************************");
		
		//===========================================================================
		
		Scanner scan = new Scanner(System.in);
		String reponse;
		
		do {
			int selectionMenu;
			System.out.println(">>> A quel service souhaitez-vous acceder?:");
			System.out.println("0-Afficher la liste de clients\n" +"1-Creer un client\n" + "2-Modifier les informations d'un client\n"
				+ "3-Lire les informations d'un client\n" + "4-Supprimer un client\n"+ "5-Effectuer un virement\n"+ "6-Quitter\n");
			
			selectionMenu = Integer.parseInt(scan.nextLine());
			switch (selectionMenu) {
			case 0:
				System.out.println(leService.afficher(lesClients));
				break;
			case 1:
				leService.ajouterClient(leConseiller);
				break;
			case 2:
				leService.modifierClient(leConseiller);
				break;
			case 3:
				leService.afficherListeClients(leConseiller);
				break;
			case 4:
				leService.supprimerClient(leConseiller);
				break;
			case 5:
				leVirement.effectuerVirement(leConseiller);
			case 6:
				break;
			default:
				System.out.println("Selection invalide");
			
			}	
			
			do
			{
				System.out.println("Souhaitez-vous effectuer d'autres operations?: <O/N>");
				reponse = scan.nextLine();
			}
			while ((!reponse.equals("O"))&&(!reponse.equals("N")));
		
		} while (reponse.equals("O"));
		System.out.println("Merci d'avoir utilisé nos services. Au revoir!");
		scan.close();
	
	}

}
