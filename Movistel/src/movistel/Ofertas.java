/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movistel;

/**
 *
 * @author Nacho
 */
public abstract class Ofertas {
    Cliente usuario;
    int descuento;
    int canalesExtra;
    public abstract int getDescuento();
    public void setDescuento(int p){
        descuento = p;
    }
    
    
    public class offEmpresas extends Ofertas{
        int ranking;
        Empresas empresa;
        public int getDescuento(){
            return descuento;
        }
    }
    
    public class offEmpleados extends Ofertas{
        Empleados empleado;
        double porcentajeMetas;
        int añoIngreso;
        int mesIngreso;
        public int getDescuento(){
            return descuento;
        }
    }

}
