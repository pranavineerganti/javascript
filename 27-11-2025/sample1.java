class Iexception {
    public static void checkNumber(int num) throws Inbuilt
 {
    if(num<=1000)
    {
        throw new Inbuilt("should not be less than 1000");
    }
    else
    {
        System.out.println(num);
    }
}
}

public class sample1
{
public static void main(String[]args)
{
    int num =500;
     try
    {
        Iexception.checkNumber(num);;
    }
    catch(Inbuilt a)
    {
        System.out.println(a);
    }

}
}
