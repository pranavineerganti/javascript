import java.util.*;
class Main
{
    public static void main(String []args)
    {
        Stack<Integer> l = new Stack<>();
        l.push(30);
        l.push(20);
        l.push(10);
        l.push(60);
        System.out.println("popped element: "+l.pop());
        for(int ele:l)
        {
        System.out.println(ele);
        }
    }
}