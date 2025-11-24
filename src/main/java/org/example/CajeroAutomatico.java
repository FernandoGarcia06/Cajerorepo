package org.example;
import java.util.Scanner;

public class CajeroAutomatico {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int opcion;
        double cantidad;

        CuentaBancaria cuenta1 = new CuentaBancaria("Fernando Garcia","1234567890", 1000.0);
       
        do {
        System.out.println("================================");
        System.out.println("Bienvenido al Cajero Automático");
        System.out.println("================================");

        

        System.out.println("Seleccione una opción:");
        System.out.println("1.Consultar saldo");
        System.out.println("2.Depositar");
        System.out.println("3.Retirar");
        opcion = sc.nextInt();
      
        switch(opcion){
            case 1:
                System.out.println("Su saldo actual es: " + cuenta1.getSaldo());
                break;
            case 2:
                System.out.println("Ingrese la cantidad a depositar:");
                cantidad = sc. nextDouble();
                cuenta1.depositar(cantidad);
                break;
            case 3:
                System.out.println("Ingrese la cantidad a retirar:");
                cantidad = sc.nextDouble();
                cuenta1.retirar(cantidad);
                break;
            case 4:
                cuenta1.informacionCuenta();
                break;
            case 5:
                System.out.println("Gracias por usar el Cajero Automático. ¡Hasta luego!");
            default:
                System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                
        }
    }while (opcion != 5);
        



    }

}


    
 

