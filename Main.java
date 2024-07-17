
    interface Animal {

        void sound();
    
    }
    
    class Dog implements Animal {
    
        public void sound() {
    
            System.out.println("Woof");
    
        }
    
    }
    
    class Cat implements Animal {
    
        public void sound() {
    
            System.out.println("Meow");
    
        }
    
    }
    
    public class Main {
    
        public static void main(String[] args) {
    
           // Animal animal = new Dog();
    
            //animal.sound();
    
          Animal animal = new Cat(); // Line 1
    
            animal.sound();
    
        }
    
    }
    

