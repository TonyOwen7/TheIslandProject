
public class Explorateur extends Pion {
    private int valeur;
    private typeCouleur couleur;
    private boolean pion_place;

  
    // Constructeur
    public Explorateur(int valeur, typeCouleur couleur, boolean pion_place, int nb_case_parcourable, int position,
        int coord_x, int coord_y) {
      super(nb_case_parcourable, position, coord_x, coord_y);
      this.valeur = valeur;
      this.couleur = couleur;
      this.pion_place = pion_place;
    }
  
    // Getters et Setters
    public int getValeur() {
      return valeur;
    }
  
    public void setValeur(int valeur) {
      this.valeur = valeur;
    }
  
    public typeCouleur getCouleur() {
      return couleur;
    }
  
    public void setCouleur(typeCouleur couleur) {
      this.couleur = couleur;
    }
  
    public boolean getPion_place() {
      return pion_place;
    }
  
    public void setPion_place(boolean pion_place) {
      this.pion_place = pion_place;
    }
  
    // Méthodes
    @Override
  
    public void deplacer(int x, int y) {




      System.out.println("Explorateur déplacé");
    }
  
    public void deplacer_limite() {

      

      System.out.println("Explorateur déplacé");
    }
  
    
    public boolean is_pion_place() {
        return pion_place;
      }  
    

    public void nager_avec_dauphin(int dest_x, int dest_y){



        System.out.println("Explorateur nage avec dauphin");
    }

    public boolean est_nageur(){

        boolean val=false;
        if (getCoord_x()>=0 && getCoord_x()<=4 && getCoord_y()>=0 && getCoord_y()<=4){  //a remplacer avec les cordonnées de la plage qui elle augmante a chaque fois 
            val=true;
        }                                                                                //il faut aussi avoir les cordonnes de toute la surface de la plage 
        return val;

    }
    public boolean deplacement_possible(int x,int y ){
        boolean val=false;
        
        if (!est_nageur())
            if (getCoord_x()+3>=x && getCoord_y()+3>=y ){  //a remplacer avec les positions de de la plage qui elle augmante a chaque fois 
                val=true;
                 }  
        
                                                                                         //il faut aussi avoir les cordonnes de toute la surface de la plage 
        return val;                                    //et on peut definir les positons en fonction des tuiles de telle 

    };                                                //sortes que une surface corespond a une position numeroté et a nous de definir la repartition des tuiles 
                                                      //du haut vers le bas et de gauches a droite 

    public  boolean est_sur_ile(){
    boolean val=false;
    if (getCoord_x()>=0 && getCoord_x()<=4 && getCoord_y()>=0 && getCoord_y()<=4){  //a remplacer avec les cordonnées ddes iles 
        val=true;
    }
    return val;
    
    }

  
    
  
    
  }
  