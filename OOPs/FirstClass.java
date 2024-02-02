package OOPs;

import java.util.Scanner;

class Person{
    Person(){
        System.out.println("<====================================>");
        System.out.println("Person Default Constructor Called : Object Created");
        getDetails();
        display();
    }
    String name;
    int age;
    void getDetails() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Name : ");
        name  = scan.nextLine();
        System.out.println("Enter Age");
        age   = scan.nextInt();
    }

    void display(){
        System.out.println("\nName : " +name );
        System.out.println("Age : " + age);
    }
}
public class FirstClass {
    public static void main(String[] args) {
        Person p1 = new Person();
        // p1.getDetails();
        // p1.display();
        // set data
        // set name
        // p1.name="Ram";
        // //set age
        // p1.age=25;

        // // get data
        // System.out.println("Name of  the person is " +p1.name);

        // p1.name="Shyam";
        // System.out.println("After changing Name, The name of the person is "+p1.name);
        // System.out.println("Age of the person is " + p1.age);
        // System.out.println("====================================");

        Person p2 = new Person();
        // p2.getDetails();
        // p2.display();
        // p2.name="GHANSHYAM";
        // //set age
        // p2.age=52;

        // // get data
        // System.out.println("Name of  the person is " +p2.name);
        // System.out.println("Age of the person is " + p2.age);
    }
}


// Employee --> main , name , id ,age , doj
// Salary --> hours , days , print (complete format)