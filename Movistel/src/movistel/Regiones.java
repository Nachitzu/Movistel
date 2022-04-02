/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movistel;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

/**
 *
 * @author Pip
 */
public class Regiones {

    private String nombre;
    private HashMap<String, Clientes> clientes;
    private int numero;

    public Regiones() {
        this.clientes = new HashMap();
      
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashMap<String, Clientes> getClientes() {
        return clientes;
    }

    public void setClientes(HashMap<String, Clientes> clientes) {
        this.clientes = clientes;
    }

    public void addHash(String clave, Clientes persona){
     this.clientes.put(clave,persona);   
    }
    
}
