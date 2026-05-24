//keep entering the numbers till user enter a multiple of 10
package javaprograms;
import java.util.*;
public class num1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        do{
            System.out.print("Enter the number: ");
            int n=sc.nextInt();
            if(n%10==0){
               break;
            }
            System.out.println(n);
        }while(true);
        sc.close();
    }
}


