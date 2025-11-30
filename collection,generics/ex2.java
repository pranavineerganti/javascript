import java.util.*;
class Main
{
    public static void main(String[]args)
    {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(90);
        l.add(59);
        l.add(20);
        l.add(92);
        l.add(29);
        for(int ele:l)
        {
            System.out.print(ele+" ");
        }
        System.out.println(" ");
        Collections.sort(l);
        for(int ele:l)
        {
            System.out.print(ele+" ");
        }
        
    }
}