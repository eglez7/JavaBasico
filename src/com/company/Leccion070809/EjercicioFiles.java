package com.company.Leccion070809;

import java.io.*;


public class EjercicioFiles {
    public static void main(String[] args) {

        // 9. Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut". La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".
        copiarFicheros("d:/fichero.txt","d:/fichero_salida.txt");


    }

    private static void copiarFicheros(String fileIn, String fileOut) {
        try {
            InputStream fichero = new FileInputStream(fileIn);
            byte[] datos = fichero.readAllBytes();
            fichero.close();

            PrintStream ficheroSalida = new PrintStream(fileOut);
            ficheroSalida.write(datos);
            ficheroSalida.close();

        } catch (IOException e) {
            System.out.println("La has fastidiado majo " + e.getMessage());
        }
    }


}
