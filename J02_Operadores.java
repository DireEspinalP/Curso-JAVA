//-----------------OPERADORES-----------------
public class J02_Operadores {
    public static void main(String [] arg){
        //Aritmeticos
        int a=10;
        var b=5;
        System.out.println("Suma: "+(a+b));
        System.out.println("Resta: "+(a-b));
        System.out.println("Multiplicacion: "+(a*b));
        System.out.println("Division: "+(a/b));
        System.out.println("Modulo: "+(a%b));
        //Si actualizo el valor seria lo mismo que la carpeta anterior

        //Logicos
        System.out.println("AND: "+(true && false));
        System.out.println("OR: "+(true || false));
        System.out.println("NOT: "+(!true));

        //Incremento y Decremento
        int c=10;
        System.out.println("Incremento: "+(++c));
        System.out.println("Decremento: "+(--c));
        c+=4;
        c*=2;
        System.out.println("Modificaciones de C: "+c);



        /*OBS: Este lenguaje parece mucho en C++ y Python
         En python se parece por el uso de la indentacion 
         y en C++ por el uso de los operadores logicos, aritmeticos e incremento*/
    }
}
