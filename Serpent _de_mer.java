public class Serpent_de_mer extends Pion {
    

    public Serpent_de_mer(int nb_case_parcourable, int position, int coord_x, int coord_y) {

        super(nb_case_parcourable, position, coord_x, coord_y);

    }

    @Override
    public void deplacer(int x, int y) {
        setCoord_x(x);
        setCoord_y(y);
        System.out.println("Serpent de mer déplacé");

    }

    public boolean deplacement_possible(int x, int y) {
        if (x == this.getCoord_x() && y == this.getCoord_y()) {
            return false;// a implementer corectement

        }
        return true;
    }

    public void deplacer_limite() {
        // implémentation de la méthode
    }

    public void Serpent_vide_case(Explorateur explorateur) {
        explorateur.setCoord_x(-1);
        explorateur.setCoord_y(-1);
        explorateur.setPion_place(false);
        System.out.println("Explorateur tué");
    }

   


}