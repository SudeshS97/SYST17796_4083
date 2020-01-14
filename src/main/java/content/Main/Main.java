
package content.Main;

import content.StudentData;
import java.util.Scanner;


public class Main {
    
    public static void main (String []args){
        
    Scanner input = new Scanner (System.in);
    StudentData a[] = new StudentData[5];
    
    for(int i =0; i < a.length; i ++){
        System.out.println("What is the students name: ");
        a[i]= new StudentData();
        String name = input.next();
        a[i].setName(name);
    }
    
        System.out.println("-------------------------------------------------");
        
    for(int i = 0; i < a.length; i++){
        System.out.print((i + 1) + ". ");
        System.out.println(a[i].getName());
    }
    }
}
