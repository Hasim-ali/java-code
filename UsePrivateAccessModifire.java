class Account{
    private String Password;

    public String getPassword(){
        return Password;
    }
    public void setPassword(String Pass){
        Password=Pass;
    }
}


public class UsePrivateAccessModifire{
    public static void main(String[] args) {
        Account a1=new Account();
        a1.setPassword("ali");
        System.out.println(a1.getPassword());
    }
}