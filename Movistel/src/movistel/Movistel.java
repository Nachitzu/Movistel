/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package movistel;

/**
 * @author Nachitzu (Ignacio Núñez)
 * @author Idolatrine (Marcelo Galvez) 
 * @author Pipasooo (Felipe Godoy)
 */
public class Movistel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PlanA objPlanA = new PlanA();
        System.out.println("Precio del plan A es " + objPlanA.getPrecioA() );
        PlanB objPlanB = new PlanB();
        System.out.println("Precio del plan B es " + objPlanB.getPrecioB() );
    }
    
}
