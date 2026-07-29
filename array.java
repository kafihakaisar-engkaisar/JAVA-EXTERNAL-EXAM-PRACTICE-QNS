// public class array {
//     public static void main(String[] args) {
//         int arr[]={10,20,30,40,50};
//         for(int i=0;i<arr.length; i++){
//             System.out.println(arr[i]);
//         }
//     }
    
// }

// TAKING INPUT FROM USERS

import java.util.*;
public class array{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter "+n+" numbers: ");

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array elements are: ");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
      sc.close();
        }

    }


    }
    