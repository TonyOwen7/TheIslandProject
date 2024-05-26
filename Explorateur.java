package com.example.islandproject.model;

import com.example.islandproject.model.Pion;
import javafx.scene.shape.Circle;

import java.util.ArrayList;
import java.util.List;



/**
 * 
 * La classe Explorateur correspond aux pions explorateurs. Cette classe herite de la classe Pion.
 *
 */
public class Explorateur extends Pion {
	/**
	 * valeur de type int la valeur du pion explorateur
	 */
	private int valeur;
	
	/**
	 * couleur de type Type_couleur la couleur de l'explorateur
	 */
	private modele.Type_couleur couleur;
	
	/**
	 * cercle de type Circle
	 */
	private Circle cercle;
	
	/**
	 * pion_place de type boolean nous indique que le pion a ete plac�
	 */
	private boolean pion_place = false;
	/**
	 * Le constructeur de la classe Explorateur
	 * @param pValeur de type int la valeur de l'explorateur
	 * @param pCouleur de type Type_couleur la couleur de l'explorateur
	 */
	public Explorateur(int pValeur, modele.Type_couleur pCouleur){
		valeur = pValeur;
		couleur = pCouleur;
		cercle = new Circle();
	}
	
	public String toString(){
		return "Explorateur "+couleur+ ", de valeur : "+ valeur;
	}
	
	/**
	 * Cette methode permet d'indiquer l'etat du pion (si le pion explorateur a ete place ou non)
	 * @return pion_place de type boolean
	 */
	public boolean is_pion_place() {
		return pion_place;
	}
	
	/**
	 * Cette methode permet d'indiquer que ce pion explorateur a ete place
	 * @return true, il a �t� plac�
	 */
	public void place_pion() {
		this.pion_place = true;
	}
	
	/**
	 * Cette methode permet de recuperer l'attribut cercle
	 * @return cercle de type Circle
	 */
	public Circle getCercle() {
		return cercle;
	}
	
	/**
	 * Cette methode permet de recuperer l'attribut couleur de l'explorateur
	 * @return couleur de type Type_couleur
	 */
	public modele.Type_couleur getCouleur() {
		return couleur;
	}
	
	/**
	 * Cette methode permet de recuperer l'attribut valeur de l'explorateur
	 * @return valeur de type int
	 */
	public int getValeur() {
		return valeur;
	}
	
	/**
	 * Cette methode permet de modifier l'attribut valeur avec une nouvelle valeur pass� en parametre
	 * @param value un entier : la nouvelle valeur
	 */
	public void setValeur(int value)
	{
		this.valeur = value;
	}
	

	}
	
