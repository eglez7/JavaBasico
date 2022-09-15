package com.company.datosavanzados;

public class Leccion070809 {
    public static void main(String[] args) {
        /*

        Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.
        Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.
        Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación, con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra el ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.
        Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException que será capturada por su llamante (desde "main", por ejemplo). Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código".
        Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut". La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".
        Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream, excepciones, un HashMap y un ArrayList, LinkedList o array.
         */

        // 1. Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".
        reverse("Hola Mundo");

        // 2. Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
        ejemploArray();

        // 3. Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.
        ejemploArray2();

        // 4. Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.

    }

    private static void ejemploArray2() {
        int [] [] arrayDos = new int[3][3];

        // rellenando array
        for (int i = 0; i < arrayDos.length; i++) {
            for (int j = 0; j < arrayDos.length; j++) {
                arrayDos [i] [j]=i*j;
            }
        }

        // mostrando array
        for (int i = 0; i < arrayDos.length; i++) {
            for (int j = 0; j < arrayDos.length; j++) {
                System.out.println("Posición: " + i + "-" + j + ": " + arrayDos [i] [j]);
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
            arrayUno[i]= "Posición: " + i;
        }

        // mostrando array
        for (int i = 0; i < arrayUno.length; i++) {
            System.out.println(arrayUno[i]);
        }
    }


}
