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
        
        //除法取整數 (分母不為0)
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

        // !=  (反轉)
        boolean isNotEqual = (a != b);
        System.out.println(isNotEqual);

        // +=  (加法後再賦值)
        int one = 5;
        one += 2;
        one = one + 2;
        System.out.println(one);

        // >
        boolean greaterThan = (a > b);
        System.out.println(greaterThan);

        // <
        boolean lessThan = (a < b);
        System.out.println(lessThan);

        // <=
        boolean lessThanOrEqual = (a <= b);
        System.out.println(lessThanOrEqual);

        /////////////////////////////////////////////
        
        // if else

        if(lessThanOrEqual) {
            System.out.println("a 確實 <= b");
        }
        else {
            System.out.println("a 沒有 <= b");
        }

        /////////////////////////////////////////////

        if(a == 2) {
            System.out.println("a : 2");
        }
        else if(a == 3) {
            System.out.println("a : 3");
        }
        else if(a == 4) {
            System.out.println("a : 4");
        }
        else {
            System.out.println("a 為2,3,4以外的數字");
        }

        /////////////////////////////////////////////
        //if...else...

        String min = (a < b) ? "A < B" : "B < A";
        //如果(a<b)為true min=A<B ， (a<b)為false min=B<A
        System.out.println(min); 

        //一個陣列裡有隨機7個數字，按照數字排大小 (if else)


        /////////////////////////////////////////////
        
        //for 迴圈
        for(int index = 0; index < 10; index++) {
            System.out.println(index);
        }






    }
}
