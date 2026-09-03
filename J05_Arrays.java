//-----------------ARRAYS-----------------

public class J05_Arrays {
    public static void main(String[] args) {
        // Declaracion y creacion
         int[] numeros = new int[4];
         System.out.println(numeros);

         String[] nombres={"Dire", "Daniel"};
         System.out.println(nombres);

         //Acceso 
         System.out.println(numeros[0]);
         System.out.println(nombres[1]);
         
         System.out.println(new String [3][0]);

         // Modificacion
         numeros[0] = 10;
         nombres[1] = "Carlos";
         System.out.println(numeros[0]);
         System.out.println(nombres[1]);
         nombres[0]=null;
        // numeros[0]=null; esto esta mal
         numeros[0]=0;
         System.out.println(nombres[0]);

    }
}
    