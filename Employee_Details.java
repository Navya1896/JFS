//3. Write a Java program to create a class called "Employee" with a name,
//job title, and salary attributes, and methods to calculate and update salary.
// Hint : The above class has three private attributes: name, jobTitle, and salary.
// It has a constructor that initializes these attributes with the values passed
// as arguments. It also has getter and setter methods to access and modify these attributes.
// In addition, it provides methods for raising salaries by a certain percentage and
// printing employee information.

public class Employee_Details {
    private String name;
    private String job_title;
    private double salary;

    public Employee_Details(){
        //default constructor
    }

    public Employee_Details(String name, String job_title, double salary){
        this.name = name;
        this.job_title = job_title;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob_title() {
        return job_title;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double update_salary(String designation){
        if(designation.equalsIgnoreCase("Developer")){
            this.salary = getSalary() + 100;
        }
        return this.salary;
    }

    public static void main(String[] args) {
        Employee_Details emp = new Employee_Details("Navya", "Developer", 450000);
        double updatedSalary = emp.update_salary(emp.job_title);
        System.out.println("Employee Details after initializing through constructor: ");
        System.out.println("Name:- "+emp.name);
        System.out.println("Job Title:- "+emp.job_title);
        System.out.println("Salary:- "+emp.salary);
        System.out.println("The Updated Salary after initializing through constructor: ");
        System.out.println(updatedSalary);

        Employee_Details emp2 = new Employee_Details();
        emp2.setName("Shree");
        emp2.setJob_title("Developer");
        emp2.setSalary(50000.08);
        System.out.println("Employee Details after using getters and setters: ");
        System.out.println("Name:- "+emp2.name);
        System.out.println("Job Title:- "+emp2.job_title);
        System.out.println("Salary:- "+emp2.salary);
        double updatedSalary2 = emp2.update_salary(emp2.job_title);
        System.out.println("The Updated Salary after using getters and setters ");
        System.out.println(updatedSalary2);



    }

}
