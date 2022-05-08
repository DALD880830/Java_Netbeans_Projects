
package lecturadearchivos;

import java.io.*;

public class archivos {
    
    public String leerTxt(String direcciondelarchivo){
        
        String texto = "";
        
        try{
            
            BufferedReader bf = new BufferedReader (new FileReader(direcciondelarchivo));
            String temp = "";
            String bfRead;
            while ((bfRead = bf.readLine()) != null){
                
                temp = temp + bfRead;
            }
            
            texto = temp;
            
        }catch(Exception e){
            
            System.err.println("El archivo no existe");
            
        }
        
        return texto;
    }
}
