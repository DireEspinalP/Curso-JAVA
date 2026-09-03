//-----------------CONDICIONALES-----------------

import java.util.Scanner;

public class J04_Condicional {
    public static void main(String[] args){
        //If-else if- else
        int edad = 19;
        System.out.println(edad>=18);
        if(edad>18){
            System.out.println("Eres un adulto mayor");
        }
        else if(edad<18 && edad>12){
            System.out.println("Eres un adolecente");
        }
        else{
            System.out.println("Eres un niño");
        }
        
        //Entrada a la pantalla, Switch, case, break
        Scanner sc = new Scanner(System.in);
        //new Scanner(System.in) es para crear un objeto Scanner que permite leer la entrada del usuario desde la consola.
        System.out.print("Ingresa un operador (+, -, *, /): ");
        String operador = sc.next();

        System.out.print("Ingresa el primer número: ");
        double value1 = sc.nextDouble();

        System.out.print("Ingresa el segundo número: ");
        double value2 = sc.nextDouble();
        //nextDouble() es para leer un número decimal, si se quiere leer un entero se usa nextInt()
        switch (operador) {
            case "+":
                System.out.println("Suma: " + (value1 + value2));
                break;
            case "-":
                System.out.println("Resta: " + (value1 - value2));
                break;
            case "*":
                System.out.println("Multiplicación: " + (value1 * value2));
                break;
            case "/":
                System.out.println("División: " + (value1 / value2));
                break;
            default:
                System.out.println("Operación no válida");
        }

        sc.close();
    }
}
