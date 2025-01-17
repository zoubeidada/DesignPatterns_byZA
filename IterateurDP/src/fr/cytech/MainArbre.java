package fr.cytech;

import fr.cytech.arbre.Arbre;
import fr.cytech.arbre.Element;
import fr.cytech.arbre.Iterator;
import fr.cytech.arbre.Parcours;

public class MainArbre {
    public static void main(String[] args){
        System.out.println("========= composite Arbre affichage avec toString==================");
        Arbre arbre=new Arbre("racine");
        Arbre ssArbre1=new Arbre("enfant1 avec enfants");
        ssArbre1.addChild(new Element("petit-enfant 1.1 ss enfant"));
        ssArbre1.addChild(new Element("petit-enfant 1.2 ss enfant"));
        arbre.addChild(ssArbre1);
        Arbre ssArbre2=new Arbre("enfant2 avec enfants");
        ssArbre2.addChild(new Element("petit-enfant 2.1 ss enfant"));
        arbre.addChild(ssArbre2);
        arbre.addChild(new Element("enfant3 ss enfant"));
        System.out.println(arbre);

        //test iterateur en profondeur

        System.out.println("========= composite Arbre affichage avec parcours en profondeur==================");
        Iterator iterator= arbre.createIterator(Parcours.PROFONDEUR);
        int i=0;
        while(iterator.hasNext()) {
            System.out.println("element " +(i+1)+" : "+ iterator.next().getLibelle());
            i++;
        }
        System.out.println("========= composite Arbre affichage avec parcours en largeur==================");
        iterator= arbre.createIterator(Parcours.LARGEUR);
        i=0;
        while(iterator.hasNext()) {
            System.out.println("element " +(i+1)+" : "+ iterator.next().getLibelle());
            i++;
        }
    }
}
