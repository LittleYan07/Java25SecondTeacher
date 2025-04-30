public class DemoPerson {

    //屬性
    public String name;
    public int age;

    //建構子(初始化)
    public DemoPerson (String name, int age) {
        this.name = name;
        this.age = age;
    }

    //方法
    public void inputName(String name) {
        this.name = name;
    }
    public void inputName(int age) {
        this.age = age;
    }
    public void showName() {
        System.out.println("Name:" + this.name);
    }
    public void showAge() {
        System.out.println("Age:" + this.age);
    }
    public static void main(String[] args) {

        DemoPerson p1 = new DemoPerson("A1", 22);
        p1.name = "A1";
        p1.age = 22;
        p1.showName();
        p1.showAge();

    }
}

//建立類別: Person
//屬性: name, age
//方法: showName(), showAge()
