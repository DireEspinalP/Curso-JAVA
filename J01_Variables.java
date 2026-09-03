//-----------------VARIABLES-----------------
public class J01_Variables {
    public static void main(String[] arg){
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
