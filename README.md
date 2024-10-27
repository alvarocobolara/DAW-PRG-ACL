# Proyecto de Ecuación de Segundo Grado en Java

<h2>Apartado 1: Creación de un programa en Java utilizando una única clase</h2>

<h3>Descripción</h3>
<p>
  Este proyecto es un programa en Java que solicita los coeficientes de una 
  ecuación de segundo grado y muestra sus soluciones reales. Si no existen 
  soluciones reales, el programa muestra un mensaje indicando esta situación.
</p>

<h3>Código Implementado</h3>

<pre>
<code>
package com.mycompany.cobo_lara_alvaro_prg01_ut01;

// Se añade la libreria Scanner para poder pedir información por pantalla
import java.util.Scanner;

// Se añade la biblioteca DecimalFormat para formatear los decimales de la operación
import java.text.DecimalFormat;

/**
 * Programa para resolver ecuaciones de segundo grado.
 * Solicita los coeficientes de la ecuación y calcula las soluciones reales.
 *
 * @author Alvaro Cobo Lara
 */
public class COBO_LARA_ALVARO_PRG01_UT01 {
    public static void main(String[] args) {
        // Se crea un objeto de la clase Scanner
        Scanner sc = new Scanner(System.in);
        
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
        final String SOLUCION_1 = "Solución 1: ";
        final String SOLUCION_2 = "Solución 2: ";
        final String SOLUCION_REAL = "Solución real: ";
        final String SIN_SOLUCION = "La ecuación de segundo grado no tiene soluciones reales.";
        
        // Se crea un objeto de la clase DecimalFormat, en este caso se hará uso de un formato de dos decimales
        DecimalFormat df = new DecimalFormat("0.00");
        
        // Calculamos el discriminante, es decir, la parte dentro de la raiz de la ecuación de segundo grado
        double discriminante = Math.pow(b, 2) - 4 * a * c;
        System.out.println("Discriminante: " + df.format(discriminante));
        
        if (discriminante < 0) {
            System.out.println(SIN_SOLUCION);
        } else if (discriminante == 0) {
            double x = -b / (2 * a);
            System.out.println(SOLUCION_REAL + df.format(x));
        } else {
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println(SOLUCION_1 + df.format(x1));
            System.out.println(SOLUCION_2 + df.format(x2));
        }
    }
}
</code>
</pre>

<h3>Ejecución del Programa</h3>
<p>
  Al ejecutar el programa, el usuario será solicitado a introducir los coeficientes 
  de la ecuación de segundo grado:
</p>
<pre>
1. Introduce a (coeficiente de x^2): 1
2. Introduce b (coeficiente de x): -3
3. Introduce c (término independiente): 2
</pre>
<p>
  El programa calculará las soluciones y mostrará:
</p>
<pre>
Discriminante: 1.00
Solución 1: 2.00
Solución 2: 1.00
</pre>
<p>
  Si el discriminante es negativo, el programa mostrará:
</p>
<pre>
¡Oh no! La ecuación de segundo grado no tiene soluciones reales :(
</pre>

<h3>CRITERIOS DE CALIFICACIÓN</h3>
<ul>
  <li>Apartado 1, mostrando el código implementado y explicado: 4 puntos.</li>
  <li>Apartado 1, mostrando la ejecución del programa implementado y explicado: 4 puntos.</li>
  <li>Aportaciones propias que enriquezcan la solución: 1 punto.</li>
  <li>Documento elaborado de forma limpia y clara, bien redactado y sin faltas de ortografía: 1 punto.</li>
</ul>

<h3>Conclusión</h3>
<p>
  Este programa es una solución completa para calcular y mostrar las soluciones de 
  una ecuación de segundo grado, implementado de manera limpia y clara, asegurando 
  una correcta comprensión y ejecución.
</p>
