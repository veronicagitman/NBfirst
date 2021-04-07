package testveicolo;

public class Motoveicolo extends Veicolo {

    static double EuroPerHP = 1.5;

    public Motoveicolo(String marca, String modello, String targa, int anno, int potenza, int passeggeri) {
        super(marca, modello, targa, anno, potenza, passeggeri);
        super.alimentazione = "benzina";
    }

    double getTassa(int anno) {
        return Motoveicolo.EuroPerHP * super.getPotenza();
    }

}
