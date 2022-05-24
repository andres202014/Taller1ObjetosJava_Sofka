package cantera.taller1_sofka;

/**
 * Clase celular donde se encuentran variables de este tipo, evidenciamos que su Id es privado y su serial esta protegido 
 *
 * @author Andres Lopez 
 */
public class Cellphones {
    public int Name;
    private String Id;
    protected String Serial;
    public int Weight;
    /**
     * Constructor de la clase 
     * @param Name
     * @param Id
     * @param Serial
     * @param Weight 
     */
    public Cellphones(int Name, String Id, String Serial, int Weight) {
        this.Name = Name;
        this.Id = Id;
        this.Serial = Serial;
        this.Weight = Weight;
    }
    
    /**
     * Getters y Setters del Id y el Serial
     * @return 
     */

    private String getId() {
        return Id;
    }

    private void setId(String Id) {
        this.Id = Id;
    }

    protected String getSerial() {
        return Serial;
    }

    protected void setSerial(String Serial) {
        this.Serial = Serial;
    }
    
    
}
