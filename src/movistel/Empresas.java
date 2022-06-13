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
public class Empresas extends Cliente {
    private String nombreEmpresa;
    private int idEquipo;
    private int piso;
    int cantidadquipos;
    public Empresas(String rut, int tplan, int deuda, String cob, int cel, String correo, String region, String comuna, String dir, boolean cS, int añoI, int cMensual, String nE, int iE, int p, int cE){
        super(rut,tplan,deuda,cob,cel,correo,region,comuna,dir,cS, añoI, cMensual);
        nombreEmpresa = nE;
        idEquipo = iE;
        piso = p;
        cantidadquipos = cE;
    }
}
