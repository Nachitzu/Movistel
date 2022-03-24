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
public class PlanA {
    private int precio;
    private int canalesHd;
    private int canales;
    private int peliculasFree;
    private int canalesVip;
    
    //constructor sin parametros
    public PlanA() {
        this.precio = 9990;
        this.canalesHd = 10;
        this.canales = 100;
        this.peliculasFree = 2;
        this.canalesVip = 3;
    }
    
    //Accesadores
    public int getPrecioA(){
        return precio;
    }
}
