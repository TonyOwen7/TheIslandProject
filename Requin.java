public class Requin extends Pion {
   
   
   
    public Requin(int nb_case_parcourable, int position,
                    int coord_x, int coord_y) {

        super(nb_case_parcourable, position, coord_x, coord_y);

    }

    @Override
    public void deplacer(int x, int y) {
        setCoord_x(x);
        setCoord_y(y);
        System.out.println("Requin déplacé");
        

    }
    public boolean deplacement_possible(int x ,int y){
        if (x == this.getCoord_x() && y == this.getCoord_y()) {
            return false;//a implementer corectement
            
        }
        return true;
    }
    public void deplacer_limite() {
        // implémentation de la méthode
    }
    public void  tue_explorateur(Explorateur explorateur){
        explorateur.setCoord_x(-1);
        explorateur.setCoord_y(-1);
        explorateur.setPion_place(false);
        System.out.println("Explorateur tué");
    }
    public void  coule_bateau(Bateau bateau){
        bateau.setCoord_x(-1);
        bateau.setCoord_y(-1);
        System.out.println("Bateau tué");
    }



}