// //1.TO ACCESS SUPERCLASSS VARIABLES
// class A{
//     int x=10;
// }
// class B extends A{
//     int x=20;

//     void show(){
//         System.out.println("Child x: "+x);
//         System.out.println("parent x: "+x);
//     }
// }
// public class superkeyword {
//     public static void main(String[] args) {
//         B obj=new B();
//         obj.show();
//     }
    
// }

// TO CALL SUPERCLASS METHOD
// class Animal{
//     void sound(){
//         System.out.println("Animal sound");
//     }
// }
// class Dog extends Animal{
//     void sound(){
//         super.sound();
//         System.out.println("Dog barks");
//     }
// }
// public class superkeyword{
//     public static void main(String[] args) {
//         Dog d=new Dog();
//         d.sound();
//     }

//     }

// TO CALL SUPERCLASS CONSTRUCTOR
class parent{
    parent(){
        System.out.println("parent constructor");
    }
}
class child extends parent{
    child(){
        super();
        System.out.println("child constructor");
    }
}
