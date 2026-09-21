package POO;

public class J01_Persona {
        //Atributos
        String name;
        int age;
        //Constructor
        public J01_Persona(String name, int age){ 
            //El contructor es un metodo especial que se ejecuta al crear un objeto de la clase
            this.name=name;
            //this hace referencia al objeto actual, es decir, al objeto que se esta creando (no es el parametro)
            this.age=age;
        }
        //Metodos
        public void sayHello(){
            System.out.println("Hola mi nombre es "+ name +" y tengo "+ age +" años");
        }
}
