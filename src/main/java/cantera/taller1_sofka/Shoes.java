package cantera.taller1_sofka;

/**
 * Clase en java que almacena variables de zapatos
 *
 * @author Andres Lopez 
 */
public class Shoes {
    /**
     * Variables de la clase Shoe, podemos evidenciar que la variable Id es privada y la variable brand esta protegida para usarse de manera local
     */
    public String Name;
    private String Id;
    protected String Brand;
    public String Size;

    public Shoes(String Name, String Id, String Brand, String Size) {
       /**
        * constructor de las varibales
        */
        this.Name = Name;
        this.Id = Id;
        this.Brand = Brand;
        this.Size = Size;
    }
    /**
     * Getters and Setters de las variables Id y Brand
     * @return 
     */
    private String getId() {
        return Id;
    }

    private void setId(String Id) {
        this.Id = Id;
    }

    protected String getBrand() {
        return Brand;
    }

    protected void setBrand(String Brand) {
        this.Brand = Brand;
    }
    
    
}
