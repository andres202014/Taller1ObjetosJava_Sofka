package cantera.taller1_sofka;

/**
 * Clase cuenta banacaria donde tendremos la informacion del numero y si esta esta activada con ayuda de un booleano
 *
 * @author Andres Lopez
 */
public class Account {
    
    int accountNumber;
    boolean activated;
    /**
     * constructor de la variable activated para verificar si esta activada o no 
     * @return 
     */
    public boolean isActived() {
        return activated;
    }
    
    public void setActived(boolean activated) {
        this.activated = activated;
    }
    
}
