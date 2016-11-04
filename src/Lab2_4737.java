import java.io.IOException;
import java.util.Scanner;


public class Lab2_4737 {

    public static void main(String args[]) {
        GradTA ta = new GradTA();
        ta.print();
    }
}

//The student class stores information about the student and has a method that prints
// that information to the console.
class Student {

    private String name;
    private int ssn;
    private int numOfCourse;
    private Date birthDate;
    protected char gender;

    public Student() {
        readData();
    }

    private void readData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input the name: ");
        name = scanner.nextLine();
        System.out.print("Please input the ssn: ");
        ssn = scanner.nextInt();
        System.out.print("Male/Female (m/f): ");
        try {
            gender = (char) System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (gender == 'm') {
            System.out.print("How many courses he is taking: ");
            numOfCourse = scanner.nextInt();
            System.out.println("Please enter his birth date: ");
            birthDate = new Date();
        }

        if (gender == 'f') {
            System.out.print("How many courses she is taking: ");
            numOfCourse = scanner.nextInt();
            System.out.println("Please enter her birth date: ");
            birthDate = new Date();
        }
    }

    public void print() {

        System.out.println("\nThe information you input was");
        System.out.println(name + "'s ssn is " + ssn);

        if (gender == 'm') {
            System.out.println("He is taking " + numOfCourse + " courses.");
            System.out.print("His birth date is ");
            birthDate.print();
            System.out.println();

        }

        if (gender == 'f') {
            System.out.println("She is taking " + numOfCourse + " courses.");
            System.out.print("Her birth date is ");
            birthDate.print();
            System.out.println();
        }
    }
}

//Contains information on the graduate student and prints information
//on the graduate student out. Extends student.
class GradStudent extends Student {

    private String researchTopic;
    private String advisor;

    public GradStudent() {
        super();
        readData();
    }

    private void readData() {
        Scanner scanner = new Scanner(System.in);

        if (gender == 'm') {
            System.out.print("Please input his research topic: ");
            researchTopic = scanner.nextLine();
            System.out.print("Please input his research advisor: ");
            advisor = scanner.nextLine();
        }

        if (gender == 'f') {
            System.out.print("Please input her research topic: ");
            researchTopic = scanner.nextLine();
            System.out.print("Please input her research advisor: ");
            advisor = scanner.nextLine();
        }
    }

    public void print() {
        super.print();

        if (gender == 'm') {
            System.out.println("His research topic is " + researchTopic + ".");
            System.out.println("His advisor is " + advisor + ".");
        }

        if (gender == 'f') {
            System.out.println("Her research topic is " + researchTopic + ".");
            System.out.println("Her advisor is " + advisor + ".");
        }
    }

}

//Records and prints information on a graudate TA. Extends GradStudent
class GradTA extends GradStudent {

    private String taCourse;
    private String taInstructor;
    private Date hireDate;

    public GradTA() {
        super();
        readData();
    }

    private void readData() {

        if (gender == 'm') {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please input his TA course: ");
            taCourse = scanner.nextLine();
            System.out.print("Please input his TA intructor: ");
            taInstructor = scanner.nextLine();
            System.out.println("Please input his hire date:");
            hireDate = new Date();
        }

        if (gender == 'f') {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please input her TA course: ");
            taCourse = scanner.nextLine();
            System.out.print("Please input her TA intructor: ");
            taInstructor = scanner.nextLine();
            System.out.println("Please input her hire date:");
            hireDate = new Date();
        }

    }

    public void print() {
        super.print();

        if (gender == 'm') {
            System.out.println("His TA course is " + taCourse + ".");
            System.out.println("His TA instructor is " + taInstructor + ".");
            System.out.print("His hire date is ");
            hireDate.print();
        }

        if (gender == 'f') {
            System.out.println("Her TA course is " + taCourse + ".");
            System.out.println("Her TA instructor is " + taInstructor + ".");
            System.out.print("Her hire date is ");
            hireDate.print();
        }

    }
}

//Creates a Date object which can record and print a user inputted date
class Date {

    private int year;
    private int month;
    private int day;

    public Date() {
        readData();
    }

    private void readData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\tPlease input the month: ");
        month = scanner.nextInt();
        System.out.print("\tPlease input the day: ");
        day = scanner.nextInt();
        System.out.print("\tPlease input the year: ");
        year = scanner.nextInt();
    }

    public void print() {
        System.out.print(month + "/" + day + "/" + year);
    }
}


