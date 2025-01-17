import fr.cytech.menu.CarteA;
import fr.cytech.menu.CarteB;
import fr.cytech.menu.ElementMenu;
import fr.cytech.menu.MenuIterator;

public class MainMenu {
    public static void main(String[] args) {
        System.out.println("Hello DP Iterateur Menu!");
        System.out.println("_____ menu A exemple ____");
        CarteA cA=new CarteA();
        MenuIterator iterator= cA.createMenuIterator();
        System.out.println("_____ Affichage du menu A  ____");
        int i=0;
        while(iterator.hasNext()){
            i++;
            System.out.println("item du menu no "+i + ":"+iterator.next());
        }
        System.out.println("_____ menu B exemple ____");
        CarteB cB=new CarteB();
        iterator= cB.createMenuIterator();
        System.out.println("_____ Affichage du menu B  ____");
        i=0;
        while(iterator.hasNext()){
            i++;
            System.out.println("item du menu no "+i + ":"+iterator.next());
        }

    }
}