/*areatriangulo*/
package boletin2.pkg1;

import java.util.Scanner;

public class Boletin21 {

    public static void main(String[] args) {
       float base,altura,area;
       System.out.println("introduce base:");
 Scanner dato=new Scanner(System.in);
 base=dato.nextFloat();
 System.out.println("introducir altura");
 Scanner dato2=new Scanner(System.in);
 altura=dato2.nextFloat();
 System.out.println("area="+((base*altura)/2));
 
    }
    
}
