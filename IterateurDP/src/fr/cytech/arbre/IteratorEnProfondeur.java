package fr.cytech.arbre;

import java.util.Stack;

public class IteratorEnProfondeur implements Iterator {
    private Stack<Element> stack;

    // Constructeur
    public IteratorEnProfondeur(Arbre arbre) {
        stack = new Stack<>();
        stack.push(arbre);
    }

    @Override
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    @Override
    public Element next() {
        if (!hasNext()) {
            throw new IllegalStateException("Il n'y a plus d'éléments à parcourir.");
        }

        // Récupérer l'élément en haut de la pile
        Element current = stack.pop();

        // Si c'est un arbre, on empile ses enfants (dans l'ordre inverse pour respecter DFS)
        if (current instanceof Arbre) {
            Arbre arbre = (Arbre) current;
            for (int i = arbre.getChildren().size() - 1; i >= 0; i--) {
                stack.push(arbre.getChildren().get(i));
            }
        }

        return current;
    }
}
