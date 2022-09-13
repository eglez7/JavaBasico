package com.company;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        invertirCadena();
        ejemploArray();
        ejemploArrayList();
        ejemploLinkedList();
        ejemploBigDecimal();
        ejemploMapa();


    }

    private static void ejemploMapa() {
        HashMap<Integer, String> mapa=new HashMap<>();

        mapa.put(1,"Clave1");
        mapa.put(2,"Clave2");
        mapa.put(3,"Clave3");
        mapa.put(3,"Clave4");
        System.out.println(mapa);

        System.out.println(mapa.get(2));
        System.out.println(mapa.size());

        for (Map.Entry elemento : mapa.entrySet()){
            System.out.println(elemento.getKey() + " " + elemento.getValue());
        }
    }

    private static void ejemploBigDecimal() {
        BigDecimal valorA = new BigDecimal(1.1f);
        BigDecimal valorB = new BigDecimal(0.1f);

        valorA.multiply(valorB);
        System.out.println(valorA);
    }

    private static void ejemploLinkedList() {
        LinkedList<String>listaEnlazada=new LinkedList<String>();


    }

    private static void ejemploArrayList() {
        ArrayList<String> lista=new ArrayList<String>();

        lista.add("A");
        lista.add("B");
        lista.add("C");
        lista.add("D");

        System.out.println(lista + " " + lista.size());

        lista.remove("B");
        System.out.println(lista + " " + lista.size());

        lista.remove(2);
        System.out.println(lista + " " + lista.size());
    }

    private static void ejemploArray() {
        int arrayUno[] = new int[6];

        //rellenando arr
        for (int i = 0; i < arrayUno.length; i++) {
            arrayUno[i]=i*10;
        }

        //mostrando array
        for (int i = 0; i < arrayUno.length; i++) {
            System.out.println(arrayUno[i]);
        }
    }

    private static void invertirCadena() {
        String prueba = "cadena";
        String resultado = "";
        System.out.println(prueba);

        for (int i = prueba.length() - 1; i >= 0; i--) {
            resultado = resultado.concat(String.valueOf(prueba.charAt(i)));
        }
        System.out.println(resultado);
    }
}
