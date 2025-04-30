public class DemoBank {
    public static void main(String[] args) {
        //開戶並存款1000
        Bank b1 = new Bank("jennie01", 1000);
        b1.showBalance();

        //存款5000
        b1.setBalance1("jennie01", "deposit", 5000);
        int myBalance = b1.getBalance1();
        System.out.println("存款後的餘額:" + myBalance);

        //存款0
        b1.setBalance1("jennie01", "deposit", 0);
        int myBalance2 = b1.getBalance1();
        System.out.println("您的餘額:" + myBalance2);

        //帳號輸入錯誤
        b1.setBalance1("jennie02", "deposit", 0);
        int myBalance3 = b1.getBalance1();
        System.out.println("存錢後的餘額:" + myBalance3);

        //提款3000
        b1.setBalance1("jennie01", "withdraw", 3000);
        int myBalance4 = b1.getBalance1();
        System.out.println("您的餘額:" + myBalance4);

        //提款4000
        b1.setBalance1("jennie01", "withdraw", 4000);
        int myBalance5 = b1.getBalance1();
        System.out.println("您的餘額:" + myBalance5);
        
    }
}