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
    public void fillCollection(HashMap<String, Cliente> mapa, String region) throws FileNotFoundException, IOException {

        CSV lector = new CSV("datosP");

        String aux = lector.firstLine();

        aux = lector.nextLine();

        while (aux != null) {
            Cliente clienteAux = new Cliente();
            if ((lector.get_csvField(aux, 7)).equals(region)) {
                clienteAux.setRut((lector.get_csvField(aux, 0)));
                clienteAux.setNombre((lector.get_csvField(aux, 1)));
                clienteAux.setTipoPlan(Integer.parseInt(lector.get_csvField(aux, 2)));
                clienteAux.setDeuda(Integer.parseInt(lector.get_csvField(aux, 3)));
                clienteAux.setCobertura((lector.get_csvField(aux, 4)));
                clienteAux.setCelular(Integer.parseInt(lector.get_csvField(aux, 5)));
                clienteAux.setCorreo((lector.get_csvField(aux, 6)));
                clienteAux.setRegion((lector.get_csvField(aux, 7)));
                clienteAux.setComuna((lector.get_csvField(aux, 8)));
                clienteAux.setDireccion((lector.get_csvField(aux, 9)));
                clienteAux.isDeudor(clienteAux);
                mapa.put(clienteAux.getRut(), clienteAux);
            }

            aux = lector.nextLine();
            if (aux == null) {
                break;
            }
        }

    }
//Metodo para rellenar ArrayList

    public void fillCollection(ArrayList<Region> rChile) throws FileNotFoundException, IOException {

        CSV lector = new CSV("Regiones");

        String aux = lector.firstLine();
        
        aux = lector.nextLine();
         
        int contador=0;       

        while (aux != null) {
            
            Region auxR = new Region();
            auxR.setNumero(Integer.parseInt(lector.get_csvField(aux, 0)));
            auxR.setNombre(lector.get_csvField(aux, 1));
            rChile.add(auxR);
            aux = lector.nextLine();
            contador++;
            if (aux == null) {
                break;
            }
        }
         
            
    }
//Metodo para agregar una region a la coleccion de regiones (No va a agregar una region ya existente)    

    public void agregarRegion(ArrayList<Region> rChile) throws IOException {
        boolean flag = true;
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        Region regionAux = new Region();
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

    public void printMenu() {
        System.out.println("*****Movistel*****");
        System.out.println("1)Mostrar regiones en las que se ofrece servicio");
        System.out.println("2)Mostrar clientes de una region");
        System.out.println("3)Buscar cliente por rut");
        System.out.println("4)Agregar cliente");
        System.out.println("5)Agregar region");
        System.out.println("6)Mostrar cliente con mayor deuda");
        System.out.println("7)Eliminar cliente por rut");
        System.out.println("8)Mostrar clientes por tipo de plan contratado");
        System.out.println("9)Mostrar lista deudores");
        System.out.println("0)Salir");
        System.out.println("Ingrese opcion: ");

    }
//Metodo para agregar un cliente a la coleccion    

    public void agregarCliente(ArrayList<Region> rChile) throws IOException {
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
        Cliente clienteAux = new Cliente();
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
            valorN = Integer.parseInt(lector.readLine());
            clienteAux.setTipoPlan(valorN);
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

    public void mostrarRegiones(ArrayList<Region> rChile) {
        FuncionesTxt fTxt = new FuncionesTxt();
        String str = "";
        System.out.println("---Regiones que abarca nuestra empresa---");
        for (int k = 0; k < rChile.size(); k++) {
            System.out.print((rChile.get(k)).getNumero());
            
            System.out.println(" " + (rChile.get(k)).getNombre());
            
        }
        
        fTxt.crearTxtRegiones(str);
        
    } 
//Metodo para printear todos los clientes almacenados en una region especifica    
    public int cantClientesRegion(ArrayList<Region> rChile, int nRegion){
        int cant =0;
        cant=(rChile.get(nRegion)).clientes.size();
        System.out.println(cant);
        return cant;
    }
    
    public void mostrarClientesRegion(ArrayList<Region> rChile, int nRegion) {
        int valorN;
        System.out.println("Clientes de " + rChile.get(nRegion).getNombre());
        FuncionesTxt fTxt = new FuncionesTxt();
        fTxt.crearTxtClientesRegion("", nRegion);
        System.out.println("Rut,Nombre,TipoPlan,Deuda,Cobertura,Celular,Correo,Region,Comuna,Direccion");
        Set<String> keys = (rChile.get(nRegion)).clientes.keySet();
        for (String key : keys) {
            String linea = "";
            String valor = (rChile.get(nRegion)).clientes.get(key).getRut();
            System.out.print(valor);
            linea = linea + valor + ",";
            valor = (rChile.get(nRegion)).clientes.get(key).getNombre();
            System.out.print("," + valor);
            linea = linea + valor + ",";
            valorN = (rChile.get(nRegion)).clientes.get(key).getTipoPlan();
            System.out.print("," + valor);
            linea = linea + valor + ",";
            valorN = (rChile.get(nRegion)).clientes.get(key).getDeuda();
            System.out.print("," + valorN);
            linea = linea + valor + ",";
            valor = (rChile.get(nRegion)).clientes.get(key).getCobertura();
            System.out.print("," + valor);
            linea = linea + valor + ",";
            valorN = (rChile.get(nRegion)).clientes.get(key).getCelular();
            System.out.print("," + valorN);
            linea = linea + valor + ",";
            valor = (rChile.get(nRegion)).clientes.get(key).getCorreo();
            System.out.print("," + valor);
            linea = linea + valor + ",";
            valor = (rChile.get(nRegion)).clientes.get(key).getRegion();
            System.out.print("," + valor);
            linea = linea + valor + ",";
            valor = (rChile.get(nRegion)).clientes.get(key).getComuna();
            System.out.print("," + valor);
            linea = linea + valor + ",";
            valor = (rChile.get(nRegion)).clientes.get(key).getDireccion();
            System.out.println("," + valor);
            linea = linea + valor;
            fTxt.agregarATxtClientesRegion(linea, nRegion);
        }
    }
//Metodo para buscar cliente por rut    

    public void buscarClienteRut(ArrayList<Region> rChile) throws IOException {
        int flag = 0;
        String sAux;
        Cliente clienteAux = new Cliente();
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese el rut del cliente que esta buscando");
        sAux = lector.readLine();
        for (int k = 0; k < rChile.size(); k++) {

            if ((rChile.get(k)).clientes.get(sAux) != null) {
                clienteAux = (rChile.get(k)).clientes.get(sAux);
                System.out.println("Rut,Nombre,TipoPlan,Deuda,Cobertura,Celular,Correo,Region,Comuna,Direccion");
                System.out.println(clienteAux.getRut() + "," + clienteAux.getNombre() + "," + clienteAux.getTipoPlan() + "," + clienteAux.getDeuda() + "," + clienteAux.getCobertura() + "," + clienteAux.getCelular() + "," + clienteAux.getCorreo() + "," + clienteAux.getRegion() + "," + clienteAux.getComuna() + "," + clienteAux.getDireccion());
                flag = 1;
                break;
            }
        }
        if (0 == flag) {
            System.out.println("-------------------------");
            System.out.println("No se encontro al cliente");
            System.out.println("-------------------------");
        }

    }
//Metodo para buscar al cliente con la mayor deuda

    public void clienteMayorDeuda(ArrayList<Region> rChile) {
        Cliente clienteAux = new Cliente();
        clienteAux.setDeuda(0);
        for (int k = 0; k < rChile.size(); k++) {
            Set<String> keys = (rChile.get(k)).clientes.keySet();

            for (String key : keys) {
                if (clienteAux.getDeuda() < (rChile.get(k)).clientes.get(key).getDeuda()) {
                    clienteAux = (rChile.get(k)).clientes.get(key);
                }
            }

        }
        System.out.println("CLIENTE CON MAYOR DEUDA");
        System.out.println("Rut,Nombre,TipoPlan,Deuda,Cobertura,Celular,Correo,Region,Comuna,Direccion");
        printCliente(clienteAux);    

    }

    public void eliminarClienteRut(ArrayList<Region> rChile) throws IOException {
        int flag = 0;
        String sAux;
        Cliente clienteAux = new Cliente();
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese el rut del cliente desea eliminar");
        sAux = lector.readLine();
        for (int k = 0; k < rChile.size(); k++) {

            if ((rChile.get(k)).clientes.get(sAux) != null) {
                clienteAux = (rChile.get(k)).clientes.get(sAux);
                System.out.println("Rut,Nombre,TipoPlan,Deuda,Cobertura,Celular,Correo,Region,Comuna,Direccion");
                System.out.println(clienteAux.getRut() + "," + clienteAux.getNombre() + "," + clienteAux.getTipoPlan() + "," + clienteAux.getDeuda() + "," + clienteAux.getCobertura() + "," + clienteAux.getCelular() + "," + clienteAux.getCorreo() + "," + clienteAux.getRegion() + "," + clienteAux.getComuna() + "," + clienteAux.getDireccion());
                (rChile.get(k)).clientes.remove(sAux);
                System.out.println("-----------------");
                System.out.println("Usuario Eliminado");
                System.out.println("-----------------");
                flag = 1;
                break;
            }
        }
        if (0 == flag) {
            System.out.println("-------------------------");
            System.out.println("No se encontro al cliente");
            System.out.println("-------------------------");
        }
    }
    
    //CLIENTES CON UN PLAN ESPECIFICO
    public void clientePlanE(ArrayList<Region> rChile) throws IOException {
        int valorN, flag=0;
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese el tipo de plan segun el cual desea buscar a los clientes.\nActualemente contamos con los sgtes:");
        planesEmpresa();
        valorN = Integer.parseInt(lector.readLine());
        while(valorN<1 || valorN>4){
            System.out.println("Recuerde que solo contamos con los sgtes planes:");
            planesEmpresa();
            valorN = Integer.parseInt(lector.readLine());
        }
        Cliente clienteAux = new Cliente();
        System.out.println("Clientes con el plan " + valorN);
        System.out.println("Rut,Nombre,TipoPlan,Deuda,Cobertura,Celular,Correo,Region,Comuna,Direccion");
        for (int k = 0; k < rChile.size(); k++) {
            Set<String> keys = (rChile.get(k)).clientes.keySet();

            for (String key : keys) {
                
                if (valorN == (rChile.get(k)).clientes.get(key).getTipoPlan()) {
                    flag++;
                    clienteAux = (rChile.get(k)).clientes.get(key);
                    printCliente(clienteAux);                    
                }
            }

        }
        if(flag==0){
            System.out.println("-------------------------------------------------");
            System.out.println("No se encontraron clientes con el plan solicitado");
            System.out.println("-------------------------------------------------");
        }

    }
    
    public void printRegion(ArrayList<Region> rChile, int k ){
        System.out.println((rChile.get(k).getNumero()) + (rChile.get(k).getNombre()));
    }
   
    public void printCliente(Cliente clienteAux){
      
        System.out.println(clienteAux.getRut() + "," + clienteAux.getNombre() + "," + clienteAux.getTipoPlan() + "," + clienteAux.getDeuda() + "," + clienteAux.getCobertura() + "," + clienteAux.getCelular() + "," + clienteAux.getCorreo() + "," + clienteAux.getRegion() + "," + clienteAux.getComuna() + "," + clienteAux.getDireccion());
    }
   
    public void planesEmpresa(){
    System.out.println("Plan 1 = 16990clp\n"
                     + "Plan 2 = 20990clp\n"
                     + "Plan 3 = 25990clp\n"
                     + "Plan 4 = 30990clp");    
}
    
    public void listaDeudores(ArrayList<Region> rChile){
        System.out.println("--------");
        System.out.println("DEUDORES");
        System.out.println("--------");
        System.out.println("Rut,Nombre,TipoPlan,Deuda,Cobertura,Celular,Correo,Region,Comuna,Direccion");    
         Cliente clienteAux = new Cliente();
        clienteAux.setDeuda(0);
        for (int k = 0; k < rChile.size(); k++) {
            Set<String> keys = (rChile.get(k)).clientes.keySet();

            for (String key : keys) {
                clienteAux = (rChile.get(k)).clientes.get(key);
                clienteAux.isDeudor(clienteAux);
                if (clienteAux.getStatus()) {
                    printCliente(clienteAux);
                }
            }

        }
    }
    
    public void crearOfertaCliente(Cliente c, int añoActual, int canalesExtra){
        double descuento = (añoActual-c.getAñoIngreso())*0.02;
        if(descuento>0.6){
            descuento = 0.6;
        }
        if(c.getDeuda()==0){
            System.out.println("El cliente no tiene ninguna deuda");
            System.out.println("Generando oferta...");
            c.setCargoMensual((int)(descuento*(c.getCargoMensual())));
            
            
        }else{
            System.out.println("El cliente presenta deudas, por lo que no se le pueden asignar ofertas");
        }
    }

}

