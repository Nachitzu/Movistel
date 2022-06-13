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
public class Cliente implements Deudor{

    private String rut;
    private String nombre;
    private int tipoPlan;
    private int deuda;
    private String cobertura;
    private int celular;
    private String correo;
    private String region;
    private String comuna;
    private String direccion;
    private double cargoMensual;
    private boolean clientStatus;
    private int añoIngreso;

    //Constructor con parametros
    public Cliente() {

    }

    public Cliente(String rut, int tipoPlan, int deuda, String cobertura, int celular, String correo, String region, String comuna, String direccion, boolean clientStatus, int añoIngreso, int cargoMensual) {
        this.rut = rut;
        this.tipoPlan = tipoPlan;
        this.deuda = deuda;
        this.cobertura = cobertura;
        this.celular = celular;
        this.correo = correo;
        this.region = region;
        this.comuna = comuna;
        this.direccion = direccion;
        this.clientStatus = clientStatus;
        this.añoIngreso = añoIngreso;
        this.cargoMensual = cargoMensual;
    }

    //Accesadores
    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public int getTipoPlan() {
        return tipoPlan;
    }

    public void setTipoPlan(int tipoPlan) {
        this.tipoPlan = tipoPlan;
    }

    public int getDeuda() {
        return deuda;
    }

    //Sobrecarga de métodos
    public void setDeuda(double deuda) {
        this.deuda = (int) deuda;
    }

    public void setDeuda(int deuda) {
        this.deuda = deuda;
    }

    public String getCobertura() {
        return cobertura;
    }

    public void setCobertura(String cobertura) {
        this.cobertura = cobertura;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCargoMensual() {
        return cargoMensual;
    }

    public void setCargoMensual(double cargoMensual) {
        this.cargoMensual = cargoMensual;
    }
    
     public void setCargoMensual(int cargoMensual) {
        this.cargoMensual = cargoMensual;
    }
     
    public void setStatus(boolean clientStatus) {
        this.clientStatus = clientStatus;
    }

    public boolean getStatus() {
        return clientStatus;
    }
    
    public int getAñoIngreso() {
        return añoIngreso;
    }

    public void isDeudor(Cliente cliente) {
        if (cliente.deuda > 0) {
            cliente.clientStatus = Deudor.DEUDOR;
        } else {
            cliente.clientStatus = Deudor.NODEUDOR;
        }
        
    }
 
   
     
    
     
     
     
     
}

