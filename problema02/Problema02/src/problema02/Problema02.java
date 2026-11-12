/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALASC
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int tipoCarro;
        String nombre;
        double evaluoComercial;
        double valorBase;
        double total;

        System.out.println("Ingrese su tipo de carro:\n"
                + "1. Vehiculo liviano particular\n"
                + "2. Vehiculo grande particular\n"
                + "3. Taxi\n"
                + "4. Bus urbano\n");
        tipoCarro = entrada.nextInt(); // 4
        entrada.nextLine();

        System.out.println("Ingrese su nombre");
        nombre = entrada.nextLine();

        System.out.println("Ingrese el evaluo comercial de su vehiculo");
        evaluoComercial = entrada.nextDouble();

        switch (tipoCarro) {
            case 1:
                if (35000 <= evaluoComercial) {
                    valorBase = (evaluoComercial * 0.0001);
                    total = valorBase + 2 + 1.50;
                    System.out.printf("Peaje \"Buena Vía\"\n"
                            + "Propietario: %s\n"
                            + "Tipo: Vehículo liviano particular\n"
                            + "    Avalúo: %.2f\n"
                            + "    Valor base del peaje: %.2f\n"
                            + "    Recargo: $1.50\n"
                            + "\n"
                            + "    Total a cancelar: %.2f",
                            nombre,
                            evaluoComercial,
                            valorBase,
                            total);
                    break;
                } else {
                    valorBase = (evaluoComercial * 0.0001);
                    total = valorBase + 2;
                    System.out.printf("Peaje \"Buena Vía\"\n"
                            + "Propietario: %s\n"
                            + "Tipo: Vehículo liviano particular\n"
                            + "    Avalúo: %.2f\n"
                            + "    Valor base del peaje: %.2f\n"
                            + "    Recargo: $0\n"
                            + "\n"
                            + "    Total a cancelar: %.2f",
                            nombre,
                            evaluoComercial,
                            valorBase,
                            total);
                    break;
                }
            case 2:
                if (35000 <= evaluoComercial) {
                    valorBase = (evaluoComercial * 0.0002);
                    total = valorBase + 2.5 + 1.50;
                    System.out.printf("Peaje \"Buena Vía\"\n"
                            + "Propietario: %s\n"
                            + "Tipo: Vehículo grande particular\n"
                            + "    Avalúo: %.2f\n"
                            + "    Valor base del peaje: %.2f\n"
                            + "    Recargo: $1.50\n"
                            + "\n"
                            + "    Total a cancelar: %.2f",
                            nombre,
                            evaluoComercial,
                            valorBase,
                            total);
                    break;
                } else {
                    valorBase = (evaluoComercial * 0.0002);
                    total = valorBase + 2.5;
                    System.out.printf("Peaje \"Buena Vía\"\n"
                            + "Propietario: %s\n"
                            + "Tipo: Vehículo grande particular\n"
                            + "    Avalúo: %.2f\n"
                            + "    Valor base del peaje: %.2f\n"
                            + "    Recargo: $0\n"
                            + "\n"
                            + "    Total a cancelar: %.2f",
                            nombre,
                            evaluoComercial,
                            valorBase,
                            total);
                    break;
                }
            case 3: {
                valorBase = (evaluoComercial * 0.0004);
                total = valorBase + 1.5;
                System.out.printf("Peaje \"Buena Vía\"\n"
                        + "Propietario: %s\n"
                        + "Tipo: Taxi\n"
                        + "    Avalúo: %.2f\n"
                        + "    Valor base del peaje: %.2f\n"
                        + "    Recargo: $0\n"
                        + "\n"
                        + "    Total a cancelar: %.2f",
                        nombre,
                        evaluoComercial,
                        valorBase,
                        total);
                break;
            }
            case 4: {
                valorBase = (evaluoComercial * 0.0005);
                total = valorBase + 2.20;
                System.out.printf("Peaje \"Buena Vía\"\n"
                        + "Propietario: %s\n"
                        + "Tipo: Bus urbano\n"
                        + "    Avalúo: %.2f\n"
                        + "    Valor base del peaje: %.2f\n"
                        + "    Recargo: $0\n"
                        + "\n"
                        + "    Total a cancelar: %.2f",
                        nombre,
                        evaluoComercial,
                        valorBase,
                        total);
                break;
            }
            default:
                System.out.println("Informacion no valida");

        }

    }

}
