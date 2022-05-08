
package lecturaescritura;

import java.io.*;


public class Lectura {
    
    public String leerTxt(String leertexto){
        
        String texto1 = "";
        
        try{
            FileReader fr = new FileReader("miarchivo.txt");
            BufferedReader br = new BufferedReader(fr);
            System.out.println(br.readLine());
        }catch (Exception err){
            System.out.println(err.getMessage());
        }
        return texto1;
    }
    
}
