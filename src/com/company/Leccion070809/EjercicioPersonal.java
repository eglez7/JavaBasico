package com.company.Leccion070809;

import java.io.*;

public class EjercicioPersonal {

    public static final String FICHERO_TXT = "fichero.txt";

    public static void main(String[] args) {
        // 10. Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream, excepciones, un HashMap y un ArrayList, LinkedList o array.

        try {
            FileWriter ficheroOUT = new FileWriter(FICHERO_TXT);
            BufferedWriter ficheroOUTBuffer = new BufferedWriter(ficheroOUT);
            ficheroOUTBuffer.write("Esto es una prueba");
            ficheroOUTBuffer.newLine();
            ficheroOUTBuffer.write("Esto es otra una prueba");
            ficheroOUTBuffer.flush();
            ficheroOUT.close();

            FileReader ficheroIN = new FileReader(FICHERO_TXT);
            BufferedReader ficheroINBuffer = new BufferedReader(ficheroIN);


            String linea =ficheroINBuffer.readLine();
            while(linea != null){
                System.out.println(linea);
                linea=ficheroINBuffer.readLine();
            }


            ficheroIN.close();

        } catch (IOException e) {
            System.out.println("Error E/S: " + e);
        }


    }
}
