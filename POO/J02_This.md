# 02) This y Sobrecarga de Constructores
## Conceptos:
- **this:**   se refiere a la instancia actual de una clase y distingue entre campos y parámetros con el mismo nombre.
```java 
public Person(String name) {
    this.name = name;  // Asigna el parámetro al campo
}
```
- **Constructor:**  Un constructor es un método especial que se ejecuta automáticamente cuando creas un objeto con new. Tiene el mismo nombre que la clase y ningún tipo de retorno.
```java 
public class Book {
    private String title;
    private String author;
    
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

Book book = new Book("1984", "Orwell");
// El constructor se ejecuta de inmediato, los campos se establecen
```
- **Atributo:** características que describen a la 
```java 
    String nombre;
    int edad;
    int peso;
```

- **Sobrecarga de Constructores:** La sobrecarga de constructores permite varios constructores con diferentes listas de parámetros en la misma clase.
```java 
public class Book {
    private String title;
    private String author;
    private int pages;
    
    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }
    
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.pages = 0;
    }
}

Book b1 = new Book("1984", "Orwell", 328);
Book b2 = new Book("Dune", "Herbert");
Book b3 = new Book();
```
