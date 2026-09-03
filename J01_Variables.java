//-----------------VARIABLES-----------------
public class J01_Variables {
    public static void main(String[] arg){
        int numeroEntero = 10; // Entero
        double numeroDecimal = 3.14; // Decimal
        float numeroFlotante = 2.5f; // Flotante
        char caracter = 'A'; // Caracter
        boolean esVerdadero = true; // Booleano

        System.out.println("Número entero: " + numeroEntero);
        System.out.println("Número decimal: " + numeroDecimal);
        System.out.println("Número flotante: " + numeroFlotante);
        System.out.println("Caracter: " + caracter);
        System.out.println("Es verdadero: " + esVerdadero);

        //Combinacion de variables y texto

        String name="Dire";
        System.out.println("Mi nombre es " + name);
        //actualizando valor de name
        name="Daniel";
        System.out.println("Mi nombre es " + name+ " (actualizado)");

        int age=18; 
        System.out.println("Mi edad es "+ age);

        final double PI=3.1416; //constante (no varia su valor)
        System.out.println("La constante de Pi es "+PI);
        
        var variable="HOLA"; // Basicamente es el "auto " usado en C++
        System.out.println("Valor indirectamente de la variable es "+variable);
    }
}
