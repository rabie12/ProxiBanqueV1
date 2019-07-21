package com.proxibanque.model;


public class Client extends Personne {

	private String adresse;
	private String codePostal;
	private String ville ;
	private String telephone;
	private CompteCourant compteCourant;
	private CompteEpargne compteEpargne;

	@Override
	public String toString() {
		return "Client [id=" + super.getId() + ", nom=" + super.getNom() + ", prenom=" + super.getPrenom() + ", adresse=" + adresse + ", codePostal=" + codePostal + ", ville=" + ville + ", telephone="
				+ telephone + "]";
	}

	
	

	/** Constructeur de Client**/
	public Client(int id, String nom, String prenom, String adr, String cp, String ville, String tel) {
		super(id, nom, prenom);
		// TODO Auto-generated constructor stub
		this.adresse = adr;
		this.codePostal = cp;
		this.telephone = tel;
		this.ville = ville;
		this.compteCourant = new CompteCourant();
		this.compteEpargne = new CompteEpargne();
	}


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public String getCodePostal() {
		return codePostal;
	}


	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}


	public String getVille() {
		return ville;
	}


	public void setVille(String ville) {
		this.ville = ville;
	}


	public String getTelephone() {
		return telephone;
	}


	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}


	public CompteCourant getCompteCourant() {
		return compteCourant;
	}


	public void setCompteCourant(CompteCourant compteCourant) {
		this.compteCourant = compteCourant;
	}


	public CompteEpargne getCompteEpargne() {
		return compteEpargne;
	}


	public void setCompteEpargne(CompteEpargne compteEpargne) {
		this.compteEpargne = compteEpargne;
	}
	
	public String infosClient() {
		return "Nom Prenom: " + super.getNom() + " " + super.getPrenom()+ " " + "\n" + "Adresse :" + this.adresse + " " + this.codePostal +" " + this.ville + "\n" +"Telephone: " +this.telephone;
	}
	
	public String infosCompte() {
        return "[Compte courant n°: " + this.compteCourant.getNumeroCb() + "\t" + "Solde: " + this.compteCourant.getSolde()
                + " MAD\t" + "Date d'ouverture: " + this.compteCourant.getDateOuverture() + "\n" + "Compte epargne n°: "
                + this.compteEpargne.getNumeroCb() + "\t" + "Solde: " + this.compteEpargne.getSolde() + " MAD\t"
                + "Date d'ouverture: " + this.compteEpargne.getDateOuverture() + "]"; 
        }
	
	
	
	
	
	
}
