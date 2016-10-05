/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ironrod;

import model.Person;

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
    }
    
}
