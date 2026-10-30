# 01) CLASES vs OBJETOS
## Conceptos basicos:
- **Clase:**  Define cómo van a ser y cómo se van a comportar las cosas
```java 
    public class Persona{ }
```
- **Objeto:**  Es una instancia de una clase.
```java 
    Persona obj1= new Persona(nombre, edad, mensaje);
```
- **Atributo:** características que describen a la 
```java 
    String nombre;
    int edad;
    int peso;
```

- **Metodos:** comportamientos del objeto
```java 
    public void getInfo(){
            System.out.printf("Nombre: %s , Edad: %d , peso: %s ", nombre,edad,peso);
        }
```
- **Constructor:** método especial dentro de una clase que se ejecuta automáticamente cuando se crea un nuevo objeto
```java 
    public Persona(String nombre, int edad, int peso){
            this.nombre=nombre;
            this.edad=edad;
            this.peso=peso;
        }
```
