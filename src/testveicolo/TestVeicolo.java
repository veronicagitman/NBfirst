package testveicolo;

public class TestVeicolo {

    static public void main(String args[]) {
        //Vector veicoli = new Vector(10);
        Veicolo veicoli[] = new Veicolo[10];
        //Object tmp;
        int anno = 2010;
        // ciao mondo!!!
        /*
        veicoli.add(new Motoveicolo("BMW","1000","LI123",2000,100,1));
        veicoli.add(new AutoveicoloBenzina("Mercedes","A","PI123",2002,150,4));
        veicoli.add(new AutoveicoloGasolio("Citroen","Picasso","LI456",2008,120,6));
        veicoli.add(new AutoveicoloMetano("FIAT","Panda","PI456",2001,70,3));
        veicoli.add(new AutoveicoloGPL("Volskwagen","Golf","LI789",2002,90,4));
        veicoli.add(new AutoveicoloIdrogeno("Mercedes","B","PI789",2008,100,4));
        veicoli.add(new AutoveicoloElettrico("Toyota","Prius","LI000",2009,110,4));
         */
        veicoli[0] = new Motoveicolo("BMW", "1000", "LI123", 2000, 100, 1);
        veicoli[1] = new AutoveicoloBenzina("Mercedes", "A", "PI123", 2002, 150, 4);
        veicoli[2] = new AutoveicoloGasolio("Citroen", "Picasso", "LI456", 2008, 120, 6);
        veicoli[3] = new AutoveicoloMetano("FIAT", "Panda", "PI456", 2001, 70, 3);
        veicoli[4] = new AutoveicoloGPL("Volskwagen", "Golf", "LI789", 2002, 90, 4);
        veicoli[5] = new AutoveicoloIdrogeno("Mercedes", "B", "PI789", 2008, 100, 4);
        veicoli[6] = new AutoveicoloElettrico("Toyota", "Prius", "LI000", 2009, 110, 4);

        /*
        for (Enumeration e = veicoli.elements(); e.hasMoreElements();) {
            tmp = e.nextElement();
            System.out.println(((Veicolo)tmp).toString());
            System.out.println(((Veicolo)tmp).getTassa(anno));
            System.out.println();
        }
         */
        for (int i = 0; i < 7; i++) {
            System.out.println(veicoli[i].toString());
            System.out.println(veicoli[i].getTassa(anno));
            System.out.println();
        }
    }

}
