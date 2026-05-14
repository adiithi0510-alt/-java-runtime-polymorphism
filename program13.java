class Animal {
public void sound() {
System.out.println("Animal makes a sound.");
}
}
class Dog extends Animal {
public void sound() {
System.out.println("Dog barks:");
}
}
class Cat extends Animal{
public void sound() {
System.out.println("Cat meows:");
}
}
class Program13 {
public static void main(String[] args) {
Animal myAnimal;
myAnimal= new Dog();
myAnimal.sound();
myAnimal = new Cat();
myAnimal.sound();
}
}