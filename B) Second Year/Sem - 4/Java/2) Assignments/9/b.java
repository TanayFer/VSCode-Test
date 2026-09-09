class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

public class b extends Animal {
    @Override
    public void sound() {
        super.sound();
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        b dog = new b();

        animal.sound();
        dog.sound();
    }
}