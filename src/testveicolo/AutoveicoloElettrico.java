package testveicolo;

public class AutoveicoloElettrico extends Veicolo {

    public AutoveicoloElettrico(String marca, String modello, String targa, int anno, int potenza, int passeggeri) {
        super(marca, modello, targa, anno, potenza, passeggeri);
        super.alimentazione = "elettrica";
    }

    double getTassa(int anno) {
        return 0.0;
    }

}
