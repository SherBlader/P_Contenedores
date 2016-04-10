/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;

import java.util.LinkedList;

/**
 *
 * @author Cheess
 */
public class CMetodos {
    
    public static LinkedList lp = new LinkedList();
    public static Persona aux;
    
    public static void adicionar(Persona p)
    {
        lp.add(p);
    }
    
    public static String imprimir_listado()
    {
      String cad="";
      Persona p=null;
      
      for(int i=0; i<lp.size(); i++)
      {
       p = (Persona)lp.get(i);
       cad+=p.getCedula() + "\t" + p.getNombre()+ "\t" + p.getTelefono()+ "\n";
                 
      }
      
      return cad;
          
    }
    
   
    
    public static boolean buscar_persona(String ced)
    {
      boolean saber = false;
      Persona p=null;
      for(int i=0; i<lp.size(); i++)
      {
       p = (Persona)lp.get(i);
       if(p.getCedula().equals(ced))
       {
         aux=p;
         saber=true;
         break;
       }
      
      }
    return saber;
}
}