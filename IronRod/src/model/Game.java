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
public class Game implements Serializable{
    private float totalTime;
    private int numberOfPlayers;
    
    public Game() {
    }

    public Game(float totalTime, int numberOfPlayers) {
        this.totalTime = totalTime;
        this.numberOfPlayers = numberOfPlayers;
    }

    public float getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(float totalTime) {
        this.totalTime = totalTime;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Float.floatToIntBits(this.totalTime);
        hash = 23 * hash + this.numberOfPlayers;
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
        final Game other = (Game) obj;
        if (Float.floatToIntBits(this.totalTime) != Float.floatToIntBits(other.totalTime)) {
            return false;
        }
        if (this.numberOfPlayers != other.numberOfPlayers) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "totalTime=" + totalTime + ", numberOfPlayers=" + numberOfPlayers + '}';
    }
}
