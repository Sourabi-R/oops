class Animal {
    public void sound() {
        System.out.println("The animal makes a sound");
    }
}
class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("The dog barks");
    }
}
class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("The cat meows");
    }
}
public class Poly {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        myDog.sound();
        myCat.sound();
    }
}
