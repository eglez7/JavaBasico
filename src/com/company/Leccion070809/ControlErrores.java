package com.company.Leccion070809;

public class ControlErrores {
    public static void main(String[] args) {
        // 8. Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException que será capturada por su llamante (desde "main", por ejemplo). Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código".
        dividiendoPorCero();
    }

    static void dividiendoPorCero() {
        try {
            System.out.println(divideDosNumeros(5, 0));
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse");
        } finally {
            System.out.println("Demo de código");
        }
    }

    private static double divideDosNumeros(int numeroA, int numeroB) throws ArithmeticException {
        double resultado = 0;
        try {
            resultado = numeroA / numeroB;
        } catch (ArithmeticException e) {
            throw new ArithmeticException();
        }
        return resultado;

    }
}
