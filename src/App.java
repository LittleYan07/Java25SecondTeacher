public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
        //宣告變數(初始值)
        //int 整數(型別)
        int age = 25;
        System.out.println(age);

        double weight = 49.49;
        System.out.println(weight);

        String name = "Yan";
        System.out.println(name);

        int[] bingo = {7, 13, 14, 23, 42};
        System.out.println(bingo[0]);

        String[] names = {"Momo", "Mina", "Sana"};
        System.out.println(names[2]);

        boolean isStudent = true; //若否 false
        System.out.println(isStudent);



        //加減乘除
        //數字型別只能是int或double
        int a = 5;
        int b = 6;
        int sum = a + b;
        System.out.println(sum);

        int diff1 = b - a;
        System.out.println(diff1);
        int diff2 = a - b;
        System.out.println(diff2);

        int product = a * b;
        System.out.println(product);
        
        //除法取整數
        int quotiend1 = a / b;
        System.out.println(quotiend1);

        int quotiend2 = b / a;
        System.out.println(quotiend2);

        //除法取餘數
        int remainder = a % b;
        System.out.println(remainder);

        /////////////////////////////////////////////
         
        // ==
        boolean isEqual = (a == b);
        System.out.println(isEqual);

        // !=
        boolean isNotEqual = (a != b);
        System.out.println(isNotEqual);

        // >
        boolean greaterThan = (a > b);
        System.out.println(greaterThan);

        // <
        boolean lessThan = (a < b);
        System.out.println(lessThan);



    }
}
