
package bosucgen;

import java.util.Scanner;
public class Bosucgen {

    
    public static void main(String[] args) {
       Scanner klavye=new Scanner(System.in);
        System.out.println("Satır sayısı giriniz:");
       int rows=klavye.nextInt();
       int i, j, k;  
    for (i=1; i<= rows ; i++) {  
    
        for (j = i; j < rows ; j++)  {  
        
            System.out.print(" ");  }     
    
    for (k = 1; k <= (2*i -1) ;k++)   {  
    
        if(k==1 || i == rows || k==(2*i-1))   {  

            System.out.print("*");  
        }  
    else   
{  
            System.out.print(" ");  
}  
}  
    System.out.println("");  
}  
}  
}
    

