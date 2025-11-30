import java.util.*;

class Main
{
    public static void main(String[] args)
    {
        ArrayList<Person> l = new ArrayList<>();

        l.add(new Person("pranavi", 20));
        l.add(new Person("nani", 19));
        l.add(new Person("sai", 18));

        for (Person p : l)
        {
            System.out.println(p.name + " " + p.age);
        }
    }
}

class Person
{
    String name;
    int age;

    Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
}
