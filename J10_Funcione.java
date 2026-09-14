import java.util.Scanner;

public class J10_Funcione{

//este "main" es una funcion solo que no sabiamos

    //Funcion 1) publica sin parametros ni return
     public static void holaMundo(){
            System.out.println("Hola mundo ");
     }

    
    //Funcion 2) sobrecarga de operadores
    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
        
    }
    //Funcion 3) Return
    public static double cube(double n){
        return n*n*n;
    }
    //Funcion 4) Void

     public static void printNTimes(String message, int n1) {
        for (int i=0; i<n1; i++){
            System.out.println(message);
        }
    }
    

      public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);



        System.out.println("\nFuncion 1: ");
        for(int i=0; i<5; i++){
            holaMundo();
        }
        System.out.println("\nFuncion 2: ");
        System.out.println("Suma int: "+add(5,4));
        System.out.println("Suma double: " +add(5.2,4.3));

        System.out.println("\nFuncion 3: ");
        System.out.println("Num al cubo: " +cube(5.8));

        System.out.println("\nFuncion 4: ");
        String msg = scanner.nextLine();
        int n1 = scanner.nextInt();
        printNTimes(msg, n1);
    }
}