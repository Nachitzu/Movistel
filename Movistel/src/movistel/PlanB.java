/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movistel;

/**
 * @author Nachitzu (Ignacio Núñez)
 * @author Idolatrine (Marcelo Galvez) 
 * @author Pipasooo (Felipe Godoy)
 */
public class PlanB {
    private int precio;
    private int canalesHd;
    private int canales;
    private int peliculasFree;
    private int canalesVip;
    
    //constructor sin parametros
    public PlanB() {
        this.precio = 16990;
        this.canalesHd = 20;
        this.canales = 130;
        this.peliculasFree = 4;
        this.canalesVip = 9;
    }
    
    //Accesadores
    public int getPrecioB(){
        return precio;
    }
}
