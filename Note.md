2025.04.25

1.  基本型別介紹
  * int:     整數, 範圍: -2,147,483,648 ~ 2,147,483,647
  * byte:    整數, 範圍: -128 ~ 127
  * long:    整數, 範圍: -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
  * float:   32位元浮點數, 需要加上F
  * double:  64位元浮點數, 預設型別
  * char:    字元, 1個字元, 單引號
  * String:  文字, 多個字元, 雙引號
  * boolean: 布林, true/false

  * 陣列(Array)宣告
  * 陣列的長度是固定的, 不能改變
  * 陣列的長度是從0開始計算

    陣列 變數
  int[] bingo = {7, 22, 89, 55, 33, 99};
  System.out.println(bingo[5]);
  System.out.println(bingo[2]);

boolean[] b1 = {true, false};

String[] students = {"教室A", "教室B", "教室C"};
System.out.println(classrooms[1]);


2. 基本邏輯運算

        
        // if else
 
        if(lessThanOrEqual) {
          } 
        else {
          } 

        / 
        if(a == 2) {
            System.out.println("a : 2");
        }
        else if(a == 3) {
             System.out.println("a : 3");
        }
        else if(a == 4) {
             System.out.println("a : 4");
        }

             System.out.println("a 為2,3,4

        /////////////////////////////////////////////

        String min = (a < b) ? "A < B" : "B < A";
        //如果(a<b)為true min=A<B ， (a<b)為false min=B<A
        

        //for 迴圈
        for(int index = 0; index < 10; index++) {
            System.out.println(index);
        }
            }
        }