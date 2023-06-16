package stringsLesson;

public class StringFormat
{
    public static void main(String[] args)
    {
        String name = "Andrey";
        String gender = "male";
        int age = 47;
        double salary = 5000.50d;
        System.out.println(String.format("The name is:%s,The gender is:%s, The age is:%d,The salary is:%f",name,gender,age,salary));
    }
}
