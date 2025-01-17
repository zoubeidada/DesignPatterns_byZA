package fr.cytech.menu;

public class IteratorCarteA implements MenuIterator {
    private CarteA carteA;
    private ElementMenu courant;
    private int index=-1;
    public IteratorCarteA(CarteA carteA) {
        this.carteA=carteA;
    }

    @Override
    public boolean hasNext() {
        //if(index==-1 && carteA.getListMenu().size()==0) return false;
        return ((index+1)<carteA.getListMenu().size());
    }

    @Override
    public ElementMenu next() {
        if(!hasNext())return null;
        return carteA.getListMenu().get(++index);
    }
}
