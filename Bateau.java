import java.util.List;


public class Bateau extends Pion {

        private  typeCouleur couleur_majoritaire;
        private List <Pion> pion_a_bord;
        private typeCouleur couleur;


        public Bateau(typeCouleur couler_majoritaire,List <Pion> pion_a_bord, typeCouleur couleur, int nb_case_parcourable, int position, int coord_x, int coord_y) {
            super(nb_case_parcourable, position, coord_x, coord_y);
        }


    



        // Getters and Setters
        public typeCouleur getCouler_majoritaire() {
            return couleur_majoritaire;
        }

        public void setCouler_majoritaire(typeCouleur couler_majoritaire) {
            this.couleur_majoritaire = couler_majoritaire;
        }

        public List<Pion> getPion_a_bord() {
            return pion_a_bord;
        }

        public void setPion_a_bord(List<Pion> pion_a_bord) {
            this.pion_a_bord = pion_a_bord;
        }

        public typeCouleur getCouleur() {
            return couleur;
        }

        @Override
        public void deplacer(int x, int y) {     //se deplacer au cordonée du click de la souris 
           
           setCoord_x(x);
           setCoord_y(y);
           for (Pion pion : pion_a_bord) {
               pion.setCoord_x(x);
               pion.setCoord_y(y);
           }
            System.out.println("Bateau déplacé");
        }

        public void deplacer_limite() {
            
            
        }
        
        public void ajouter_pion_bateau(Pion pion){
        
        }

        public void retirer_pion_bateau(Pion pion){


        
        }

        public boolean deplacement_possible(int x,int y ){
            //a implementer
            return true;
        }

       public void deplacer_bateau( int coord_x, int coord_y){
        
       }

       public  void nb_pion_bateau(){
            
       };
}