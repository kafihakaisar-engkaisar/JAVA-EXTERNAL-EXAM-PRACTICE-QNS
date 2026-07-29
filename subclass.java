class parent{
    int age;

    parent(int age){
        this.age=age;
        System.out.println("Age : "+age);
    }
}
class child extends parent{
    child(int age){
        super(age);
    }
}

public class subclass {
    public static void main(String[] args) {
       child obj=new  child(20 );
    }
    
}
