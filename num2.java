//continue statement
//Display the number entered by user except multiple of 10
package javaprograms;
import java.util.*;
public class num2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        do{
            System.out.print("Enter the number: ");
            int n=sc.nextInt();
            if(n%10==0){
                continue;
            }
            System.out.println("number was: "+n);
        }while(true);
        
    }
}
