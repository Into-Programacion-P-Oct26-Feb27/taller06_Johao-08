/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALASC
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double dato1;
        double dato2;
        int operacion;
        double resultado;

        System.out.println("Ingrese el primer dato de la operacion");
        dato1 = entrada.nextDouble();

        System.out.println("Ingrese si quiere realizar: \n1.Suma.\n"
                + "2.Resta.\n"
                + "3.Multiplicación.\n"
                + "4.División.\n"
                + "5.Módulo (residuo de la división).\n"
                + "6.Potencia.");
        operacion = entrada.nextInt();

        System.out.println("Ingrese el segundo dato de la operacion");
        dato2 = entrada.nextDouble();

        if (dato2 > dato1) {
            System.out.println("El dato 1 debe ser "
                    + "mayor al dato 2");
        } else {
            if (operacion == 1) {
                resultado = dato1 + dato2;
                System.out.printf("OPERACIONES ARITMÉTICAS\n"
                        + "\n"
                        + "Primer número: %.2f\n"
                        + "Segundo número: %.2f\n"
                        + "Operación seleccionada: Suma\n"
                        + "\n"
                        + "Resultado: %.2f",
                        dato1,
                        dato2,
                        resultado
                );
            } else {
                if (operacion == 2) {
                    resultado = dato1 - dato2;
                    System.out.printf("OPERACIONES ARITMÉTICAS\n"
                            + "\n"
                            + "Primer número: %.2f\n"
                            + "Segundo número: %.2f\n"
                            + "Operación seleccionada: Resta\n"
                            + "\n"
                            + "Resultado: %.2f",
                            dato1,
                            dato2,
                            resultado
                    );
                } else {
                    if (operacion == 3) {
                        resultado = dato1 * dato2;
                        System.out.printf("OPERACIONES ARITMÉTICAS\n"
                                + "\n"
                                + "Primer número: %.2f\n"
                                + "Segundo número: %.2f\n"
                                + "Operación seleccionada: Multiplicacion\n"
                                + "\n"
                                + "Resultado: %.2f",
                                dato1,
                                dato2,
                                resultado
                        );
                    } else {
                        if (operacion == 4) {
                            resultado = dato1 / dato2;
                            System.out.printf("OPERACIONES ARITMÉTICAS\n"
                                    + "\n"
                                    + "Primer número: %.2f\n"
                                    + "Segundo número: %.2f\n"
                                    + "Operación seleccionada: Division\n"
                                    + "\n"
                                    + "Resultado: %.2f",
                                    dato1,
                                    dato2,
                                    resultado
                            );
                        } else {
                            if (operacion == 5) {
                                resultado = dato1 % dato2;
                                System.out.printf("OPERACIONES ARITMÉTICAS\n"
                                        + "\n"
                                        + "Primer número: %.2f\n"
                                        + "Segundo número: %.2f\n"
                                        + "Operación seleccionada: Modulo\n"
                                        + "\n"
                                        + "Resultado: %.2f",
                                        dato1,
                                        dato2,
                                        resultado
                                );
                            } else {
                                if (operacion == 6) {
                                    resultado = Math.pow(dato1, dato2);
                                    System.out.printf("OPERACIONES ARITMÉTICAS\n"
                                            + "\n"
                                            + "Primer número: %.2f\n"
                                            + "Segundo número: %.2f\n"
                                            + "Operación seleccionada: Resta\n"
                                            + "\n"
                                            + "Resultado: %.2f",
                                            dato1,
                                            dato2,
                                            resultado
                                    );
                                } else {
                                    System.out.println("Valor de operacion no valido");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
