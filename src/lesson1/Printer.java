package lesson1;

public class Printer {
    public static void main(String[] args) {
        //多載介紹
        Printer p1 = new Printer();
        p1.show();
        p1.show(1);
        p1.show("Test1");
        p1.show("Test2", "Test3");
        p1.show("Test4", 2);
    }

    public void show() {
        System.out.println("No arguments");
    }

    public void show(int number) {
        System.out.println("Integer argument: " + number);
    }

    public void show(String text) {
        System.out.println("String argument: " + text);
    }

    public void show(String text1, String text2) {
        System.out.println("Two String arguments: " + text1 + ", " + text2);
    }

    public void show(String text, int number) {
        System.out.println("String and Integer arguments: " + text + ", " + number);
    }
}

//產生一個 Area 類別
//產生 Method 名稱為cal()
//分別產出圓形面積計算 三角形面積計算 長方形面積計算

