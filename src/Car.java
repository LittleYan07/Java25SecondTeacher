//類別 屬性&方法
public class Car {
    //屬性
    public String color;  //顏色屬性
    public String number;
    public int year = 0;

    //建構子(跟類別同名稱的方法) --->初始化物件屬性
    public Car (String inputNumber, String inputColor) {
        this.number = inputNumber;
        this.color = inputColor;
    }


    //方法
    public void showCarInfo() {
        System.out.println("Car number:" + this.number + "Car color:" + this.color);
                                     //自己類別(class)內的屬性
    }

}