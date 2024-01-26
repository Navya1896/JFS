//Create a class for Animal, Car, Person, Employee
//        Create properties/variables and method names respectively

class Animal{
    String name;
    String color;
    int age;
    public void display(){
        System.out.println("\nThe details of the employee are: ");
        System.out.println("Animal Name: "+name+"\nColor: "+color+"\nAge: "+age);
    }

}
class Car {
String model;
String color;
double price;
public void display(){
    System.out.println("\nThe details of the car are: ");
    System.out.println("Model: "+model+"\nColor: "+color+"\nPrice: "+price);
}
}

class Person {
    String name;
    String hometown;
    int age;
    int contact_no;

    public void display(){
        System.out.println("\nThe details of the Person are: ");
        System.out.println("Name: "+name+"\nHometown: "+hometown+"\nAge: "+age+"\nContact Number: "+contact_no);

    }
}

class Employee {
    String name;
    int contact;
    String dept;
    double salary;
    public void display(){
        System.out.println("\nThe details of employee are:");
        System.out.println("Name: "+name + "\nContact Number: " + contact + "\nDepartment: " + dept + "\nSalary: " + salary);
    }

}

public class Classes_Objects {
    public static void main(String[] args) {
        Animal A1 = new Animal();
        A1.age = 5;
        A1.name = "Puppy";
        A1.color = "Brown";
        A1.display();

        Car c1 = new Car();
        c1.color = "Black";
        c1.model = "Volkswogen";
        c1.price = 123000.45;
        c1.display();

        Employee e1 = new Employee();
        e1.contact = 1092837465;
        e1.dept = "Development";
        e1.name = "Navya";
        e1.salary = 123000;
        e1.display();

        Person p1 = new Person();
        p1.age = 67;
        p1.name = "Navya";
        p1.contact_no = 1234567890;
        p1.hometown = "India";
    }

}
