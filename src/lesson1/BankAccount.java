package lesson1;

public class BankAccount {
    private String account; // private 私人保護(封裝)
    private int balance1 = 0;

    public BankAccount(String registerAccount, int inputBalance) {
        this.account = registerAccount;
        this.balance1 = inputBalance;
    }

    public String getAccount() { // private String account 的關係(直接打get會出現整段語法)
        return this.account;
    }

    public void setAccount(String inputAccount, String newAccount) {    // 修改帳戶
        if(inputAccount != this.account) {
            System.out.println("您的帳號輸入錯誤，無法繼續執行此交易。");
        }
        else {
            /* this.account = account; */   //需要進行修改
        } 
    }

    public void showBalance() {
        System.out.println(this.account + "balance:" + this.balance1);
    }

    public int getBalance1() { // 回傳餘額
        return this.balance1;
    }
}



//可以修改變更account(比對原帳號，正確才能修改)
//更改帳號後，分別以新舊帳號進行存錢與提領
