public class Cloth {

    public String color = "";
    public String size = "";
    public String logo = "";


    public Cloth (String color, String size, String logo) {
    this.color = color;
    this.size = size;
    this.logo = logo;
    }

    public void showClothInfo() {
        System.out.println("Cloth color:" + this.color + " ,size:" + this.size + " ,logo:" + this.logo);
    }
}


////////////////////////////////////////////////////
// 建立類別: 衣服(Cloth)類別
// 屬性: 顏色(color), 尺寸(size), Logo
// 方法: 用非建構子直接設定值 & 印出Color Size Logo等資訊