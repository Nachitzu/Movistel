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

    private String nombre;
    private String tipoPlan;
    private int deuda;
    private String cobertura;
    private int celular;
    private String correo;
    private String region;
    private String comuna;
    private String direccion;
    private double oferta;

    //Constructor con parametros
    public Clientes() {

    }

    public Clientes(String rut, String tipoPlan, int deuda, String cobertura, int celular, String correo, String region, String comuna, String direccion) {
        this.rut = rut;
        this.tipoPlan = tipoPlan;
        this.deuda = deuda;
        this.cobertura = cobertura;
        this.celular = celular;
        this.correo = correo;
        this.region = region;
        this.comuna = comuna;
        this.direccion = direccion;
    }

    //Accesadores
    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getTipoPlan() {
        return tipoPlan;
    }

    public void setTipoPlan(String tipoPlan) {
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

    public double getOferta() {
        return oferta;
    }

    public void setOferta(double oferta) {
        this.oferta = oferta;
    }
    
     public void setOferta(int oferta) {
        this.oferta = oferta;
    }
}
