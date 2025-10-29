/**
 * Ejercicio01: Dada la lectura de dos números ingresados por teclado, presentar
 * las suma de los mismos
 * @author Emily Rivera
 * @version 1.0
 */
import java.util.Scanner;
public class SumaDosNumeros {
    public static void main(String[] args) {
         //Sentencias para lectura de datos
         // [Nombre-Clase-API-JDK: Scanner] [nombre-variable] [=] [Nombre-Clase-API-JDK (tipo-Entrad-Datos: System.in)]
         Scanner teclado = new Scanner (System.in);
         int num1, num2, respuesta;
         System.out.println("Dame el PRIMER número:"); //Carpintería = TUNEAR
         num1= teclado.nextInt(); //INGRESO DE DATOS DE ENTRADA
         System.out.println("Dame el SEGUNDO número:");
         num2= teclado.nextInt(); //INGRESO DE DATOS DE ENTRADA
         respuesta = num1 + num2;
         //Sentencias para escritura de resultados: sout ->
         System.out.println("La respuesta es: " + respuesta);
    }
    
}

/**
 * RUN:
 * 
 */