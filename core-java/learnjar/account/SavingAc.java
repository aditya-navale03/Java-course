package account;
public class SavingAc {
    private int id;
    private String Name;
    private String AccountNumber;
    private int Balance;


    //getter
   public int getid() {
        return this.id;
    }

    public String getName() {
        return this.Name;
    }

    public String getAccountNumber() {
      return  this.AccountNumber;
    }

    public int getBalance() {
        return this.Balance;
    }

    //setter
      public int setid(int id) {
        return this.id = id;
    }

    public String setName(String Name) {
        return this.Name= Name;
    }

    public String setAccountNumber(String AccountNumber) {
      return  this.AccountNumber= AccountNumber;
    }

    public int setBalance(int Balance) {
        return this.Balance= Balance;
    }
}