/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package movistel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
        int n = 0, opcionMenu;
        BufferedReader lector = new BufferedReader( new InputStreamReader( System.in ) );
        boolean salir = false;
        Scanner sn = new Scanner(System.in);
        
        
        ArrayList<Regiones> rChile = new ArrayList();
        Ops operacion = new Ops();
        operacion.fillCollection(rChile);
        for (int k = 0; k < rChile.size(); k++) {
            operacion.fillCollection((rChile.get(k)).getClientes(), (rChile.get(k)).getNombre());   
        }
        
        while(!salir){
            try{
            
            operacion.printMenu();
            opcionMenu = sn.nextInt();
            
            switch(opcionMenu){
            //Caso 1 Mostrar regiones    
                case 1:
                    operacion.mostrarRegiones(rChile);
                    break;
            //Caso 2 Mostrar clientes de una region   
                case 2:                    
                    System.out.println("Ingrese el numero de la region la region de la que desea saber sus clientes");
                    n = Integer.parseInt(lector.readLine());
                    operacion.mostrarClientesRegion(rChile, n-1);
                    break;
            //Caso 3 Buscar cliente por rut    
                case 3:
                    operacion.buscarClienteRut(rChile);
                    break;    
            //Caso 4 Agregar cliente    
                case 4:
                    operacion.agregarCliente(rChile);
                    break;
            //Caso 5 Agregar region   
                case 5:
                    operacion.agregarRegion(rChile);
                    break;
                case 6:
                    operacion.clienteMayorDeuda(rChile);
                    break;
            //Caso 0 cierra el menu    
                case 0:
                    salir=true;
                    break;
                default:
                    System.out.println("Ingrese un numero entre el rango de opciones");
            }
            }catch(InputMismatchException e){
                System.out.println("INTRODUZCA UN NUMERO PORFAVOR");
                sn.next();
            }        
        }

        System.out.println("Fin aplicacion");
    
    }

}
