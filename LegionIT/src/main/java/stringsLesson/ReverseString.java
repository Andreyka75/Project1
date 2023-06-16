package stringsLesson;

public class ReverseString
{
    public static void main(String[] args)
    {
        ReverseString words=new ReverseString();
        words.stringToReverse(" ");

    }
    public void stringToReverse(String word)
    {
        if(word==null||word.isEmpty()||word.isBlank())
        {
            System.out.println("The word don't exist");
        }


        else
        {
            System.out.println(String.format("The original word is:%s ",word));
            String result="";
            int lastLetter=word.length()-1;
            for (int i = lastLetter; i>=0; i--)
            {
                result=result+word.charAt(i);
            }
            System.out.println(result);
        }
    }
}
