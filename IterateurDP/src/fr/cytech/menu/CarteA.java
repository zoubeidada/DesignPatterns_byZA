package fr.cytech.menu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CarteA implements MenuIterable{

    private List<ElementMenu> listMenu;

    public CarteA() {
        this.listMenu = new ArrayList<>();
        listMenu.add(new ElementMenu(3.0,"boisson gazeuse"));
        listMenu.add(new ElementMenu(12.5,"Pâtes bolognaises"));
        listMenu.add(new ElementMenu(11.0,"Salade César"));
        listMenu.add(new ElementMenu(6.9,"Tarte aux pacanes"));
    }

    @Override
    public MenuIterator createMenuIterator() {
        return new IteratorCarteA(this);
    }

    List<ElementMenu> getListMenu() {
        return listMenu;
    }
    public void addElementMenu(ElementMenu eMenu){
        listMenu.add(eMenu);
    }

}
