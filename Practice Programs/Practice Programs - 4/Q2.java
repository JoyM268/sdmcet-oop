/* Write a Java program using generics to provide facility to sort the students based on USN, first name and division. The sort option
is to be read by the user. 
[Hint: The program must implement compareTo() method available in Comparable<T> interface] */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class student implements Comparable<student>{
    String usn;
    String firstName;
    String divison;
    static int choice;

    student(String usn, String firstName, String division){
        this.usn = usn;
        this.firstName = firstName;
        this.divison = division;
    }  

    public int compareTo(student s){
        if(choice == 1){
            return this.usn.compareTo(s.usn);
        }else if(choice == 2){
            return this.firstName.compareTo(s.firstName);
        }else if(choice == 3){
            return this.divison.compareTo(s.divison);
        }else{
            return 0;
        }
    }

    void display(){
        System.out.println("USN: " + this.usn);
        System.out.println("First Name: " + this.firstName);
        System.out.println("Division: " + this.divison);
    }
}

class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<student> students = new ArrayList<>();

        student s1 = new student("2SD22CS038", "Joy", "A");
        student s2 = new student("2SD22CS000", "Rohit", "D");
        student s3 = new student("2SD22CS200", "Darshan", "C");
        
        Collections.addAll(students, s1, s2, s3);
        
        System.out.println("Student details before sorting:");
        for(student s : students){
            s.display();
            System.out.println();
        }
        
        System.out.println("\n1. Sorting based on USN");
        System.out.println("2. Sorting based on first name");
        System.out.println("3. Sorting based on division");
        System.out.println("Enter sorting choice(1, 2, 3): ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                student.choice = 1;
                Collections.sort(students);
                break;
            case 2:
                student.choice = 2;
                Collections.sort(students);
                break;
            case 3:
                student.choice = 3;
                Collections.sort(students);
                break;    
            default:
                System.out.println("Invalid choice");
                System.exit(0);
                break;
        }

        System.out.println("\nStudent details after sorting:");
        for(student s : students){
            s.display();
            System.out.println();
        }
    }
}