class Animal {
    void makeSound() {
        System.out.println("animal sounds");
    }
}

class Dog extends Animal {
    
    void makeSound() {
        System.out.println("bark bark");
    }
}

class Cat extends Animal {
    
    void makeSound() {
        System.out.println("meow, meow");
    }
}

class AnimalTest03 {
    public static void main(String args[]) {
        Animal a;

        a = new Dog();  
        a.makeSound();  

        a = new Cat();  
        a.makeSound();  
    }
}
