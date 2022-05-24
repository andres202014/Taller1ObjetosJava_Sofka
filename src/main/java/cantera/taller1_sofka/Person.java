package cantera.taller1_sofka;
import java.util.Date;
/**
 * Clase Persona donde podemos evidenciar varios atributos de la misma
 *
 * @author Andres Lopez
 */
public class Person {
    /**
     * variables de la clase Persona en la cual tenemos una de tipo Date para almacenar la fecha de nacimiento 
     */
    String name;
    String lastName;
    String lastName2;
    Date dateBirth;
    float height;
     /**
      * Getters y setters de la clase Name
      * @return 
      */
       public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


