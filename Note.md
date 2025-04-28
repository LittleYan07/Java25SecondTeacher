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

//////////////////////////////////////

2.控制和迴圈

(1)條件式

if (條件) {
          條件成立時執行的程式碼
}
else {
     條件不成立時執行的程式碼
}

//////////////////////////////////////
int a = 2;
int b = 3;

if((a <= b)) {
  System.out.println("a 的確 <= b");
}
else {
  System.out.println("a 沒有 <= b");
}

//////////////////////////////////////

if((a == 2)) && ((b == 3)) {
  System.out.println(x:"條件成立");
}
else {
  System.out.println(x:"條件不成立");
}

//////////////////////////////////////

(2) else if

if (條件1) {
             條件1成立時執行的程式碼
}
else if (條件2) {
             條件2成立時執行的程式碼
}
else {
     條件1跟條件2都不成立時執行的程式碼
}


int a = 2;

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

String[] results = {
  "a : 2",
  "a : 3",
  "a : 4",
}
System.out.println(results);

//////////////////////////////////////

* 簡化if else 寫法
* (條件) ? 條件成立時執行的程式碼 : 條件不成立時執行的程式碼

// int a = 2;
// int b = 3;

// String min = (a < b) ?  "A < B" :  "B > A";
// System.out.println(min);

//////////////////////////////////////

(3)迴圈
* for 迴圈
* for (初始值; 進入迴圈條件; 增量/減量) {
       條件成立時執行的程式碼
}

// for(int index = 0; index <= 10; index ++) {
//     System.out.println(index);
}

* for 迴圈 將array所有元素印出來範例
* 元素長度可以用 array.length 取得
* 可用Debug 觀察 index 的變化


* for 迴圈 減量範例
* 這裡的 index 會從10開始，然後每次減1，直到 index <= 0 為止
* 可用Debug 觀察 index 的變化
// for(int index = 10; index > 0; index --) {
//     System.out.println(index);
// }


* for each 迴圈
* for (資料型態 單一變數名稱 : 陣列變數名稱) {
*           條件成立時執行的程式碼
* }

// String[] students = { "A1", "A2", "A3" };
// for (String stu : students) {
//     System.out.println(stu);
// }

等於以下寫法:

// String[] students = { "A1", "A2", "A3" };
// for (int index = 0; index <= students.length - 1; index++) {
//     System.out.println(students[index]);
// }

//////////////////////////////////////

* for issue (簡易寫法，類似從數據資料中抽出部分資料做成表格)
* class生成object  
* Key Value
  {
      "name": "t1",
      "age": 14
  },
  {
      "name": "t2",
      "age": 17
  },

  {"t1", "t2"}
  {14, 17}

public static void main(String[] args) throws Exception {
  String[] names = { "A1", "A2", "A3" };
  int[] age = { "12", "17", "24" };

  for (int index = 0; index <= names.length - 1; index++) {
       System.out.println(students[index]);

  }

}