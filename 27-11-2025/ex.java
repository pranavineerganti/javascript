import java.util.*;
class Op //object as a parameter
{
    int age;
    String name;   
}
public class  ex
{
    public static void updatedetails(Op o)
    {
        o.age=20;
        o.name="pranavi";
    }
    public static void main(String[] args)
    {
        Op obj = new Op();
        obj.age=19;
        obj.name="sai";
        System.out.println(obj.age+"  "+obj.name);
        updatedetails(obj);
        System.out.println(obj.age+"  "+obj.name);
    }

}
