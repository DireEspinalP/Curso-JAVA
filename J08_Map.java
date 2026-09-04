import java.util.HashMap;
public class J08_Map {
    public static void main(String [] args){
        //Declaracion y creacion
        HashMap<String, Integer> names = new HashMap<>();
        var number=new HashMap<String, Integer>();

        //Tamaño
        System.out.println(names.size());
        //Añadir elementos
        names.put("DNI", 199135);
        names.put("Numero",903539235);
        number.put("Codigo", 10213);
        System.out.println(names.size());
        System.out.println(names);

        //Acceder a los elementos
        System.out.println("Accediendo al DNI: " + names.get("DNI"));
        System.out.println("Accediendo al Numero (llave incorrecta): " + names.get("Nombre"));
        System.out.println( "Accediendo al Codigo: "+ number.get("Codigo"));

        //Existencia
        System.out.println( names.containsValue(199135));
        System.out.println(number.containsKey("Nombre"));

        //Eliminar elementos
        names.remove("DNI");
        System.out.println(names);

        //Limpiar el HasMpa
        names.clear();
        System.out.println(names);

        //Modificacion de elementos
        names.put("Dire", 18);
        System.out.println(names);
        names.put("Daaiel", 20);
        System.out.println(names);

        names.replace("Dire",19);
        //Remplaza al valor existente
        System.out.println(names);

        names.putIfAbsent("Dary", 21); //Insertalo  solo si no existe
        System.out.println(names);


        System.out.println(names.isEmpty());
        System.out.println(names.values());
        System.out.println(names.keySet());

    }
    
}
