//1. Write a Java program to create a class called "Person" with a name and age attribute.
// Create two instances of the "Person" class,
// set their attributes using the constructor, and print their name and age.

public class Person2 {
    public String name;
    public int age;
    public Person2(String name, int age){
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Person2 obj1 = new Person2("Navya", 89);
        System.out.println("Person1 Name is: "+obj1.name);
        System.out.println("Person1 Age is: "+obj1.age);

        Person2 obj2 = new Person2("Shree", 150);
        System.out.println("Person2 Name is: "+obj2.name);
        System.out.println("Person2 Age is: "+obj2.age);

    }
}

//2. Write a Java program to create a class called "Person" with a name and age attribute.
//Create two instances of the "Person" class, set their attributes using the constructor,
//and print their name and age.



