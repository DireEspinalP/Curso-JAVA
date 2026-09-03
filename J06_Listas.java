//-----------------LISTAS-----------------

import java.util.ArrayList;

public class J06_Listas {
    public static void main(String [] args){
        //Declaracion y creacion
        ArrayList<String> names = new ArrayList<>();
        var numeros = new ArrayList<Integer>();
        System.out.println(numeros);
        System.out.println(names);

    
        //Operadores
        names.add("Dire"); //Agrega el elemento
        names.add("Daniel");
        names.add("Espinal");
        System.out.println(names);
        System.out.println(names.get(0)); //Obtiene el elemento
        names.remove(1); //Elimina el elemento
        System.out.println(names);
        names.set(1,"Pecho"); //Modifica el elemento
        System.out.println(names);
        System.out.println(names.isEmpty());
        System.out.println(names.contains("Dire"));
        System.out.println(names.reversed());
        System.out.println(names.size()); 
        names.clear(); //Elimina todos los elementos
        System.out.println(names);

        /* OBS: Python tiene listas, pero en Java se llaman ArrayList y
        son mas limitadas que las listas de Python, ya que no se pueden 
        mezclar tipos de datos y no se pueden usar operadores como + o - 
        para agregar o eliminar elementos. */
    }
}


