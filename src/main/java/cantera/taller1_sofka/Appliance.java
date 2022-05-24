
package cantera.taller1_sofka;

/**
 *Presenta una clase de tipo Java en la cual podemos ver un electrodomestico con sus distintos atributos 
 * 
 * @author Andres Lopez
 */
public class Appliance {
    public String type;
    private String Id;
    public String Price;
    protected int Serial;
    
    /**
     * Getters y Setters del Id y del Serial
     * @return 
     */

    private String getId() {
        return Id;
    }

    private void setId(String Id) {
        this.Id = Id;
    }

    protected int getSerial() {
        return Serial;
    }

    protected void setSerial(int Serial) {
        this.Serial = Serial;
    }

    public Appliance(String Price) {
        this.Price = Price;
    }

   
    
    
    
}
