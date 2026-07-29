// 1.SIMPLE CLASS

// public class createclasss {
//     String name="kafiha";

//     void display(){
//         System.out.println("hello "+name);
//     }
//     public static void main (String args[]){
//         createclasss c=new createclasss();
//         c.display();
//     }

    
// }

// 2.TWO CLASSES

class createclasss{ 
    void start(){
        System.out.println("car Started.");
    }
}
public class start{
public static void main (String args[]) {
    createclasss c=new createclasss();
    c.start();
}
}


