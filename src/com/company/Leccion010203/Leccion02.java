package com.company.Leccion010203;

public class Leccion02 {
    public static void main(String[] args) {

        String tipoIva;
        double precio=110d;

        System.out.println("Precio con iva General " + precioConIva(precio, "General"));
        System.out.println("Precio con iva Reducido " + precioConIva(precio, "Reducido"));
        System.out.println("Precio con iva Superreducido " + precioConIva(precio, "Superreducido"));

    }

    private static double precioConIva (double importe, String tipoIva) {
        switch (tipoIva){
            case "General":
                return importe * 1.21;
            case "Reducido":
                return importe * 1.10;
            case "Superreducido":
                return importe * 1.04;
            default:
                return 0;
        }
    }
}
