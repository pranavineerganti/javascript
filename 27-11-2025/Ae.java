import java.lang.*;
public class Ae //Arithmetic Exception
{
    public static void main(String[]args)
    {
    int a=10;
    int b=0;
    try
    {
     int c=a/b;
     System.out.print(c);
    }
    catch(ArithmeticException e)
    {
        System.out.print(e);
    }
    finally
    {
        System.out.print("excuted");
    }
}
}
