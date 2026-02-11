package PST;

public class singleinheritance{
	
    public static void main(String[] args) {

    	Animal obja = new Animal();
    	obja.noise();
    	
        Dog objd = new Dog();
        objd.sound();
        
    }
}


class Animal {
   static  void noise() {
        System.out.println("Animal makes a sound");
    }
}


class Dog extends Animal {
   static void sound() {
        System.out.println("Dog is barking");
    }
}
