package com.proxibanque.model;

import java.util.ArrayList;

public class ConseillerClient extends Personne{
	
	ArrayList<Client> listeClients;
	final static int MAXCLIENTS = 10;

	public ConseillerClient(int id, String nom, String prenom) {
		super(id, nom, prenom);
		this.listeClients = new ArrayList<Client>();
	}

	public ArrayList<Client> getListeClients() {
		return listeClients;
	}

	public void setListeClients(ArrayList<Client> listeClients) {
		this.listeClients = listeClients;
	}
	
	public static int getMaxclients() {
		return MAXCLIENTS;
	}

	@Override
	public String toString() {
		return "ConseillerClient [listeClients=" + listeClients + "]";
	}
	
}
