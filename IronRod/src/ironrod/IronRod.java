/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ironrod;

import java.util.HashSet;
import model.Family;
import model.Game;
import model.Location;
import model.Map;
import model.Obstacle;
import model.Person;
import model.Quiz;

/**
 *
 * @author kburkart
 */
public class IronRod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Person person = new Person();
       person.setName("Katelynn");
       person.setAge(23);
       person.setGender('F');
       person.setRole("sister");
       person.setHealthPoints(100);
       System.out.println(person.toString());
       
       Quiz quiz = new Quiz();
       quiz.setScripture("Moroni 10:3-5");
       quiz.setQuestion("T or F: This scripture is a scripture mastery.");
       quiz.setAnswer('T');
       System.out.println(quiz.toString());
       
       Obstacle obstacle = new Obstacle();
       obstacle.setName("Drugs Offered");
       obstacle.setDescription("A friend of your teeanage daughter has offered her a joint.");
       obstacle.setOvercome(false);
       System.out.println(obstacle.toString()); 
       
       Location location = new Location();
       location.setRow(3);
       location.setColumn(6);
       location.setVisited(false);
       System.out.println(location.toString());
       
       Family family = new Family();
       family.setNumberOfPeople(6);
       System.out.println(family.toString());
       
       Game game = new Game();
       game.setTotalTime(30);
       game.setNumberOfPlayers(2);
       System.out.println(game.toString());
       
       Map map = new Map();
       map.setRowCount(3);
       map.setColumnCount(6);
       System.out.println(map.toString());
    }
    
}
