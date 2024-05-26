package Encapsulation;
public class Encapsulated {
    private String user_name = "RexRajan001";
    private int passwrd = 53238570;

    private void ATM_PIN(){
        System.out.println(5323);
    }

    public String getUser_name(){
        return user_name;
    }
    public void set_values(String user_name,int passwrd){
        this.user_name = user_name;
        this.passwrd = passwrd;
    }
    public int getPasswrd(){
        return passwrd;
    }
    /*public void setPasswrd(int passwrd){
        this.passwrd = passwrd;
    }*/

}
