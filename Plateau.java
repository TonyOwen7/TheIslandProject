package com.example.islandproject.model;


/**
 * Plateau est la classe qui permet de creer le plateau et d'initialiser la partie
 * 
 *
 */
public class Plateau{
	/**
	 * plateau est un tableau de Case qui repr�sente le plateau d'hexagone
	 */
	public static Case[][] plateau = new Case[13][12];

	/**
	 * Cette m�thode permet de d�limiter ainsi que initiliaser les cases du plateau
	 */
	 public void setNull_plateau() {
		 int i,j;
		 for(i=0; i<13;i++) {
			 for(j=0;j<12;j++) {
				 plateau[i][j] = new Case("empty");
			 }
		 }

		plateau[0][0] = null;
		plateau[0][1] = null;
		plateau[0][9] = null;
		plateau[0][10] = null;
		plateau[0][11] = null;
		plateau[1][0] = null;
		plateau[1][11] = null;
		plateau[2][11] = null;
		plateau[3][0] = null;
		plateau[3][11] = null;
		plateau[4][11] = null;
		plateau[6][11] = null;
		plateau[8][11] = null;
		plateau[9][0] = null;
		plateau[9][11] = null;
		plateau[10][11] = null;
		plateau[11][0] = null;
		plateau[11][11] = null;
		plateau[12][0] = null;
		plateau[12][1] = null;
		plateau[12][9] = null;
		plateau[12][10] = null;
		plateau[12][11] = null;
	}

	 /**
	  * Cette m�thode permet d'initialiser les cases du plateau avec des coordonn�es
	  */
	  public void generer_plateau() {
			this.setNull_plateau();
			String idLetter = "abcdefghijklm";
			String idCase;
			int i,j,k;
			for(i=0; i<13;i++) {
				k=0;
				for(j=0;j<12;j++) {
					if(plateau[i][j]!=null){
						k++;
						idCase = idLetter.charAt(i) + String.valueOf(k);
						plateau[i][j] = new Case(idCase); 
					}
				}
			}
	 }
	 
	 /**
	  * Cette m�thode ajoute les voisins de chaque case a la liste des voisins de chaque cases
	  */
	 public void ajout_voisin_plateau() {
		int i,j;
		for(i=0; i<13;i++) {
				for(j=0;j<12;j++) {
					if(plateau[i][j]!=null){
						//Ajout voisin du dessus
						if(i>0) {
							if(i%2 == 0) {
								//paire
								if(i > 0 && j > 0 && plateau[i-1][j] != null) {
									plateau[i][j].ajouter_voisin(plateau[i-1][j]);
								}
								if(i > 0 && plateau[i-1][j+1] != null) {									
									plateau[i][j].ajouter_voisin(plateau[i-1][j+1]);
								}
							}else {
								// impaire
								if(i > 0 && j>0 && plateau[i-1][j-1] != null) {									
									plateau[i][j].ajouter_voisin(plateau[i-1][j-1]);
								}
								if(i > 0 && j < 11 && plateau[i-1][j] != null) {
									plateau[i][j].ajouter_voisin(plateau[i-1][j]);
								}
							}
						}
						//Ajout voisin du dessous
						if(i<12) {
							if(i%2 == 0) {
								// impaire
								if(i < 12 && j < 11 && plateau[i+1][j+1] != null) {
									plateau[i][j].ajouter_voisin(plateau[i+1][j+1]);								}
							}else {
								// paire
								if(j > 0 && plateau[i+1][j-1] != null) {
									plateau[i][j].ajouter_voisin(plateau[i+1][j-1]);
								}
							}
							if( plateau[i+1][j] != null) {
								plateau[i][j].ajouter_voisin(plateau[i+1][j]);	
							}
						}
						
						//Set voisin des c�t�s
						if(j==0) {
							if(plateau[i][j+1] != null) {
								plateau[i][j].ajouter_voisin(plateau[i][j+1]);
							}
						} else if(j==11) {
							plateau[i][j].ajouter_voisin(plateau[i][j-1]);
						} else {
							if(plateau[i][j-1] != null) {									
								plateau[i][j].ajouter_voisin(plateau[i][j-1]);
							}
							if(plateau[i][j+1] != null) {									
								plateau[i][j].ajouter_voisin(plateau[i][j+1]);
							}
						}
					}
				}
			}
		}
	
	 //FONCTION TEST 
	 public void print_plateau() {
		 int i,j;
		 for(i=0; i<13;i++) {
			 for(j=0;j<12;j++) {
				 if (plateau[i][j] == null){
					 System.out.print("na"); 
				 } else {
					 System.out.print(plateau[i][j].getidCase()); 
				 }
				 System.out.print(" ");
				 	
			 }
			 System.out.println("");
		 }
	 }
	 

	 public void print_voisins() {
		 int i,j;
		 for(i=0; i<13;i++) {
			 for(j=0;j<12;j++) {
				 if (plateau[i][j] != null){
					 System.out.println("#"+ plateau[i][j].getidCase()+"#"); 
					 plateau[i][j].lister_voisin(); 
				 }	
				 System.out.println("\n----------");
			 }
			 System.out.println("#####");
		 }
	 }
	 


	 


		 
		
	 
	 // MAIN
	public static void main(String args[]){
		Plateau p = new Plateau();
		p.generer_plateau();
		p.ajout_voisin_plateau();
		p.print_plateau();
		p.print_voisins();

	
	}

	public Tuile selection_tuile(int coordX, int coordY) {
		return null;
	}
}