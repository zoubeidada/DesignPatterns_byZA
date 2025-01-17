package fr.cytech.menu;

public class IteratorCarteB implements MenuIterator {
    private CarteB carteB;
    private int index=-1;
    public IteratorCarteB(CarteB carteB) {
            this.carteB=carteB;
    }

    @Override
    public boolean hasNext() {
        //if(index==-1 && carteA.getListMenu().size()==0) return false;
        return ((index+1)<carteB.getNbElementMenu());
    }

    @Override
    public ElementMenu next() {
        if(!hasNext())return null;
        return (carteB.getListMenu())[++index];
    }

}
