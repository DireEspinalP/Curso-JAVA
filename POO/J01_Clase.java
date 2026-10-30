package POO;
import java.util.Scanner;

public class J01_Clase{
    public static class Persona{
        //Atributos
        String nombre;
        int edad;
        int peso;

        //Constructor
        public Persona(String nombre, int edad, int peso){
            this.nombre=nombre;
            this.edad=edad;
            this.peso=peso;
        }
        //Metodo
        public void getInfo(){
            System.out.printf("Nombre: %s , Edad: %d , peso: %s ", nombre,edad,peso);
        }
        
    }
    public static void main (String [] args){
        System.out.println("Registro de datos:");
        Scanner scanner= new Scanner(System.in);
        System.out.print("Nombre: ");
        String nombre=scanner.nextLine();
        System.out.print("Edad: ");
        int edad=Integer.parseInt(scanner.nextLine());
        System.out.print("Peso: ");
        int peso=Integer.parseInt(scanner.nextLine());

        //Creacion del objeto
        Persona obj1= new Persona(nombre, edad, peso);

        obj1.getInfo();
    }
}