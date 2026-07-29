import java.util.*;
public class Decisionmaking {
    public static void main(String args[]){
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a no.= ");
        a=sc.nextInt();

    //    if-statement
        // if(a>0){
        //     System.out.println(a+" is greater than zero");
        // }

        // if-else statement
        // if(a>18){
        //     System.out.println("eligible for vote");
        // }
        // else{
        //     System.out.println("Not eleigible for vote");
        // }

        // else-if statement
        if(a>0){
            System.out.println("It is a positive no.");
            if(a%2==0){
                System.out.println("It is divisible by 2");
            }
            else if(a%7==0){
                System.out.println("It is divisible by 7");
            }
        }
        else{
            System.out.println("The no. is negative or zero");
        }
        sc.close();
    }
    
}
