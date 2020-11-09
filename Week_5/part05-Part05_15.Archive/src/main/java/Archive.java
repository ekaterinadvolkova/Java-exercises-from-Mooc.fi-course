/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ekate
 */
import java.util.Objects;

public class Archive {
    
    private String identifier;
    private String name;

    public Archive (String identifier, String name) {
        this.name = name;
        this.identifier = identifier;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getName() {
        return name;
    }
    
    @Override
    public String toString() {
       String print = getIdentifier()+": "+getName();
       return print;
   }
        
    
    
    public boolean equals(Object compared) {
        // if the variables are located in the same position, they are equal
        if (this == compared) {
            return true;
        }

        // if the compared object is not of type Archive, the objects are not equal
        if (!(compared instanceof Archive)) {
            return false;
        }

        // convert the object to a Archive object
        Archive comparedArchive = (Archive) compared;

        // if the values of the object variables are equal, the objects are, too
        return (this.identifier.equals(comparedArchive.identifier));
    }
    
}
