public class Account implements AccountDetails
{
  private String name;
  private int accNo;
  private double balance;
  public Account(String name,int accNo,double balance){
      this.name = name;
      this.accNo = accNo;
      this.balance = balance;
  }

  public String getName() {
    return name;
  }

  public int getAccNo() {
    return accNo;
  }
  public double getBalance() {
    return balance;
  }
  public void setName(String name) {
    this.name = name;
  }
  
  public void setBalance(double balance) {
    this.balance = balance;
  }
  public boolean withdraw(double amount){
    if(this.balance >= amount){
      this.balance = balance-amount;
      System.out.println("Balance after withdraw: "+this.balance);
      return true;
    }else{
      System.out.println("not enough balance");
    }
    return false;
  }
  

}
