
package lecturaescritura;


public class Principal {
    
    public static void main(String[] args) {
        
      Escritura prueba = new Escritura();
      String s1 = prueba.escribirTxt("");
      
      System.out.println("Archivo Creado");
      
      System.out.println("");
      
      System.out.println("Ahora leemos el archivo");
      
      System.out.println("");
      
      Lectura probando = new Lectura();
      String ab = probando.leerTxt("");
      
      System.out.println(ab);
      
        
    }
}
