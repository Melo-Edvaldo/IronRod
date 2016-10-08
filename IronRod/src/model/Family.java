/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Edvaldo de Oliveira Melo
 */
public class Family implements Serializable {
    
    private int numberOfPeople;
    
    public Family() {
    }

    public Family(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + this.numberOfPeople;
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
        final Family other = (Family) obj;
        if (this.numberOfPeople != other.numberOfPeople) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Family{" + "numberOfPeople=" + numberOfPeople + '}';
    }
}
