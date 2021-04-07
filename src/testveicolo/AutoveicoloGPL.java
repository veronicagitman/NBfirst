package testveicolo;

public class AutoveicoloGPL extends AutoveicoloGas {

    static double EuroPerHP = 0.5;

    public AutoveicoloGPL(String marca, String modello, String targa, int anno, int potenza, int passeggeri) {
        super(marca, modello, targa, anno, potenza, passeggeri);
        super.alimentazione = "GPL";
    }

    double getTassa(int anno) {
        double tassa = 0.0;

        if ((anno - super.anno) > 5) {
            tassa = EuroPerHP * super.getPotenza();
        }
        return tassa;
    }
}
