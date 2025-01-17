package fr.cytech.menu;

import java.util.ArrayList;
import java.util.List;

public class CarteB implements MenuIterable{
    private ElementMenu[] listMenu;
    private int indexCourant=0;
    public CarteB() {
        this.listMenu = new ElementMenu[10];
        addElementMenu(new ElementMenu(3.0,"boisson gazeuse"));
        addElementMenu(new ElementMenu(12.5,"Pâtes bolognaises"));
        addElementMenu(new ElementMenu(11.0,"Salade César"));
        addElementMenu(new ElementMenu(6.9,"Tarte aux pacanes"));

    }

    @Override
    public MenuIterator createMenuIterator() {
        return new IteratorCarteB(this);
    }

    ElementMenu[] getListMenu() {
        return listMenu;
    }

    public void addElementMenu(ElementMenu eMenu){
        if (indexCourant< listMenu.length) listMenu[indexCourant++]=eMenu;
    }
    public int getNbElementMenu(){return indexCourant;}

}
