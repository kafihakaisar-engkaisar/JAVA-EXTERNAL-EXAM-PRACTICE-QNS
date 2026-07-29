 class methodoverloading {
    void add(int a, int b){
        System.out.println("Sum = "+(a+b));
    }
    void add(int a, int b, int c){
        System.out.println("Sum = "+(a+b+c));
    }
    void add(double a, double b)
    {
        System.out.println("Sum= "+(a+b));
    }
}
  public class main{
    public static void main (String args[]){
        methodoverloading m=new methodoverloading();
        m.add(10,20);
        m.add(10,20,30);
        m.add(5.5,5.6);
    }
}

    


