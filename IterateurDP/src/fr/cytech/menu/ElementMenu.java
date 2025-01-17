package fr.cytech.menu;

public class ElementMenu {
    private double prix;
    private String libelle;

    public ElementMenu(double prix, String libelle) {
        this.prix = prix;
        this.libelle = libelle;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @Override
    public String toString() {
        return "ElementMenu{" +
                "prix=" + prix +
                ", libelle='" + libelle + '\'' +
                '}';
    }
}
