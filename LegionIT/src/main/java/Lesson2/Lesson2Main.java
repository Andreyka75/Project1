package Lesson2;

public class Lesson2Main {
    public static void main(String[] args) {

        Lesson2Main lesson2 = new Lesson2Main();
//        lesson2.printUserInfo("Andrey Katsevman",1);
        boolean isBonusAvailable = true;
        lesson2.checkScore("Andrey Katsevman", 1, 65, isBonusAvailable);
        lesson2.checkScore("vasaily", 2, 45, isBonusAvailable);
        lesson2.checkScore("zalupa", 3, 101, isBonusAvailable);
        lesson2.checkScore("ahushiling", 4, -2,isBonusAvailable);


//        String userName = "Andrey Katsevman";
//        int userId = 1;
//
//        System.out.println("Username is "+userName);
//        System.out.println("User ID is "+ userId);
    }

//    public void printUserInfo(String userName, int userId) {
//        System.out.println("Username is " + userName);
//        System.out.println("User ID is " + userId);
   // }

    public void checkScore(String userName, int userId, int userScore, boolean isBonusAvailable)
    {
        System.out.println("Username is " + userName);
        System.out.println("User ID is " + userId);

        if(userName.equals("vasaily"))
        {
            userScore=userScore+20;
            isBonusAvailable=false;
        }


        if(isBonusAvailable)
        {
            userScore=userScore+10;


        }

        if(userScore>100||userScore<0)
        {
            System.out.println("Error!");
        }

        else if (userScore > 60)
        {
            System.out.println("Pass!");
        } else
        {
            System.out.println("failed!");
        }
        System.out.println("The User Score is " +userScore);

    }
}

