//SINGLE INHERITANCE

// public class inheritance {
//     int roll,marks;
//     String name;
//     void input(){
//         System.out.println("Enter roll name and marks: ");
//     }
// }
// class ankit extends inheritance{
//     void disp(){
//         roll=1;name="ankit";marks=99;
//         System.out.println(roll+" "+name+" "+marks);
//     }
//     public static void main(String[] args) {
//         ankit r=new ankit();
//         r.input();
//         r.disp();
//     }
    
// }

//MULTILEVEL INHERITANCE
// class inheritance{
//     void inheritanceinfo(){
//         System.out.println("student details");
//     }
// }
// class marks extends inheritance{
//     void marksinfo(){
//         System.out.println("marks=95");
//     }
// }
// class result extends marks{
//     void resultinfo(){
//         System.out.println("result=pass");
//     }
//     public static void main(String[] args) {
//         result r=new result();
//         r.inheritanceinfo();
//         r.marksinfo();
//         r.resultinfo();
//     }

//     }


// MULTIPLE INHERITANCE
// interface A{
//     void show();
// }
// interface B{
//     void display();
// }
// class inheritance implements A,B{
//     public void show(){
//         System.out.println("hello from A");
//     }
//     public void display(){
//         System.out.println("hello from B");
//     }
//     public static void main(String[] args) {
//         inheritance obj=new inheritance();
//         obj.show();
//         obj.display();
//     }
//     }

// HIERARCHICAL INHERITANCE
class Animal{
    void eat(){
        System.out.println("Animal can eat");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog can bark");
    }
}
class Cat extends Animal{
    void meow(){
     System.out.println("cat can meow");
    }
}
public class inheritance{
    public static void main (String args[]){
        Dog d=new Dog();
        d.eat();
        d.bark();
        
        Cat c=new Cat();
        c.eat();
        c.meow();
    }

}
        
