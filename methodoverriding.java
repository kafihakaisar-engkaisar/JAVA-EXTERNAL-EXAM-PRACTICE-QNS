// METHODOVERRIDING
    class Animal{
        void sound(){
            System.out.println("Animal makes sound");
        }
    }
    class Dog extends Animal{
        void sound(){
            System.out.println("Dog barks");
        }
    }
    public class methodoverriding{
        public static void main(String[] args) {
            Dog obj=new Dog();
            obj.sound();
        }
        }