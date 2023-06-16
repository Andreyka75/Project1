package stringsLesson;

public class Cnversions
{
    public static void main(String[] args)
    {
        String txt = "5";
        int intTxt = Integer.parseInt(txt);
        int result = intTxt +2;
        System.out.println(result);

        int i = 555;
        String result2 = String.valueOf(i);
        System.out.println(result2);
        System.out.println(result2.length());

    }
}
