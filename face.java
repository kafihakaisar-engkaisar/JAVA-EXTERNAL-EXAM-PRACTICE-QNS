interface vehicle{
    void start();
    }

    class Car implements vehicle{
        public void start(){
            System.out.println("Car starts with key");
        }
    }
    public class face{
        public static void main(String[] args) {
            Car c=new Car();
            c.start();
        }
    }
        


