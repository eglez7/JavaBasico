package com.company.Leccion04;

public class SmartPhone  extends SmartDevice{
    double tamanoPantalla;
    boolean plegable;

    public SmartPhone() {
    }

    public SmartPhone(String marcaDispositivo, String modeloDispositivo, double tamanoPantalla, boolean plegable) {
        super(marcaDispositivo, modeloDispositivo);
        this.tamanoPantalla = tamanoPantalla;
        this.plegable = plegable;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "tamanoPantalla=" + tamanoPantalla +
                ", plegable=" + plegable +
                ", marcaDispositivo='" + marcaDispositivo + '\'' +
                ", modeloDispositivo='" + modeloDispositivo + '\'' +
                '}';
    }
}
