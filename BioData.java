public class BioData {
    String[] first_name = {"Drizzle", "Kim", "Park", "Karen", "Mary", "Cory", "Padma", "Nagu", "Navya", "Sita", "Brinda"};
    String[] last_name = {"Ceaser", "Chopra", "Naidu", "Chowdary", "Reddy", "Shetty", "Rai", "Rao", "Singh", "Awasthi" };
    long contact_no;
    String email;
    int age;
    String dept;

    public static void main(String[] args){
        BioData bd = new BioData();
        System.out.println("Bio Data of the First Student....");
        System.out.println("First Name: " + bd.first_name[0]);
        System.out.println("Last Name: " + bd.last_name[0]);
        bd.age = 23;
        System.out.println("Age: " + bd.age);
        bd.dept = "CSE";
        System.out.println("Department: "+ bd.dept);
        bd.contact_no = 1234567890l;
        System.out.println("Contact Number: "+ bd.contact_no);
        bd.email = "abc@gmail.com";
        System.out.println("Email-Id: "+ bd.email);
        System.out.println("....................................");
        System.out.println("Bio Data of the Last Student....");
        System.out.println("First Name: "+bd.first_name[9]);
        System.out.println("Last Name: "+bd.last_name[9]);
        bd.age = 25;
        System.out.println("Age: " + bd.age);
        bd.dept = "ECE";
        System.out.println("Department: "+ bd.dept);
        bd.contact_no = 9999999999l;
        System.out.println("Contact Number: "+ bd.contact_no);
        bd.email = "xyz@gmail.com";
        System.out.println("Email-Id: "+ bd.email);

    }


}
