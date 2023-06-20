package Bank;

class Account {
    public String name ;
    protected String email;
    private String password; // for accessing private members outside the class we have to use GETTERS AND SETTERS 
    public String getPassword(){
       return this.password;
    }
    public void setPassword(String pass){
     this.password = pass;
    }
}
public class Bank {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "Aditya Singh";
        account1.email = "adc@gmail.com";
        account1.setPassword("abcde");
        System.out.println(account1.getPassword());

    }
}
