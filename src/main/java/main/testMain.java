
package main;

import Entity.FacadeImpl;

public class testMain {

    public static void main(String[] args) {
        FacadeImpl facade = new FacadeImpl();
        
        
        System.out.println(facade.getAllPets());
    }
    
}
