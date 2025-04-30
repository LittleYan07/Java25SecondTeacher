package lesson2;

public class Cat extends Animal {
    public void meow() {
        System.out.println("貓在喵喵叫");
    }

    @Override
    public void speak() {
        System.out.println("動物發出聲音:貓在喵喵叫");
    }
}