package testveicolo;

public class AutoveicoloGasolio extends AutoveicoloTradizionale {

    public AutoveicoloGasolio(String marca, String modello, String targa, int anno, int potenza, int passeggeri) {
        super(marca, modello, targa, anno, potenza, passeggeri);
        super.alimentazione = "gasolio";
    }

}
