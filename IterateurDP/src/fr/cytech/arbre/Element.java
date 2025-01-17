package fr.cytech.arbre;

public class Element {
    private String libelle;

    public Element(String libelle) {

        this.libelle = libelle;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @Override
    public String toString() {
        return "Element{" +
                "libelle='" + libelle + '\'' +
                '}';
    }

    protected String toString(String tab) {
        return "\n"+tab+"Element{" +
                "libelle='" + getLibelle() + "'" ;
     }
}
