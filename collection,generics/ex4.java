import java.util.*;
class Main
{
    public static void main(String []args)
    {
        LinkedList<String> l = new LinkedList<>();
        l.add("burger");
        l.add("pizz");
        l.add("idly");
        l.add("dosa");
        System.out.println(l.getFirst());
        System.out.println(l.getLast());
    }
}