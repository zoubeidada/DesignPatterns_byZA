package fr.cytech.arbre;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Arbre extends Element {
    private List<Element> children;
    public Arbre(String libelle) {
        super(libelle);
        children= new ArrayList<>();
    }
    public void addChild(Element e){
        children.add(e);
    }
    public void removeChild(Element e){
        children.remove(e);
    }
    public Iterator createIterator(Parcours p){
        switch(p){
            case PROFONDEUR : return new IteratorEnProfondeur(this);
            case LARGEUR:return new IteratorEnLargeur(this);
        }
        return new IteratorEnProfondeur(this);
    }

    @Override
    public String toString() {
        String strChildren="";
        for(Element e : children)
            strChildren+=e.toString("\t");

        return "\nArbre{" +
                "libelle='" + getLibelle() + "'" +
                "children=" + strChildren+'}';
    }
    public String toString(String tab) {
        String strChildren="";
        for(Element e : children)
            strChildren+=e.toString(tab+"\t");

        return "\n"+tab+"Arbre{" +
                "libelle='" + getLibelle() + "'" +
                "children=" + strChildren+'}';
    }

    public List<Element> getChildren() {
        return children;
    }
}
