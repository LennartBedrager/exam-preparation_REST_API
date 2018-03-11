/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import Entity.FacadeImpl;
import Entity.Pet;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

import org.json.JSONArray;

/**
 * REST Web Service
 *
 * @author KnaldeKalle
 */
@Path("pet")
public class PetResource {

    Gson gson = new Gson();
    FacadeImpl facade = new FacadeImpl();
    
    
    @Context
    private UriInfo context;

    /**
     * Creates a new instance of PetResource
     */
    public PetResource() {
    }

    /**
     * Retrieves representation of an instance of rest.PetResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        
     List<Pet> pets =  facade.getAllPets();
     
     /*Jeg har adgang til pets metoder, og de er testet og giver navne på pets.
     Så vi har adgang til java objecterne, men når jeg prøver at converte dem til json
     får jeg en server fejl. */
             
     System.out.println(pets.get(0).getName());
     System.out.println(pets.size());
     
   
    //return gson.toJson(pets);
    return  "{}";
        
    }

    @Path("/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getSpecificJson(@PathParam("id") Integer id) {
        
        Pet p = facade.getAllPets().get(id);
        return gson.toJson(p);
        
    }
    /**
     * PUT method for updating or creating an instance of PetResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
