package lesson2;

public class Demo{
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.speak();
        
        //新增Dog類別，繼承Animal
        Dog d1 = new Dog();
        d1.speak();
        d1.bark();

        //新增Cat 類別，繼承Animal
        //新增一個method: meow()
        //印出 "貓在喵喵叫"
        Cat c1 = new Cat();
        c1.speak();
        c1.meow();
    }
}




