# 03) Modificadores de aceso y encapsulamiento
## Conceptos:
Los modificadores de acceso controlan desde dónde se puede acceder a los campos y métodos. Java tiene cuatro niveles de control de acceso:

| Modificador  | Misma clase  | Mismo paquete| Subclase     |En toda  partes   |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| **private**| Si |     No|    No |No |
| **predeterminado (sin palabra clave)** | Si| Si  |    No          |   No           |
| **protected**| Si |     Si |    Si |No |
| **public**| Si |     Si|    Si | Si |

private es el más restrictivo; úsalo para datos internos a los que nunca se debería acceder directamente. public es el más abierto; úsalo para métodos que otras clases necesiten llamar.

# 04) Metodos Setter y Getter
## Conceptos:
Los getters y setters son métodos que proporcionan acceso controlado a los campos privados. Un getter recupera el valor de un campo, mientras que un setter lo modifica.
```java
public class Product {
    private String name;

    private double price;
        public String getName() {
        return name;
    }
        public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
    }
}
```