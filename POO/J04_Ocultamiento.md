# Ocultamiento de información

El ocultamiento de información restringe el acceso directo a los datos internos de un objeto mediante el uso de campos private combinados con getters y setters.

Sin el ocultamiento de información, los campos quedan expuestos y pueden establecerse con valores no válidos:

```java
public class Temperature {
    public double celsius;  // Expuesto directamente
}
Temperature t = new Temperature();
t.celsius = -500;  // Se permite un valor no válido
```
**Con el ocultamiento de información, usted controla el acceso y valida los datos:**
```java
public class Temperature {
    private double celsius;
    
    public void setCelsius(double celsius) {
        if (celsius >= -273.15) {
            this.celsius = celsius;
        }
    }
    
    public double getCelsius() {
        return celsius;
    }
}
```
## Beneficios clave del ocultamiento de información:

- Validación: Garantiza la integridad de los datos al rechazar valores no válidos
- Flexibilidad: Permite realizar cambios internos sin afectar al código externo
- Control: Le permite decidir qué operaciones están permitidas en sus datos


# La palabra clave final
La palabra clave final **impide las modificaciones** en Java. Se puede aplicar a variables, métodos y clases.

Cuando se aplica a una variable, final la convierte en una constante: una vez asignado, su valor no puede cambiar:

```java
public class Circle {
    private final double PI = 3.14159;
    private final double radius;
    
    public Circle(double radius) {
        this.radius = radius;  // Se puede asignar una vez en el constructor
    }
    
    public void setRadius(double r) {
        // this.radius = r; ¡Error! No se puede reasignar una variable final
    }
}
```
Una variable final debe inicializarse en su declaración o en el constructor. Después, cualquier intento de reasignarla provoca un error de compilación.

Para los tipos de referencia, final significa que la referencia no puede apuntar a un objeto diferente, pero el contenido del objeto aún puede cambiar:

```java
private final StringBuilder name = new StringBuilder("John");

// name = new StringBuilder("Jane");  // ¡Error! No se puede reasignar
name.append(" Doe");  // ¡Bien! El contenido del objeto puede cambiar
```
- Usar final con campos comunica una intención: indica que un valor nunca debe cambiar después de la inicialización, lo cual es útil para valores de configuración, identificadores o datos constantes.