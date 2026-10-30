package POO;
import java.util.Scanner;
public class J02_This {

    public static class Calculadora{
        private String nombre;
        private double memoria;
        private int contador;

        //Constructor con paramatetros
        public Calculadora(String nombre){
            this.nombre=nombre;
            this.memoria=0;
            this.contador=0;
        }
        //Constructor por defecto
        public Calculadora(){
            this("Default");
        }

        //Get
        public String getnombre(){ return this.nombre;}
        public double getMemoria(){return this.memoria;}
        public int getContador(){return this.contador;}

        public double suma(double a, double b){
            double resultado=a+b;
            this.memoria=resultado;
            this.contador++;
            return resultado;
        }

        public double resta(double a, double b){
            double resultado=a-b;
            this.contador++;
            return resultado;
        }
        public double producto(double a, double b){
            double resultado=a*b;
            this.contador++;
            return resultado;
        }
        public double division(double a, double b){
            if(b==0){
                this.contador++;
                return 0;
            }
            double resultado=a/b;
            this.contador++;
            return resultado;
        }

        public double exp(double base, double exponente){
            double resultado=Math.pow(base, exponente);
            this.contador++;
            return resultado;
        }
    }
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Calculadora \n---------------");

        System.out.print("Nombre: ");String nombre=scanner.nextLine();
        System.out.print("Num1: " ); double num1=Double.parseDouble(scanner.nextLine());
        System.out.print("Num2: " ); double num2= Double.parseDouble(scanner.nextLine());

        Calculadora obj= new Calculadora(nombre);
        System.out.printf("\n%-15s %10s%n", "Nombre:", obj.getnombre());
        System.out.printf("%-15s %10.2f%n", "Suma:", obj.suma(num1, num2));
        System.out.printf("%-15s %10.2f%n", "Resta:", obj.resta(num1, num2));
        System.out.printf("%-15s %10.2f%n", "Producto:", obj.producto(num1, num2));
        System.out.printf("%-15s %10.2f%n", "Division:", obj.division(num1, num2));
        System.out.printf("%-15s %10.2f%n", "Exponencial:", obj.exp(num1, num2));
        System.out.printf("%-15s %10.2f%n", "Memoria:", obj.getMemoria());
        System.out.printf("%-15s %10d%n", "Contador:", obj.getContador());

    }
}
