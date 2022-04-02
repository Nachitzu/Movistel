/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package movistel;

import java.io.IOException;
import java.util.*;


/**
 * @author Nachitzu (Ignacio Núñez)
 * @author Idolatrine (Marcelo Galvez) 
 * @author Pipasooo (Felipe Godoy)
 */
public class Movistel {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        int n = 1;
        ArrayList<Regiones> rChile = new ArrayList();
        Ops operacion = new Ops();
        operacion.fillCollection(rChile);   
        System.out.println("Numero region y Nombre region");
        for(int k=0;k<rChile.size();k++){
         operacion.fillCollection((rChile.get(k)).getClientes(), (rChile.get(k)).getNombre());
         if(k==4){
          System.out.println((rChile.get(k)).getClientes().get("21.037.880-4").getCorreo());
         }
         
         System.out.print((rChile.get(k)).getNumero());
         System.out.println(" " + (rChile.get(k)).getNombre());
        }
        
        
        Plan objPlan = new Plan(1);
        System.out.println("Precio del plan A es " + objPlan.getPrecioPlan());

    }
    
}
