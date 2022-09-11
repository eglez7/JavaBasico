package com.company.poo;

public class SmartWatch  extends SmartDevice{
    String formaEsfera;
    boolean bisel;

    public SmartWatch() {
    }

    public SmartWatch(String marcaDispositivo, String modeloDispositivo, String formaEsfera, boolean bisel) {
        super(marcaDispositivo, modeloDispositivo);
        this.formaEsfera = formaEsfera;
        this.bisel = bisel;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "formaEsfera='" + formaEsfera + '\'' +
                ", bisel=" + bisel +
                ", marcaDispositivo='" + marcaDispositivo + '\'' +
                ", modeloDispositivo='" + modeloDispositivo + '\'' +
                '}';
    }
}
