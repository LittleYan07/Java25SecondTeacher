package lesson1;

public class Bank {
    private String account; // private 私人保護(封裝)
    private int balance1 = 0;

    public Bank(String registerAccount, int inputBalance) {
        this.account = registerAccount;
        this.balance1 = inputBalance;
    }

    public void showBalance() {
        System.out.println(this.account + "balance:" + this.balance1);
    }

    public String getAccount() { // private String account 的關係(直接打get會出現整段語法)
        return this.account;
    }

    public void setAccount(String account) { // 設定
        this.account = account;
    }

    public int getBalance1() { // 回傳餘額
        return this.balance1;
    }

    /*
     * public void setBalance1(int balance1) { //存錢
     * this.balance1 = this.balance1 + balance1;
     * }
     */

    public void setBalance1(String account, String action, int balance1) {
        if (account != this.account) {
            System.out.println("您的帳號輸入錯誤，無法繼續執行此交易。");
        }
        else {
            if(action == "deposit") {
                if(balance1 > 0) {
                    this.balance1 = this.balance1 + balance1;
                }
                else {
                    System.out.println("存款金額需大於0");
                }
            }

            if(action == "withdraw") {
                if(this.balance1 >= balance1) {
                    this.balance1 = this.balance1 - balance1;
                }
                else {
                    System.out.println("餘額不足，無法提款。");
                }
            }
        }
    }

}