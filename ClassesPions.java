import java.util.*;

class Position
{
    private int abscisse, ordonne;

    public Position(int abscisse, int ordonne)
    {
        this.abscisse = abscisse;
        this.ordonne = ordonne;
    }

    public int getAbscisse(){
        return this.abscisse;
    }

    public int getOrdonne(){
        return this.ordonne;
    }

    public void setAbscisse(int x){
        this.abscisse = x;
    }

    public void setOrdonne(int y){
        this.ordonne = y;
    }
}


// J'ai fait la classe Pions de type abstrait, car le pions est définie par son type
// d'ou l'utilité de l'abstraction //

abstract class Pions
{
    private String couleur; // Car tous les pions ont des couleurs //
    private Position position;
    private int nb_case_parcourable;
    private Boolean Est_sur_plateau; // sert à verifier si un pion est sur le plateau du jeu ou pas //

    public String getCouleur(){
        return this.couleur;
    }

    public Position getPosition(){
        return this.position;
    }

    public Boolean getEstsurplateau(){
        return this.Est_sur_plateau;
    }

    //abstract void deplacer(Position destination); 

    // la méthode deplacer est une méthode abstrait, car son implémentation depend du type
   // de pion, et je l'ai pas implémenter car c'est trops liée à la modélisation du plateau du jeu

    public void setCouleur(String couleur){
        this.couleur = couleur;
    }

    public void setPosition(Position p){
        this.position.setAbscisse(p.getAbscisse());
        this.position.setOrdonne(p.getOrdonne());
    }

    public void setEstsurplateau(Boolean statue){
        this.Est_sur_plateau = statue;
    }

}

class Explorateur extends Pions
{
    private int valeur;
    private Boolean pion_place;
    private Boolean nageur;

    public Explorateur(String couleur, int valeur, Boolean pion_place){
        this.setCouleur(couleur);
        this.valeur = valeur;
        this.pion_place = pion_place;
        this.nageur = false;  // Car un explorateur n'est pas un nageur par défaut //
        this.setEstsurplateau(false); // car au début de chaque partie les pions ne sont pas sûr le plateau du jeu //
    }

    public int getValeur(){
        return this.valeur;
    }

    public Boolean getPionplace(){
        return this.pion_place;
    }

    public void setValeur(int valeur){
        this.valeur = valeur;
    }

    public void Isplace(Boolean pion_place){
        this.pion_place = pion_place;
    }

    public Boolean Estnageur(){
        return this.nageur;
    }

    public void RendNageur(){
        // Sert à transformer un explorateur en un nageur //
        this.nageur = true;
    }

}

class Bateau extends Pions
{
    Explorateur[] explorateurs_au_bord; // Car sont exclusivement les explorateurs qui peuvent etre au bord//

    public Bateau()
    {
        this.setCouleur("gris"); // car on a un seul couleur pour tous les bateaux //
        this.explorateurs_au_bord = new Explorateur[3];
    }

    public int nb_explorateurs_bord(){
        return this.explorateurs_au_bord.length;
    }

    public boolean est_vide(){
        return this.explorateurs_au_bord.length == 0;
    }

    public void ajouter_explorateur(Explorateur explorateur)
    {
        if(this.explorateurs_au_bord.length == 3){
            System.out.println("Le bateau est ddéjà plein");
        }

        Explorateur[] nv_liste = new Explorateur[this.explorateurs_au_bord.length + 1];

        for(int i = 0; i < this.explorateurs_au_bord.length; i++)
        {
            nv_liste[i] = this.explorateurs_au_bord[i];
        }
        nv_liste[this.explorateurs_au_bord.length] = explorateur;
        this.explorateurs_au_bord = nv_liste;
    }

    public void retirer_explorateur(Explorateur explorateur)
    {
        Explorateur[] nv_liste = new Explorateur[3];
        for(int i = 0; i < this.explorateurs_au_bord.length; i++)
        {
            if(this.explorateurs_au_bord[i] != explorateur) nv_liste[i] = this.explorateurs_au_bord[i];
        }

        this.explorateurs_au_bord = nv_liste;

    }
}

class SerpentMer extends Pions
{
    public SerpentMer(String couleur)
    {
        this.setCouleur(couleur);
    }
}

class Baleine extends Pions
{
    public Baleine(String couleur)
    {
        this.setCouleur(couleur);
    }
}

class Requin extends Pions
{
    public Requin(String couleur)
    {
        this.setCouleur(couleur);
    }
}