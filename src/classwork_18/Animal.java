package classwork_18;

class Animal {
    void speak() {System.out.println("speaking");}
}
class Cat extends Animal {
    @Override
    void speak() {System.out.println("Meow");}
}
