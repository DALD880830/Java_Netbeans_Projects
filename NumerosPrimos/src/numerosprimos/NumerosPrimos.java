
package numerosprimos;

import java.util.Scanner;


public class NumerosPrimos {
    
    int limite, numero, contador, aux, i, cont;
    int acumulador = 0;
    Scanner entrada1 = new Scanner(System.in);
    
    public NumerosPrimos()
    {
        System.out.print("¿Hasta que numeros quieres los numeros primos?: ");
        limite = entrada1.nextInt();
        
        for (i=1; i<=limite;i++)
        {
            if(Primo(i))
            {
                System.out.println("# Primo: "+i);
                acumulador = acumulador + i;
            }
        }
        
        System.out.println("La suma de los numeros primos es: "+acumulador);
        
    }
    
    private boolean Primo(int numero) {
        
        for (cont=2; cont < numero; cont++)
        {
            aux = numero % cont;
            if(aux==0)
                return false;
        }
        return true;
    }
    
     public static void main(String[] args) {
       
        NumerosPrimos numeros = new NumerosPrimos();
        
    }
}
