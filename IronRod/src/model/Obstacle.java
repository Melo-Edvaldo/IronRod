/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author kburkart
 */
public class Obstacle implements Serializable {
    
    private String name;
    private String description;
    private boolean overcome;

    public Obstacle() {
    }

    public Obstacle(String name, String description) {
        this.name = name;
        this.description = description;
        this.overcome = false; //Starts false, changed to true if player overcomes the obstacle
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isOvercome() {
        return overcome;
    }

    public void setOvercome(boolean overcome) {
        this.overcome = overcome;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + Objects.hashCode(this.description);
        hash = 97 * hash + (this.overcome ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Obstacle other = (Obstacle) obj;
        if (this.overcome != other.overcome) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Obstacle{" + "name=" + name + ", description=" + description + ", overcome=" + overcome + '}';
    }
       
}
