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

        


        }
    }


