public class Account {
    private String id;
    private String name;
    private int balance = 0;

    public Account(){

    }
    public Account(String id , String name){
        this.id = id;
        this.name = name;
    }
    public Account(String id, String name , int balance){
        this.id = id;
        this.name = name;
        setBalance(balance);
    }

    public void setId(String id){
        this.id = id;
    }
    public String getId (){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName (){
        return name;
    }

    public void setBalance(int balance){
        if (balance >= 1000)
            this.balance = balance;
        else
            System.out.println("Invalied balance");
    }
    public int getBalance(){
        return balance;
    }


    public int debit(int amount){
        if(balance < amount){
            System.out.println("Sorry, the amount exceed your balance");
            return getBalance();
        }else{
            int newBalance = getBalance() - amount;
            setBalance(newBalance);
            return getBalance();
        }
    }

    public int credit(int amount){
        if (amount <= 0){
            System.out.println("Invalied number");
            return getBalance();
        }else {
            int newBalance = getBalance() + amount;
            setBalance(newBalance);
            return getBalance();
        }
    }

    public int transferTo(Account account_1, int amount){

        if(amount <= 0){
            System.out.println("Invalied number");
            return getBalance();
        }else{
            int newBalance = debit(amount);
            account_1.credit(amount);
            this.setBalance(newBalance);

            return this.getBalance();
        }
    }

    public String toString() {
        return "Person name : "+getName()+", with Id: "+getId() +" has a balance = "+getBalance();
    }

}
