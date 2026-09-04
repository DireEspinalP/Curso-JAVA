//------------------SETS------------------
import java.util.HashSet;
public class J07_Sets{
    public static void main(String[] args){
        //Declaracion y creacion
        HashSet<String> names=new HashSet<>();
        var number=new HashSet<Integer>();

        //Tamaño
        System.out.println(names.size());

        //Añadir elementos
        names.add("Dire");
        names.add("Daniel");
        names.add("Espinal");
        names.add("Pecho");
        System.out.println(names.size());
        System.out.println(names); //Imprime de forma desordenada.

        //Buscar los elementos
        System.out.println(names.contains("Dary"));
        System.out.println(names.contains("Dire"));

        //Eliminar elemento
        names.remove("Pecho");
        System.out.println(names);

        //OBS: Los sets son como listas pero no permiten elementos duplicados.
        names.add("Dire");
        names.add("Dire");
        System.out.println(names);


        //Trabajo con conjuntos
        HashSet<Integer> number1=new HashSet<>();
        number1.add(1);
        number1.add(2);
        number.add(4);
        number.add(5);
        number.add(5);
        number.add(5);
        System.out.println(number1);

        System.out.println(number.addAll(number1));
        System.out.println(number.removeAll(number1));
        System.out.println(number.retainAll(number1));
    }

    
}