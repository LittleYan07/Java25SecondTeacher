public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // 宣告變數(初始值)
        // int 整數(型別)
        int age = 25;
        System.out.println(age);

        double weight = 49.49;
        System.out.println(weight);

        String name = "Yan";
        System.out.println(name);

        int[] bingo = { 7, 13, 14, 23, 42 };
        System.out.println(bingo[0]);

        String[] names = { "Momo", "Mina", "Sana" };
        System.out.println(names[2]);

        boolean isStudent = true; // 若否 false
        System.out.println(isStudent);

        // 加減乘除
        // 數字型別只能是int或double
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

        // 除法取整數 (分母不為0)
        int quotiend1 = a / b;
        System.out.println(quotiend1);

        int quotiend2 = b / a;
        System.out.println(quotiend2);

        // 除法取餘數
        int remainder = a % b;
        System.out.println(remainder);

        
        /////////////////////////////////////////////
        
        /* ==  (等於)
        boolean isEqual = (a == b);
        System.out.println(isEqual); */

        /* ||  (或者)
        boolean or = (a < b) || (b < a);
        System.out.println(or); */

        /* !  (反轉)
        boolean not = !(a < b);
        System.out.println(not); */
        
        /* ++ (自增1)       
        int a = 5;
        a++;
        System.out.println(a); */

        /* +=  (加法後再賦值)
        int one = 5;
        one += 2;
        one = one + 2;
        System.out.println(one); */

        /////////////////////////////////////////////
        int score = 61;
        if(score >= 90) {
            System.out.println("超棒");
        }
        else if(score >= 80 && score < 90) {
                System.out.println("很好");
        }
        else if(score == 60 && score < 80) {
                System.out.println("好");
        }
        else {
            System.out.println("OK");
        }

        /////////////////////////////////////////////
        /// 九九乘法
        for(int x = 1; x <= 9; x ++) {
            for(int y = 1; y <= 9; y ++){
                System.out.println(x + "x" + y + "=" + x*y + "" );              
            }
        }

        //扣除重複
        for(int x = 1; x <= 9; x ++) {
            for(int y = 1; y <= 9; y ++){
                if(x != y ){
                    System.out.println(x + "x" + y + "=" + x*y + "" );
                }                              
            }
        }

        //金字塔
        //   *
        //  ***
        // *****
        //*******
        int ln = 7;
        for(int x = 1; x <= ln; x ++) {    //最外圍印行數

            //先印空白
            for(int blank = 1; blank <= ln - x; blank ++){
                System.out.print(" ");              
            }

            //再印星星
            for(int star = 1; star <= (2*x)-1; star ++){
                System.out.print("*");              
            }
            System.out.println(" ");
        }

        /////////////////////////////////////////////
        //從1~100
        //遇到3的倍數輸出"Fizz"
        //遇到5的倍數輸出"Buzz"
        //遇到15的倍數輸出"FizzBuzz"
        //其他輸出正常數字

        for(int i = 1; i <= 100; i ++) {
            if((i % 15) == 0){                      //有優先級，要先寫15 (不能先寫3跟5)
                System.out.println("FizzBuzz");              
            }
            else if((i % 5) == 0){
                System.out.println("Buzz");              
            }
            else if((i % 3) == 0){
                System.out.println("Fizz");              
            }
            else {
                System.out.println("i");              
            }
        }

        /////////////////////////////////////////////
        //加總後印出
        int totalsum = 0;
        
        int[] numbers = {7, 22, 89, 55, 88};
        //for(int index = 0; index < numbers.length; index ++)

        for(int index = 0; index <= numbers.length-1; index ++) {
            totalsum = totalsum + bingo[index];            
        }

        System.out.println(totalsum);

        /////////////////////////////////////////////
        
        int max = 0;
        
        int[] number1 = {7, 22, 89, 55, 88};
        for(int index = 0; index <= number1.length-1; index ++) {
            if(number1[index] > max){
                max = number1[index];
            }            
        }

        System.out.println(max);

        /////////////////////////////////////////////
        
        







        


        }
    }


