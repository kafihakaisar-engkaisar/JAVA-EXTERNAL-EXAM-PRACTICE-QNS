// DEFAULT CONSTRUCTOR

// public class constructor {
//     constructor(){
//         System.out.println("constructor called");
//     }
//     public static void main(String args[]){
//         constructor c=new constructor();
        
    
//     }
// }

// PARAMETERISED CONSTRUCTOR
// class constructor{
//     String name;
//     int age;

//     constructor(String n, int a){
//         name=n;
//         age=a;
//     }

//     void display(){
//         System.out.println("Name: " +name);
//         System.out.println("age: "+age);
//     }

//     public static void main(String args[]){
//         constructor c=new constructor("kafiha", 21);
//         c.display();
//     }
// }


//COPY CONSTRUCTOR 
class constructor{
     String name;
     int age;

     //parameterized constructor
      constructor(String name, int age){
         this.name=name;
         this.age=age;
     }
     //copy constructor
     constructor(constructor c){
         this.name=c.name;
         this.age=c.age;
     }
     void display(){
         System.out.println(name+" "+age);
     }
     public static void main(String[] args) {
         constructor c1=new constructor("kafiha", 20);
         constructor c2=new constructor(c1);
       c2.display();
     }
         }

// PRIVATE CONSTRUCTOR

/**
 * constructor
 */
//public class constructor {

    
// class  constructor{
//     private constructor(){
//         System.out.println("Private constructor called");
//     }
//     public static void main(String args[]){
//         constructor c=new constructor();
//     }
// }

