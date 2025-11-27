public class main 
{
       public void demo1()
       {
        System.out.println("I am from no argument and no return type method");
       }
       public String demo2()
       {
        return "im from no argument and with return type";
       }
       public void demo3(int a,int b)
       {
        System.out.print(a+b);
       }
       public int demo4(int a,int b)
       {
        return a+b;
       }
       public static void main(String[]args)
       {
         main m = new main();
         m.demo1();
         System.out.println(m.demo2());
         m.demo3(10,20);
        System.out.println(m.demo4(10,20));
       }
        
    }
    

