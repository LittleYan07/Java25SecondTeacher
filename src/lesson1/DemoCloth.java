package lesson1;

public class DemoCloth {
    public static void main(String[] args) {
        
        Cloth c1 = new Cloth("red", "M", "01");
        //Cloth c1 = new Cloth();

        //變更
        c1.showClothInfo();
        c1.color = "yellow";

        c1.showClothInfo();
        c1.size = "L";
        
        System.out.println(c1.color);
    }
}