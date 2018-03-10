/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author KnaldeKalle
 */
public class FacadeImpl implements FacadeInterface{

     EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_exam-preparation_REST_API_war_1.0-SNAPSHOTPU");
     EntityManager em = emf.createEntityManager();
    
     
    @Override
    public Pet findPet(int petId) {
       
        Query q = em.createNamedQuery("Pet.findById");
        q.setParameter("id",petId);
        Pet p = (Pet) q.getSingleResult();
        return p;
    }
     
    @Override
    public List<Pet> getAllPets() {
       
        Query q = em.createQuery("select p from Pet p");
        List<Pet> pets = q.getResultList();
        return pets;
        
        
    }
    
}
