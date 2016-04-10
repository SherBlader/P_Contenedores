/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dickson
 */
public class Archivo {
    
    public static void crear_archivo(String nombre_archivo, String cadena)
    {
        FileWriter fw = null;
        try {
            File f = new File(nombre_archivo);
            fw = new FileWriter(f);
            fw.write(cadena);
            fw.close();
            
            
            
        } catch (IOException ex) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//Fin crear_archivo
    
    
    
    
    
    
    
    
}//Fin main
