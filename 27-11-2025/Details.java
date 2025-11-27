public class Details {
    int age;
    String name;

    Details() {
        System.out.println("I'm from Details constructor");
    }

    Details(int age, String name) 
    {
        this.age = age;
        this.name = name;
        System.out.println(age + " " + name);
    }
}
