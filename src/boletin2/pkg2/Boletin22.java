//area de un cuadrado
package boletin2.pkg2;

import java.util.Scanner;
public class Boletin22 {

        public static void main(String[] args) {
        System.out.println("introducimos la base: ");
        Scanner base = new Scanner (System.in);
        
        int lado = 0;
        int area = 0;
        
        lado = base.nextInt();
        
        area = lado * lado;
        
        System.out.println(area);
        
      
    }
    
}
