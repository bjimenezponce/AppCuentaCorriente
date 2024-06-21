//main de la cuenta corriente
package appcuentacorriente;

import java.util.InputMismatchException;
import java.util.Scanner;

import cuenta.CuentaCorriente;




public class AppCuentaCorriente {
    public static void main(String[] args) {
        //creamos una cuenta para poder hacer pruebas y movimientos
        CuentaCorriente cuentaCorriente = new CuentaCorriente(true, 0, "bastian jimenez", 17786543, 1000);
        //probamos que se hagan efectivos los abonos y los cargos

        Scanner scanner  = new scanner (System.in);
        try {
            System.out.println( "Ingrese el monto a girar");
            int intMonto1, intMonto2, intMonto3;
            int intMonto1 = scanner.nextLine();
            int intMonto2 = scanner.nextLine();
            int intMonto3 = scanner.nextLine(); 
           
            // realizar algunos movmientos
            cuenta.abonar(intMonto1);
            cuenta.cargar(intMonto2);
            cuenta.cargar(intMonto3);

        } catch (InputMismatchException objException) {
            System.out.println( " Solo se permiten valores numericos");
        }
        }
        //mortrar saldo y movimientos

        System.out.println(" El saldo actualizado es: " + cuentaCorriente.getFloatsaldo());
        System.out.println (" Ultimos Movimientos: ");
        cuenta.mostrarMovimientos();

    }

