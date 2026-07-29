//import java.util.*;
public class binarysearch {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int search=10;
        int lr=0;
        int up=arr.length-1;
        boolean found=false;
        while(lr<=up){
            int mid=(lr+up)/2;

            if(arr[mid]==search)
            {
                System.out.println("Element found at index "+mid);
                found=true;
                break;
            }
            else if(arr[mid]<search){
                lr=mid+1;
            }
            else{
                up=mid-1;
            }
        }
        if(!found){
            System.out.println("Element not found");
        }

    }
}
