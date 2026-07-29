import java.util.*;
public class switchcase {
    public static void main(String args[]){
        int ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("1. ADDITION");
        System.out.println("2. SUBTRACTION");
        System.out.println("3. MULTIPLICATION");
        System.out.println("4. DIVISION");
        System.out.println("5. REMAINDER");
        System.out.print("Enter Your Choice: ");
        ch=sc.nextInt();

        switch(ch){
            case 1:{
                int a,b,c;
                System.out.println("Enter the value of a and b : ");
                a=sc.nextInt();
                b=sc.nextInt();
                c=a+b;
                System.out.println(a+" + "+b+" = "+c);
                break;
            }

            case 2:{
                int a,b,c;
                System.out.println("Enter the value of a and b : ");
                a=sc.nextInt();
                b=sc.nextInt();
                c=a-b;
                System.out.println(a+" - "+b+" = "+c);
                break;
            }
            case 3:
             {
                int a,b,c;
                System.out.println("Enter the value of a and b : ");
                a=sc.nextInt();
                b=sc.nextInt();
                c=a*b;
                System.out.println(a+" * "+b+" = "+c);
                break;
             }

            case 4:{
                int a,b,c;
                System.out.println("Enter the value of a and b : ");
                a=sc.nextInt();
                b=sc.nextInt();
                c=a/b;
                System.out.println(a+" / "+b+" = "+c);
                break;
            }

            case 5:{
                int a,b,c;
                System.out.println("Enter the value of a and b : ");
                a=sc.nextInt();
                b=sc.nextInt();
                c=a%b;
                System.out.println(a+" % "+b+" = "+c);
                break;
            }
            default:
                System.out.println("wrong choice");
                break;
            
        }
        sc.close();
    }

}
