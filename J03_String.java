//-----------------OPERADORES-----------------
public class J03_String {
    public static void main(String [] arg ){
        String name="Dire";
        String lastname =new String("Espinal");

       //Concatenar
        System.out.println("Mi nombre es "+name+" "+lastname);
        System.out.println("Mi nombre es "+name+lastname);

        //Length
        System.out.println("La longitud de mi nombre es "+name.length());

        //Uppercase y Lowercase
        System.out.println("Mi nombre en mayusculas es "+name.toUpperCase());
        System.out.println("Mi nombre en minusculas es "+name.toLowerCase());

        //Obtencion de caracteres
        System.out.println("El primer caracter de mi nombre es "+name.charAt(0));
        System.out.println("El caracter combinado de mi nombre es "+name.charAt(0)+name.charAt(1));
        System.out.println("El ultimo caracter de mi nombre es "+name.charAt(name.length()-1));
           
        //Subcadenas
        System.out.println(name.substring(0,3)); //EXCLUYE EL ULTIMO VALOR
    
        //Contains
        System.out.println("Mi nombre contiene la letra 'D'? "+name.contains("D"));
        
        //Comparacion de Strings
        String name2="dire";
        System.out.println("Mi nombre es igual a name2? "+name.equals(name2));

        //Trim y Replace
        String name3="   Dire Espinal   ";
        System.out.println("Mi nombre con espacios es "+name3);
        System.out.println("Mi nombre sin espacios es "+name3.trim());

        String name4="Dire Espinal";
        System.out.println("Mi nombre con Espinal reemplazado es "+name4.replace("Espinal","Espinosa"));

        //Format (%s (string), %d (int), %f (float))
        var edad=19;
        var altura=1.75;
        System.out.println(String.format("Mi nombre es %s, mi edad es %d y  mi altura es %.2f",name,edad,altura));
    }
}
