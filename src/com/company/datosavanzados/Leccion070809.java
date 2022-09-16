package com.company.datosavanzados;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Leccion070809 {
    public static void main(String[] args) {
        /*

        Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException que será capturada por su llamante (desde "main", por ejemplo). Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código".
        Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut". La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".
        Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream, excepciones, un HashMap y un ArrayList, LinkedList o array.
         */

        // 1. Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".
        //reverse("Hola Mundo");

        // 2. Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
        //ejemploArray();

        // 3. Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.
        //ejemploArray2();

        // 4. Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.
        //ejecicioVector();

        // 5. Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.
        /*
        Cada vez que el vector alcanza su capacidad máxima y la supera, crea un nuevo array con el doble de capacidad.
        Si añadimos un nuevo elemento al vector con 1000 elementos, creará otro de 2000, existiendo por un momento 2 arrays en memoria y consumiendo recursos computacionales por duplicado.
         */

        // 6. Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.
        //ejemploArrayList();

        // 7. Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10.
        // A continuación, con otro bucle, recórrelo y elimina los numeros pares.
        // Por último, vuelve a recorrerlo y muestra el ArrayList final.
        // Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.
        //ejemploArrayList2();


    }

    private static void ejemploArrayList2() {
        ArrayList<Integer> arrayNumeros=new ArrayList<>();
        for (int i = 0; i<10;i++){
            arrayNumeros.add(i+1);
        }
        System.out.println("ArrayList original: " + arrayNumeros);

        for (int i = arrayNumeros.size() -1; i>=0;i--){
            if (arrayNumeros.get(i) % 2 == 0){
                arrayNumeros.remove(i);
            }
        }
        System.out.println("ArrayList sin pares: " + arrayNumeros);

        for (int i = 0; i<arrayNumeros.size() -1;i++){
            System.out.println(arrayNumeros.get(i));
        }
    }

    private static void ejemploArrayList() {
        ArrayList<String> lista=new ArrayList<String>();

        lista.add("A");
        lista.add("B");
        lista.add("C");
        lista.add("D");

        LinkedList<String> listaEnlazada=new LinkedList<>(lista);

        System.out.println(lista);
        System.out.println(listaEnlazada);
    }

    private static void ejecicioVector() {
        Vector<String> nuevoVector = new Vector<String>();
        for (int i = 0; i < 5; i++) {
            nuevoVector.add("Elemento " + i);
        }

        nuevoVector.remove(2);
        nuevoVector.remove(3);

        System.out.println(nuevoVector);

        System.out.println(nuevoVector.capacity());
        System.out.println(nuevoVector.size());
    }

    private static void ejemploArray2() {
        int[][] arrayDos = new int[3][3];

        // rellenando array
        for (int i = 0; i < arrayDos.length; i++) {
            for (int j = 0; j < arrayDos.length; j++) {
                arrayDos[i][j] = i * j;
            }
        }

        // mostrando array
        for (int i = 0; i < arrayDos.length; i++) {
            for (int j = 0; j < arrayDos.length; j++) {
                System.out.println("Posición: " + i + "-" + j + ": " + arrayDos[i][j]);
            }
        }
    }

    public static String reverse(String cadena) {
        String resultado = "";

        for (int i = cadena.length() - 1; i >= 0; i--) {
            resultado = resultado.concat(String.valueOf(cadena.charAt(i)));
        }

        System.out.println(cadena);
        System.out.println(resultado);

        return resultado;
    }

    public static void ejemploArray() {
        String arrayUno[] = new String[6];

        // rellenando array
        for (int i = 0; i < arrayUno.length; i++) {
            arrayUno[i] = "Posición: " + i;
        }

        // mostrando array
        for (int i = 0; i < arrayUno.length; i++) {
            System.out.println(arrayUno[i]);
        }
    }


}
