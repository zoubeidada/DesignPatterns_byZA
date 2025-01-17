package fr.cytech.arbre;

import java.util.LinkedList;
import java.util.Queue;

public class IteratorEnLargeur implements Iterator {
    private Queue<Element> queue;

    // Constructeur
    public IteratorEnLargeur(Arbre arbre) {
        queue = new LinkedList<>();
        queue.add(arbre);
    }

    @Override
    public boolean hasNext() {
        return !queue.isEmpty();
    }

    @Override
    public Element next() {
        if (!hasNext()) {
            throw new IllegalStateException("Il n'y a plus d'éléments à parcourir.");
        }

        // Récupérer l'élément en tête de file
        Element current = queue.poll();

        // Si c'est un arbre, on ajoute ses enfants à la file
        if (current instanceof Arbre) {
            Arbre arbre = (Arbre) current;
            queue.addAll(arbre.getChildren());
        }

        return current;
    }
}
