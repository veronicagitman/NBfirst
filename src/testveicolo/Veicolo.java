package testveicolo; 

abstract public class Veicolo {
    
    private String marca;
    private String modello;
    private String targa;
    protected int anno;
    protected int potenza;
    private int passeggeri;
    protected String alimentazione;

    public Veicolo(String marca, String modello, String targa, int anno, int potenza, int passeggeri) {
        this.marca = marca;
        this.modello = modello;
        this.targa = targa;
        this.anno = anno;
        this.potenza = potenza;
        this.passeggeri = passeggeri;
        this.alimentazione = "";
    }

    public String getAlimentazione() {
        return alimentazione;
    }

    public int getAnno() {
        return anno;
    }

    public String getMarca() {
        return marca;
    }

    public String getModello() {
        return modello;
    }

    public int getPasseggeri() {
        return passeggeri;
    }

    public int getPotenza() {
        return potenza;
    }

    public String getTarga() {
        return targa;
    }

    public String toString() {
        String s;
        s = targa+","+marca+","+modello+","+passeggeri+","+anno+","+potenza+","+alimentazione;
        return s;
    }
           
    abstract double getTassa(int anno);
    
}