# 9) Herencia Multiple

La herencia multinivel crea una cadena donde una clase extiende a otra clase, la cual a su vez extiende a otra clase:
```java
public class Animal {
    public void eat() {
        System.out.println("Eating");
    }
}

public class Mammal extends Animal {
    public void breathe() {
        System.out.println("Breathing");
    }
}

public class Dog extends Mammal {
    public void bark() {
        System.out.println("Barking");
    }
}
```
En la herencia multinivel, una clase hija tiene acceso a todos los métodos de toda la cadena de herencia:

```java
Dog dog = new Dog();
dog.eat();      // De Animal
dog.breathe();  // De Mammal
dog.bark();     // De Dog
```

Cada jerarquía de clases tiene a Object en la cima. El encadenamiento de constructores fluye a través de todos los niveles al crear un nuevo objeto.


## ¿Por qué no hay herencia múltiple de clases?
Java solo permite la herencia simple: una clase solo puede extender otra clase. Esto evita el Problema del Diamante, donde surge ambigüedad si una clase pudiera heredar el mismo método de múltiples clases padre.
```java
// NO permitido en Java - herencia múltiple
public class D extends B, C { } // ¡ERROR!
```
Sin embargo, Java permite que una clase implemente múltiples interfaces como alternativa:
```java
// Válido en Java
public class Dog extends Animal implements Runnable, Comparable<Dog> {
    // Puede extender una clase e implementar múltiples interfaces
}
```
Java admite la herencia multinivel: la creación de cadenas de herencia:
```java
public class AudioDevice { }

public class MusicPlayer extends AudioDevice { }

public class SmartSpeaker extends MusicPlayer { }
// SmartSpeaker hereda tanto de MusicPlayer como de AudioDevice
```


# 10) La clase Object
En Java, cada clase hereda automáticamente de la clase Object, convirtiéndola en la raíz de toda la jerarquía de clases:

```java
public class Person {
    // Esto extiende implícitamente a Object
}

// Es equivalente a:
public class Person extends Object {
}
```
Cada objeto en Java tiene acceso a varios métodos integrados heredados de Object:

|Método	| Propósito|
|------|---------|
|**toString()**|	Devuelve una representación en cadena del objeto|
|**equals(Object obj)**|Compara dos objetos para determinar su igualdad|
|**hashCode()**|	Devuelve un valor de código hash para el |objeto|
|**getClass()**|	Devuelve la clase en tiempo de ejecución del objeto|

- Por defecto, **toString()** devuelve el nombre de la clase seguido de la dirección de memoria del objeto:

```java
Person p = new Person();
System.out.println(p.toString());  // Salida: Person@1a2b3c4d
```

Puedes sobrescribir estos métodos en tus propias clases para proporcionar un comportamiento significativo. Puedes almacenar cualquier objeto en una variable de tipo Object, ya que todas las clases heredan de ella.