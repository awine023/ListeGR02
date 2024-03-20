public class Noeud {
    public int valeur;
    public Noeud prochain;

    @Override
    public String toString() {
        return String.valueOf(valeur);
    }
}
