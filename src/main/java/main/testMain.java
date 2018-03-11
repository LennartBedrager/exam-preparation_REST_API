
package main;

import Entity.FacadeImpl;
import Entity.Pet;
import java.util.List;

public class testMain {

    public static void main(String[] args) {
        FacadeImpl facade = new FacadeImpl();
        
        
        System.out.println("Names of pets: ");
        
        List<Pet> pets = facade.getAllPets();
        for(int i=0;i<pets.size();i++){
            System.out.println(pets.get(i).getName());
        }
        
        System.out.println("Pet count: " + pets.size());
        //System.out.println("Pet count: " + facade.petCount());
    }
    
}
