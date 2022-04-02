/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package movistel;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

/**
 *
 * @author Pip
 */
public class Ops {

    
    public void fillCollection(HashMap<String, Clientes> mapa, String region) throws FileNotFoundException, IOException {
        
        CSV lector = new CSV("datosP");
        
        
        
        String aux = lector.firstLine();

        aux = lector.nextLine();
 
        while (aux != null) {
        Clientes clienteAux = new Clientes();
        if((lector.get_csvField(aux,6)).equals(region)){
           clienteAux.setRut((lector.get_csvField(aux,0)));
           clienteAux.setTipoPlan((lector.get_csvField(aux,1)));
           clienteAux.setDeuda(Integer.parseInt(lector.get_csvField(aux,2)));
           clienteAux.setCobertura((lector.get_csvField(aux,3)));
           clienteAux.setCelular(Integer.parseInt(lector.get_csvField(aux,4)));
           clienteAux.setCorreo((lector.get_csvField(aux,5)));
           clienteAux.setRegion((lector.get_csvField(aux,6)));
           clienteAux.setComuna((lector.get_csvField(aux,7)));
           clienteAux.setDireccion((lector.get_csvField(aux,8)));
           mapa.put(clienteAux.getRut(), clienteAux);
        }
       
      
        aux = lector.nextLine();
            if(aux == null){
                break;
            }
        }
        
    }
        
    public void fillCollection(ArrayList<Regiones> rChile) throws FileNotFoundException, IOException {

        CSV lector = new CSV("Regiones");

        String aux = lector.firstLine();

        aux = lector.nextLine();

        while (aux != null) {
            Regiones auxR = new Regiones();
            auxR.setNumero(Integer.parseInt(lector.get_csvField(aux,0)));
            auxR.setNombre(lector.get_csvField(aux, 1));
            rChile.add(auxR);
            aux = lector.nextLine();

            if (aux == null) {
                break;
            }
        }

    }
    
    
    
    
}
