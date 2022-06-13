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
public class Empleados extends Cliente{
    private String sucursal;
    private String cargo;
    private int sueldo;
    private int bonos;
    public Empleados(String rut, int tplan, int deuda, String cob, int cel, String correo, String region, String comuna, String dir, boolean cS, int añoI, int cMensual, String suc, String crg, int sldo, int bns ){
        super(rut,tplan,deuda,cob,cel,correo,region,comuna,dir,cS, añoI, cMensual);
        suc = sucursal;
        crg = cargo;
        sldo = sueldo;
        bns = bonos;
        
    }
}
