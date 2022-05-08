
package lecturaescritura;

import java.io.*;

public class Escritura {
    
    public String escribirTxt(String escribirtexto){
        
        String texto = "PRUEBA DE ESCRITURA EN UN ARCHIVO TXT";
        
        try{
            PrintWriter pw = new PrintWriter ("miarchivo.txt");
            pw.println(texto);
            pw.close();
        }catch (Exception err){
            System.out.println(err.getMessage());
        }
        return texto;
    }
    
}
