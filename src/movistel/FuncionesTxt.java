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
import java.io.FileWriter;
import java.io.IOException;
public class FuncionesTxt {
    public void crearTxtClientesRegion(String texto, int region){
        try {
            FileWriter myWriter = new FileWriter("ClientesRegion"+region+".txt");
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }   
    }
    
    public  void agregarATxtClientesRegion(String texto, int region)
    {
        try
        {
            String str = Integer.toString(region);
            String filePath = "\\ClientesRegion"+str+".txt";
            FileWriter fw = new FileWriter(filePath, true);    
            String lineToAppend = texto+"\n";    
            fw.write(lineToAppend);
            fw.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    public void crearTxtRegiones(String texto){
        try {
            FileWriter myWriter = new FileWriter("Regiones.txt");
            myWriter.write(texto);
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }   
    }
}

