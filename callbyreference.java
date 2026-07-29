public class callbyreference {
    int value;

 
    static void change(callbyreference n){
        n.value=100;
    }
    public static void main(String args[]){
        callbyreference obj=new callbyreference();
        obj.value=10;

        System.out.println("before: "+obj.value);
        change(obj);
        System.out.println("After: "+obj.value);
    }

    
}
