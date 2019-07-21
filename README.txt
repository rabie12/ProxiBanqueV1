----------------------------------------------------------------------------------------------
				Projet ProxiBanqueSI v1.0
----------------------------------------------------------------------------------------------
Réalisé par : Nabila ABRAK, Rabie HABACHI, Issam QUINOUNI


---------------------
1. Objectifs de l'application
---------------------

	L'application ProxibanqueSI permet la gestion des clients de ProxiBanque. Elle sera utilisée par les conseillers.
	
	L'application doit permettre au conseiller clientèle de créer un client, le modifier, lire ses informations et le supprimer. Le conseiller doit pouvoir effectuer des virements de  compte à compte ainsi que réaliser des simulations de crédits immobiliers ou de consommation.
Les clients (particuliers uniquement) fortunés peuvent bénéficier d'un système de placement en bourse. 

---------------------
2. Fonctionnalités
---------------------

ProxiBanqueSI V1 dispose des fonctionnalités suivantes :

Gestion client :
- Création d'un nouveau client
- Modification des informations d'un client
- Lecture des informations détailées d'un client
- Suppression d'un client
- Affichage de la liste des clients gérés par un conseiller

	
Virement de compte à compte :
- Sélection du compte débiteur parmi la liste des comptes des clients du conseiller
- Sélection du compte à créditer en renseignant un numéro de la liste proposée
- Choix du montant et d'un message lié au virement
- Confirmation pour éviter les erreurs 
- Vérification de la validité du virement par l'application
- Une trace du virement comportant le compte débiteur, le compte à créditer, le montant et le message est gardée dans l'historique de la banque 



---------------------
3. Installation
---------------------

Pour utiliser ProxiBanqueSI V1, copiez le projet dans le workspace d'Eclipse.
Ouvrez Eclipse et importez le projet (File -> Import -> Existing projects into workspace).
Lancez l'application.

--------------------------------------
4. Scénario classique d'utilisation
--------------------------------------


	
Le menu principal propose les options suivantes :
0-Afficher la liste de clients
1-Créer un client
2-Modifier les informations d'un client
3-Lire les informations d'un client
4-Supprimer un client
5-Effectuer un virement
6-Quitter


Le menu suivant propose au conseiller l'opération qu'il souhaite effectuer : 

Le premier propose l'affichage des clients affectés au conseiller.
Le deuxième propose d'ajouter un client
Le troisième propose la modification des infos du client.
Le quatrième propose de lire les infos du client.
Le cinquième propose la suppression d'un client.
Le sixième propose un virement de compte à compte, il suffit de se laisser guider en respectant les instructions à l'écran. 

Exemple d'un virement effectué à partir de l'application ProxiBanque :
--------------------------------------------------
Veuillez choisir le client emetteur
0 Client [id=1, nom=ABRAK, prenom=Nabila, adresse=Oulfa, codePostal=20220, ville=Casablanca, telephone=0629159176]
1 Client [id=2, nom=HABACHI, prenom=Rabie, adresse=Riad, codePostal=20242, ville=Rabat, telephone=0629159177]
2 Client [id=3, nom=QUINOUNI, prenom=Issam, adresse=Hay Hassani, codePostal=20235, ville=Tanger, telephone=0629159178]
3 Client [id=4, nom=SAIB, prenom=Selma, adresse=Bouskoura, codePostal=20334, ville=Casablanca, telephone=0629159179]
1
Veuillez choisir le client recepteur
0 Client [id=1, nom=ABRAK, prenom=Nabila, adresse=Oulfa, codePostal=20220, ville=Casablanca, telephone=0629159176]
1 Client [id=2, nom=HABACHI, prenom=Rabie, adresse=Riad, codePostal=20242, ville=Rabat, telephone=0629159177]
2 Client [id=3, nom=QUINOUNI, prenom=Issam, adresse=Hay Hassani, codePostal=20235, ville=Tanger, telephone=0629159178]
3 Client [id=4, nom=SAIB, prenom=Selma, adresse=Bouskoura, codePostal=20334, ville=Casablanca, telephone=0629159179]
0
Le client �metteur est le client num�ro: 2 Rabie HABACHI
Le client r�cepteur est le client num�ro: 1 Nabila ABRAK
Entrer le montant voulu: 
500
Op�ration effectu�e avec succ�s!
Le compte �metteur: Rabie HABACHI a actuellement: 9500.0 MAD
Le compte r�cepteur: Nabila ABRAK a actuellement: 10500.0 MAD 

Souhaitez-vous effectuer d'autres opérations?: <O/N>
----------------------------------------------------
	
	

------------------------------------------------------
5. Améliorations prévues 
------------------------------------------------------
Créer un système d'authentification pour les Conseillers.
Créer un outil qui permet la simulation des crédits immobiliers et crédits consommations.
Création d'un système de placement pour les Clients fortunés. 
