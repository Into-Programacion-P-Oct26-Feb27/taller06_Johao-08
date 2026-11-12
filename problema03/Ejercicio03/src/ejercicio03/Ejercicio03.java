/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author johao
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int tipoEmpleado;
        String nombre;
        int anioServicio;
        double sueldo1;
        double total;
        int porcentaje;
        double incremento;
        double bonificacion = 0;

        System.out.println("Ingrese su nombre:");
        nombre = entrada.nextLine();

        System.out.println("Ingrese su tipo dempleado del 1 al 5: ");
        tipoEmpleado = entrada.nextInt();

        System.out.println("Ingrese sus años trabjando:");
        anioServicio = entrada.nextInt();

        System.out.println("Ingrese su sueldo:");
        sueldo1 = entrada.nextInt();

        switch (tipoEmpleado) {
            case 1:
                porcentaje = 5;
                break;
            case 2:
                porcentaje = 7;
                break;
            case 3:
                porcentaje = 9;
                break;
            case 4:
                porcentaje = 12;
                break;
            default:
                porcentaje = 15;
                break;
        }
        if (anioServicio <= 2) {
            bonificacion = 0;
        } else {
            if (anioServicio >= 2 && anioServicio < 5) {
                bonificacion = 30;
            } else {
                if (anioServicio >= 5 && anioServicio < 10) {
                    bonificacion = 60;
                } else {
                    if (anioServicio >= 10) {
                        bonificacion = 60;
                    }
                }
            }
        }

        incremento = sueldo1 * porcentaje / 100;

        total = incremento + bonificacion + sueldo1;

        System.out.printf("REPORTE DE INCREMENTO SALARIAL\n"
                + "\n"
                + "Empleado: %s\n"
                + "Tipo de empleado: %d\n"
                + "Años de servicio: %d\n"
                + "\n"
                + "Sueldo inicial: $%.2f\n"
                + "Porcentaje de incremento: %d%%\n"
                + "Incremento salarial: $%.2f\n"
                + "Bonificación por antigüedad: $%.2f\n"
                + "\n"
                + "Nuevo sueldo: $%.2f",
                nombre,
                tipoEmpleado,
                anioServicio,
                sueldo1,
                porcentaje,
                incremento,
                bonificacion,
                total);
    }

}
