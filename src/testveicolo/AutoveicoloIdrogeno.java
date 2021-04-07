package testveicolo;

public class AutoveicoloIdrogeno extends AutoveicoloGas {

    static double EuroPerHPanno = 0.1;

    public AutoveicoloIdrogeno(String marca, String modello, String targa, int anno, int potenza, int passeggeri) {
        super(marca, modello, targa, anno, potenza, passeggeri);
        super.alimentazione = "idrogeno";
    }

    double getTassa(int anno) {
        return (anno - super.getAnno()) * super.getPotenza() * EuroPerHPanno;
    }

}
