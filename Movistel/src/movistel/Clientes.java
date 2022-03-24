/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movistel;

/**
 *
 * @author Nachitzu (Ignacio Núñez)
 * @author Idolatrine (Marcelo Galvez) 
 * @author Pipasooo (Felipe Godoy)
 */
public class Clientes {
    private String rut;
    private String tipoPlan;
    private int deuda;
    private boolean cobertura;
    private int celular;
    private String correo;
    private String region;
    private String direccion;
    
    
    //Constructor con parametros
    
    public Clientes (String rut, String tipoPlan, int deuda, boolean cobertura, int celular, String correo, String region, String direccion){
        this.rut = rut;
        this.tipoPlan = tipoPlan;
        this.deuda = deuda;
        this.cobertura = cobertura;
        this.celular = celular;
        this.correo = correo;
        this.region = region;
        this.direccion = direccion;
        
    } 
    
    //Accesadores
    public String getRut(){
        return rut;
    }
    
    public String getTipoPlan(){
        return tipoPlan;
    }
    
    public int getDeuda(){
        return deuda;
    }
    
    public boolean getCobertura(){
        return cobertura;
    }
    
    public int getCelular(){
        return celular;
    }
    
    public String getCorreo(){
        return correo;
    }
    
    public String getRegion(){
        return region;
    }
    
    public String getDireccion(){
        return direccion;
    }
    
}
