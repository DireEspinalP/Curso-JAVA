# 7) Herencia básica (extends)

Usa la palabra clave extends para crear una relación de herencia entre clases:
- La palabra clave super hace referencia a la clase principal desde dentro de una subclase.

- Usa **super()** para llamar al constructor de la clase principal. Esta debe ser la primera instrucción en el constructor de la subclase:
 **Usa super() para llamar al constructor de la clase principal. Debe ser la primera línea del constructor**

```java
public class Animal {
    private String name;
    
    public Animal(String name) {
        this.name = name;
    }
    
    public void eat() {
        System.out.println(name + " is eating");
    }
    
    public String getName() {
        return name;
    }
}

public class Dog extends Animal {
    public Dog(String name) {
        super(name);  // Llama al constructor padre
    }
    
    public void bark() {
        System.out.println(getName() + " says woof!");
    }
}
```
La subclase (hija) hereda todos los métodos de la superclase (padre) y puede añadir los suyos propios:

```java
Dog myDog = new Dog("Buddy");
myDog.eat();   // Método heredado
myDog.bark();  // Método propio
```
Usa super() en el constructor de la subclase para llamar al constructor de la clase padre.

La herencia representa una relación «es-un» entre clases.

# Sobrescritura de métodos (@Override)

La sobrescritura de métodos permite que una subclase proporcione su propia implementación de un método ya definido en su clase padre. El método sobrescrito debe tener el mismo nombre, tipo de retorno y parámetros que el método padre.
```java
public class Animal {
    public void makeSound() {
        System.out.println("Some generic sound");
    }
}

public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}
```
La anotación ``` @Override ``` es opcional, pero se recomienda encarecidamente. Indica al compilador que pretendes sobrescribir un método padre, lo que ayuda a detectar errores como nombres de métodos mal escritos o parámetros incorrectos:

```java
@Override
public void makeSound() { }  // Correcto - el compilador verifica esto

public void makesound() { }  // ¡Typo! Crea un nuevo método en lugar de sobrescribir
```
Al llamar a un método sobrescrito, Java ejecuta la versión que pertenece al tipo real del objeto:
```java
Dog dog = new Dog();
dog.makeSound();  // Salida: Woof!

Cat cat = new Cat();
cat.makeSound();  // Salida: Meow!
Puedes usar super.methodName() 
```
dentro de un método sobrescrito para incluir el comportamiento de la clase padre junto con tu nuevo código.