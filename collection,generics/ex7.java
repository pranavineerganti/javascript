class Main
{
    public static void main(String[]args)
    {
        Container<String>c1 = new Container<>("Pranavi");
        Container<Integer> c2 = new Container<>(10);
        c1.show();
        c2.show();
    }
    
}
class Container<T>
{
    T data;
    Container(T data)
    {
        this.data=data;
    }
    public void show()
    {
        System.out.println(data);
    }
}