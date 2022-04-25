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
public class Plan {
    private int id;
    private int precio;

    public Plan ( int price ) {
        id = price;

        switch (price) {
            case 1:
                precio = 16990;
                break;
            case 2:
                precio = 20990;
                break;
            case 3:
                precio = 25990;
                break;
            case 4:
                precio = 30990;
                break;
            default:
                precio = 0;
                break;
        }
    }

    Plan() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getId() {
        return id;
    }

    public int getPrecioPlan() {
        return precio;
    }
}