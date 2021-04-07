package testveicolo;

abstract public class AutoveicoloTradizionale extends Veicolo {

    static double EuroPerHP = 2.5;

    public AutoveicoloTradizionale(String marca, String modello, String targa, int anno, int potenza, int passeggeri) {
        super(marca, modello, targa, anno, potenza, passeggeri);
    }

    double getTassa(int anno) {
        return EuroPerHP * super.getPotenza();
    }

}
