//Rubén Molina Pavón 1ºDAW1 
import java.util.Scanner;

public class Calculadora {

        // Versión 1.0 - Práctica de Entornos de Desarrollo    public static void main(String[] args) {
    public static void main(String[] args) {

        /* Se asegura de cerrar el Scanner de forma automática al terminar de usarlo */
        try (Scanner scanner = new Scanner(System.in)) {
            double num1, num2, resultado;
            int operacion;
            
            System.out.println("=== CALCULADORA BÁSICA EN JAVA. ===");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Potencia");
            System.out.println("6. Raíz Cuadrada");
            System.out.print("Elige una operación (1-6): ");
            operacion = scanner.nextInt();
            
			System.out.print("Ingresa el primer número: ");
            num1 = scanner.nextDouble();
			
			System.out.print("Ingresa el segundo número: ");
            num2 = scanner.nextDouble();

            switch (operacion) {
                case 1 -> {
                    resultado = num1 + num2;
                    System.out.println("Resultado: " + num1 + " + " + num2 + " = " + resultado);
                }
                case 2 -> {
                    resultado = num1 - num2;
                    System.out.println("Resultado: " + num1 + " - " + num2 + " = " + resultado);
                }
                case 3 -> {
                    resultado = num1 * num2;
                    System.out.println("Resultado: " + num1 + " * " + num2 + " = " + resultado);
                }
                case 4 -> {
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.println("Resultado: " + num1 + " / " + num2 + " = " + resultado);
                         System.err.println();
                    } else {
                        System.out.println("Error: No se puede dividir entre cero.");
                         }
                }
                case 5 -> {
                    resultado = Math.pow(num1, num2);
                    System.out.println("Resultado: " + num1 + " ^ " +  num2 + " = " + resultado);
                }
                 case 6 -> {
                   if (num1 >= 0) {
                        resultado = Math.sqrt(num1);
                        System.out.println("Resultado: √" + num1 + " = " + resultado);
                    } else {
                        System.out.println("Error: No se puede calcular la raíz cuadrada de un número negativo.");
                    }
                }           
            }
        } // Aquí finaliza el bloque 'try' y el scanner se cierra solo, ya no hace falta "scanner.close()"
    }
}
