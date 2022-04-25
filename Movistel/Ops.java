/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package movistel;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 *
 * @author Pip
 */
public class Ops {

//Metodo para rellenar HashMap
    public void fillCollection(HashMap<String, Clientes> mapa, String region) throws FileNotFoundException, IOException {
        
        CSV lector = new CSV("datosP");
        
        
        
        String aux = lector.firstLine();

        aux = lector.nextLine();
 
        while (aux != null) {
        Clientes clienteAux = new Clientes();
        if((lector.get_csvField(aux,7)).equals(region)){
           clienteAux.setRut((lector.get_csvField(aux,0)));
           clienteAux.setNombre((lector.get_csvField(aux,1)));
           clienteAux.setTipoPlan((lector.get_csvField(aux,2)));
           clienteAux.setDeuda(Integer.parseInt(lector.get_csvField(aux,3)));
           clienteAux.setCobertura((lector.get_csvField(aux,4)));
           clienteAux.setCelular(Integer.parseInt(lector.get_csvField(aux,5)));
           clienteAux.setCorreo((lector.get_csvField(aux,6)));
           clienteAux.setRegion((lector.get_csvField(aux,7)));
           clienteAux.setComuna((lector.get_csvField(aux,8)));
           clienteAux.setDireccion((lector.get_csvField(aux,9)));
           mapa.put(clienteAux.getRut(), clienteAux);
        }
       
      
        aux = lector.nextLine();
            if(aux == null){
                break;
            }
        }
        
    }    
//Metodo para rellenar ArrayList
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
//Metodo para agregar una region a la coleccion de regiones (No va a agregar una region ya existente)    
    public void agregarRegion(ArrayList<Regiones> rChile) throws IOException {
        boolean flag = true;
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        Regiones regionAux = new Regiones();
        System.out.println("Ingrese el numero de la region que desea agregar:");
        regionAux.setNumero(Integer.parseInt(lector.readLine()));
        for (int k = 0; k < rChile.size(); k++) {
            if (regionAux.getNumero() == rChile.get(k).getNumero()) {
                System.out.println("Ya existe una region con este numero");
                flag = false;
            }
        }

        if (flag == true) {
            System.out.println("Ingrese el nombre de la region que se va a agregar:");
            regionAux.setNombre(lector.readLine());
            rChile.add(regionAux);

        }
    }
//Metodo para imprimir el menú de la aplicación
    public void printMenu(){
        System.out.println("*****Movistel*****");
        System.out.println("1)Mostrar regiones en las que se ofrece servicio");
        System.out.println("2)Mostrar clientes de una region");
        System.out.println("3)Buscar cliente por rut");
        System.out.println("4)Agregar cliente");
        System.out.println("5)Agregar region");
        System.out.println("6)Mostrar cliente con mayor deuda");
        System.out.println("0)Salir");
        System.out.println("Ingrese opcion: ");
        
    }
//Metodo para agregar un cliente a la coleccion    
    public void agregarCliente(ArrayList<Regiones> rChile) throws IOException {
        boolean flag = true;
        String valorS;
        int valorN, nRegion;
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingrese el numero de la region a la que pertenezca el cliente:");
        System.out.println("1,I Región de Tarapacá\n"
                + "2,II Región de Antofagasta\n"
                + "3,III Región de Atacama\n"
                + "4,IV Región de Coquimbo\n"
                + "5,V Región de Valparaíso\n"
                + "6,VI Región del Libertador General Bernardo O’Higgins\n"
                + "7,VII Región del Maule\n"
                + "8,VIII Región del Biobío\n"
                + "9,IX Región de La Araucanía\n"
                + "10,X Región de Los Lagos\n"
                + "11,XI Región Aysén del General Carlos Ibáñez del Campo\n"
                + "12,XII Región de Magallanes y Antártica Chilena\n"
                + "13,Región Metropolitana de Santiago\n"
                + "14,XIV Región de Los Ríos\n"
                + "15,XV Región de Arica y Parinacota\n"
                + "16,XVI Región de Ñuble");
        nRegion = Integer.parseInt(lector.readLine()) - 1;
        System.out.println("El cliente pertenece a " + rChile.get(nRegion).getNombre());
        Clientes clienteAux = new Clientes();
        System.out.println("Ingrese Rut:");
        valorS = lector.readLine();
        if ((rChile.get(nRegion)).clientes.get(valorS) != null) {
            flag = false;
        }
        if (flag == true) {
            clienteAux.setRut(valorS);
            System.out.println("Ingrese Nombre:");
            valorS = lector.readLine();
            clienteAux.setNombre(valorS);
            System.out.println("Ingrese el plan que va a elegir: \n"
                    + "Plan 1 = 16990clp\n"
                    + "Plan 2 = 20990clp\n"
                    + "Plan 3 = 25990clp\n"
                    + "Plan 4 = 30990clp");
            valorS = lector.readLine();
            clienteAux.setTipoPlan(valorS);
            //Deuda = 0
            valorN = 0;//Un cliente no puede ingresar con deuda
            clienteAux.setDeuda(valorN);
            clienteAux.setCobertura("Si");
            System.out.println("Ingrese su numero de telefono:");
            valorN = Integer.parseInt(lector.readLine());
            clienteAux.setCelular(valorN);
            System.out.println("Ingrese su correo electronico:");
            valorS = lector.readLine();
            clienteAux.setCorreo(valorS);
            valorS = rChile.get(nRegion).getNombre();
            clienteAux.setRegion(valorS);
            System.out.println("Ingrese su comuna: ");
            valorS = lector.readLine();
            clienteAux.setComuna(valorS);
            System.out.println("Ingrese su direccion: ");
            valorS = lector.readLine();
            clienteAux.setDireccion(valorS);
            rChile.get(nRegion).clientes.put(clienteAux.getRut(), clienteAux);
        }
        if (flag == false) {
            System.out.println("Ya existe un cliente con este Rut");
        }

    }
//Metodo para printear todas las regiones almacenadas    
    public void mostrarRegiones(ArrayList<Regiones> rChile){
        System.out.println("---Regiones que abarca nuestra empresa---");
        for(int k = 0; k < rChile.size(); k++) {
            System.out.print((rChile.get(k)).getNumero());
            System.out.println(" " + (rChile.get(k)).getNombre());
        }
        
        
        
    }
//Metodo para printear todos los clientes almacenados en una region especifica    
    public void mostrarClientesRegion(ArrayList<Regiones> rChile, int nRegion){
        int valorN;
        System.out.println("Clientes de " + rChile.get(nRegion).getNombre());
        System.out.println("Rut,Nombre,TipoPlan,Deuda,Cobertura,Celular,Correo,Region,Comuna,Direccion");
        Set<String> keys = (rChile.get(nRegion)).clientes.keySet();
        for(String key:keys){
            String valor = (rChile.get(nRegion)).clientes.get(key).getRut();
            System.out.print(valor);
            valor = (rChile.get(nRegion)).clientes.get(key).getNombre();
            System.out.print(","+valor);
            valor = (rChile.get(nRegion)).clientes.get(key).getTipoPlan();
            System.out.print(","+valor);
            valorN = (rChile.get(nRegion)).clientes.get(key).getDeuda();
            System.out.print(","+valorN);
            valor = (rChile.get(nRegion)).clientes.get(key).getCobertura();
            System.out.print(","+valor);
            valorN = (rChile.get(nRegion)).clientes.get(key).getCelular();
            System.out.print(","+valorN);
            valor = (rChile.get(nRegion)).clientes.get(key).getCorreo();
            System.out.print(","+valor);
            valor = (rChile.get(nRegion)).clientes.get(key).getRegion();
            System.out.print(","+valor);
            valor = (rChile.get(nRegion)).clientes.get(key).getComuna();
            System.out.print(","+valor);
            valor = (rChile.get(nRegion)).clientes.get(key).getDireccion();
            System.out.println(","+valor);
        }
    }
//Metodo para buscar cliente por rut    
    public void buscarClienteRut(ArrayList<Regiones> rChile) throws IOException{
        String sAux;
        Clientes clienteAux = new Clientes();
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese el rut del cliente que esta buscando");
        sAux = lector.readLine();
        for(int k = 0 ; k < rChile.size(); k++){
            
            if((rChile.get(k)).clientes.get(sAux)!=null){
                clienteAux = (rChile.get(k)).clientes.get(sAux);
                System.out.println("Rut,Nombre,TipoPlan,Deuda,Cobertura,Celular,Correo,Region,Comuna,Direccion");
                System.out.println(clienteAux.getRut()+","+clienteAux.getNombre()+","+clienteAux.getTipoPlan()+","+clienteAux.getDeuda()+","+clienteAux.getCobertura()+","+clienteAux.getCelular()+","+clienteAux.getCorreo()+","+clienteAux.getRegion()+","+clienteAux.getComuna()+","+clienteAux.getDireccion());
                break;
            }
        }
        
        
    }
//Metodo para buscar al cliente con la mayor deuda
    public void clienteMayorDeuda(ArrayList<Regiones> rChile){
        Clientes clienteAux = new Clientes();
        clienteAux.setDeuda(0);
        for(int k = 0;k<rChile.size();k++){
        Set<String> keys = (rChile.get(k)).clientes.keySet();
        
        for(String key:keys){
            if(clienteAux.getDeuda()<(rChile.get(k)).clientes.get(key).getDeuda()){
                clienteAux=(rChile.get(k)).clientes.get(key);
            }
        }
        
        }
        System.out.println("CLIENTE CON MAYOR DEUDA");
       System.out.println("Rut,Nombre,TipoPlan,Deuda,Cobertura,Celular,Correo,Region,Comuna,Direccion");
       System.out.println(clienteAux.getRut()+","+clienteAux.getNombre()+","+clienteAux.getTipoPlan()+","+clienteAux.getDeuda()+","+clienteAux.getCobertura()+","+clienteAux.getCelular()+","+clienteAux.getCorreo()+","+clienteAux.getRegion()+","+clienteAux.getComuna()+","+clienteAux.getDireccion()); 

    }
}
