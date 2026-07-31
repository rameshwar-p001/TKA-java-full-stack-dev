package Day23.Protected.Inheriteancec;



public class Dog extends Animal {

    void bark() {
        super.sound();
        System.out.println("Dog Bark");
    }


        public static void main(String[] args) {

        Dog d = new Dog();

        d.bark();
    }
}

