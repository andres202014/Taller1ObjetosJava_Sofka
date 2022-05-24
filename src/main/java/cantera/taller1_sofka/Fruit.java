package cantera.taller1_sofka;
import java.util.ArrayList;

/**
 * Clase fruta donde podemos ver sus atributos con un array donde se almacenaran los colores 
 * 
 * @author Andres
 */
public class Fruit {
    String name;
    float averageWeight;
    ArrayList<String> colors = new ArrayList<String>();
    /**
     * Getters y setters del array de colors 
     * @return 
     */
    public ArrayList<String> getColors() {
        return colors;
    }

    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }
    
}
