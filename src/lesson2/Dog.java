package lesson2;

public class Dog extends Animal {
    public Dog() {
        //super();
    }

    public void bark() {
        System.out.println("汪汪汪！");
    }

    //覆寫Override
    @Override
    public void speak() {
        System.out.println("動物發出聲音:汪汪汪！");
    }

}