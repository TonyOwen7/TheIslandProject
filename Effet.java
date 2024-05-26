package com.example.islandproject.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * La classe effet correspond aux effets des diff�rents tuiles
 *
 */
public class Effet{
    /**
     * effet de type Type_effet l'effet de la tuile
     */
    private Type_effet effet;

    /**
     * couleur de type Type_couleur la couleur de l'effet
     */
    private modele.Type_couleur couleur;

    /**
     * Cette m�thode permet de r�cup�rer l'effet
     * @return effet de type Type_effet
     */
    public Type_effet getEffet() {
        return effet;
    }

    /**
     * Cette m�thode permet de r�cup�rer la couleur
     * @return couleur la couleur de l'effet
     */
    public modele.Type_couleur getCouleur() {
        return this.couleur;
    }

    /**
     * Cette m�thode permet de modifier la couleur de l'effet
     * @param couleur de type Type_couleur la nouvelle couleur
     */
    public void setCouleur(modele.Type_couleur couleur) {
        this.couleur = couleur;
    }

    /**
     * Cette m�thode permet de modifier l'effet
     * @param effet de type Type_effet le nouvel effet
     */
    public void setEffet(Type_effet effet) {
        this.effet = effet;
    }

    /**
     * Le constructeur de la classe Effet
     * @param effet de type Type_effet
     * @param couleur de type Type_couleur
     */
    public Effet(Type_effet effet, modele.Type_couleur couleur) {
        this.effet = effet;
        this.couleur = couleur;
    }

    // TUILE TERRAIN
    /**
     * Cette m�thode permet de cr�er les tuiles avec les effets plages
     * @return List Effet la liste des effets
     */
    public static List<Effet> creation_effets_plage(){
        int i;
        List<Effet> liste_effet = new ArrayList<Effet>();
        for(i=0; i<3;i++) {
            liste_effet.add(new Effet(Type_effet.BALEINE_IMMEDIAT, modele.Type_couleur.VERT));
        }
        for(i=0; i<3;i++) {
            liste_effet.add(new Effet(Type_effet.REQUIN_IMMEDIAT, modele.Type_couleur.VERT));
        }
        liste_effet.add(new Effet(Type_effet.BATEAU_IMMEDIAT, modele.Type_couleur.VERT));
        for(i=0; i<2;i++) {
            liste_effet.add(new Effet(Type_effet.BALEINE_DIFFERE, modele.Type_couleur.ROUGE));
        }
        for(i=0; i<3;i++) {
            liste_effet.add(new Effet(Type_effet.DAUPHIN, modele.Type_couleur.ROUGE));
        }
        liste_effet.add(new Effet(Type_effet.SERPENT_MER, modele.Type_couleur.ROUGE));
        liste_effet.add(new Effet(Type_effet.REQUIN_DIFFERE, modele.Type_couleur.ROUGE));
        liste_effet.add(new Effet(Type_effet.BALEINE_DIFFERE, modele.Type_couleur.ROUGE));
        liste_effet.add(new Effet(Type_effet.ANTI_REQUIN, modele.Type_couleur.ROUGE));
        return liste_effet;
    }

    /**
     * Cette m�thode permet de cr�er les tuiles avec les effets foret
     * @return List Effet la liste des effets
     */
    public static  List<Effet> creation_effets_foret(){
        int i;
        List<Effet> liste_effet = new ArrayList<>();
        for(i=0; i<2;i++) {
            liste_effet.add(new Effet(Type_effet.BALEINE_IMMEDIAT, modele.Type_couleur.VERT));
        }
        for(i=0; i<2;i++) {
            liste_effet.add(new Effet(Type_effet.REQUIN_IMMEDIAT, modele.Type_couleur.VERT));
        }
        for(i=0; i<3;i++) {
            liste_effet.add(new Effet(Type_effet.BATEAU_IMMEDIAT, modele.Type_couleur.VERT));
        }
        for(i=0; i<3;i++) {
            liste_effet.add(new Effet(Type_effet.TOURBILLON, modele.Type_couleur.VERT));
        }
        liste_effet.add(new Effet(Type_effet.DAUPHIN, modele.Type_couleur.ROUGE));
        liste_effet.add(new Effet(Type_effet.SERPENT_MER, modele.Type_couleur.ROUGE));
        liste_effet.add(new Effet(Type_effet.REQUIN_DIFFERE, modele.Type_couleur.ROUGE));
        liste_effet.add(new Effet(Type_effet.BALEINE_DIFFERE, modele.Type_couleur.ROUGE));
        liste_effet.add(new Effet(Type_effet.ANTI_REQUIN, modele.Type_couleur.ROUGE));
        for(i=0; i<2;i++) {
            liste_effet.add(new Effet(Type_effet.ANTI_BALEINE, modele.Type_couleur.ROUGE));
        }
        return liste_effet;
    }

    /**
     * Cette m�thode permet de cr�er les tuiles avec les effets montagne
     * @return List Effet la liste des effets
     */
    public static List<Effet> creation_effets_montagne(){
        int i;
        List<Effet> liste_effet = new ArrayList<>();
        liste_effet.add(new Effet(Type_effet.REQUIN_IMMEDIAT, modele.Type_couleur.VERT));
        for(i=0; i<4;i++) {
            liste_effet.add(new Effet(Type_effet.TOURBILLON, modele.Type_couleur.VERT));
        }
        liste_effet.add(new Effet(Type_effet.VOLCAN, modele.Type_couleur.VERT));
        liste_effet.add(new Effet(Type_effet.ANTI_REQUIN, modele.Type_couleur.ROUGE));
        liste_effet.add(new Effet(Type_effet.ANTI_BALEINE, modele.Type_couleur.ROUGE));

        return liste_effet;
    }



}
