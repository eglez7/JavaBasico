package com.company;

public class Leccion03 {
    public static void main(String[] args) {

        String[] nombres = {"Pedro", "Mario", "Julia", "Isabel", "María"};
        String resultadoFinal = "";

        System.out.println("Método con el operador +");
        for (String nombre : nombres) {
            resultadoFinal = resultadoFinal + " " + nombre;
        }
        System.out.println(resultadoFinal);

        resultadoFinal = "";
        System.out.println("Método con la función concat");
        for (String nombre : nombres) {
            resultadoFinal = resultadoFinal.concat(" ");
            resultadoFinal = resultadoFinal.concat(nombre);
//            resultadoFinal=resultadoFinal+" " + nombre;
        }
        System.out.println(resultadoFinal);
    }
}
