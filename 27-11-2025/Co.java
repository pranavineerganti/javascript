public class Co//constructor overloading
{
    int a;
    byte b;
    Co(int a,byte b)
    { 
        this.a = a;
        this.b =b; 
        System.out.println(a+" "+b);  
    }
    Co(byte b,int a)
    {
        this.b=b;
        this.a=a;
        System.out.println(b+" "+a);
    }
    public static void main(String[]args)
    {
        Co m = new Co(10,(byte)20);
        Co m1 = new Co((byte)20,10);
    }
    
}
