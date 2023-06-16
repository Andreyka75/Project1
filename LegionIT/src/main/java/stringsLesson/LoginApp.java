package stringsLesson;

public class LoginApp
{

    public String expectedUsername="admin";
    public String expectedPassword="12345";
    public static void main(String[] args)
    {
        LoginApp login=new LoginApp();
        boolean success=login.verifyUser("AdMin","12345");
        System.out.println("login is: "+success);

    }
    public boolean verifyUser(String username, String password)
    {
        boolean success=false;
        if(username.isBlank()||password.isBlank())
        {
            System.out.println("The username or password is empty");
        }
        else if (!(username.equalsIgnoreCase(expectedUsername))||!(password.equalsIgnoreCase(expectedPassword)))
        {
            System.out.println("The username or password is incorrect");
        }
        else
        {
            success=true;
        }
        return success;
    }
}
