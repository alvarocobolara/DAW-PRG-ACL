package com.mycompany.cobo_lara_alvaro_prg01_ut01;

// se añade la libreria scanner para poder pedir información por pantalla
import java.util.Scanner;
// Se añade la biblioteca decimalFormat para formatear los decimales de la operación
import java.text.DecimalFormat;

/**
 * Programa para resolver ecuaciones de segundo grado.
 * Solicita los coeficientes de la ecuación y calcula las soluciones reales.
 * @author Alvaro Cobo Lara
 */
public class COBO_LARA_ALVARO_PRG01_UT01 {

    public static void main(String[] args) {
            // Se crea un objeto de la clase Scanner
        Scanner sc = new Scanner(System.in);

        // Se crea variables variable para almacenar los numeros pedidos por pantalla
        // Solicitar los coeficientes de la ecuación
        System.out.print("1. Introduce a (coeficiente de x^2): ");
        double a = sc.nextDouble();
        System.out.print("2. Introduce b (coeficiente de x): ");
        double b = sc.nextDouble();
        System.out.print("3. Introduce c (término independiente): ");
        double c = sc.nextDouble();

        // Llamada al método ecuacion
        ecuacion(a, b, c);
      }

      // Método estático para resolver la ecuación de segundo grado
      public static void ecuacion(double a, double b, double c) {
        // Se crean constantes para los strings de los resultados, así no se repite texto.
        final String SOLUCION_1 = "Solución 1: ";
        final String SOLUCION_2 = "Solución 2: ";
        final String SOLUCION_REAL = "Solución real: ";
        final String SIN_SOLUCION = "¡Oh no! La ecuación de segundo grado no tiene soluciones reales :(";

        // Se crea un objeto de la clase DecimalFormat, en este caso se hará uso de un formato de dos decimales
        DecimalFormat df = new DecimalFormat("0.00");
        // Se crea una variable para almacenar el discriminante
        // Calculamos el discriminante, es decir, la parte dentro de la raiz de la ecuación de segundo grado.
        double discriminante = Math.pow(b, 2) - 4 * a * c;
        System.out.println("Discriminante: " + df.format(discriminante));

        // Si el discriminante es negativo, no hay solución real, se muestra mensaje.
        if (discriminante < 0) {
          System.out.println(SIN_SOLUCION);
        } 
        // En cambio, si el discriminante es igual a 0, hay una única solución real
        else if (discriminante == 0) {
          double x = -b / (2 * a);
          System.out.println(SOLUCION_REAL + df.format(x));
        } 
        // Por otra parte, si el discriminante es positivo, hay dos soluciones reales distintas
        else {
          // Se calcula la solución positiva
          double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
          // Se calcula la solución negativa
          double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
          //Se hace uso de la libreria decimalFormat (df) para poder mostrar los resultados con tres decimales
          System.out.println(SOLUCION_1 + df.format(x1));
          System.out.println(SOLUCION_2 + df.format(x2));
        }
    }

}