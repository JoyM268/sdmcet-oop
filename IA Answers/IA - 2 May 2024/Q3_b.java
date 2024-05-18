/* Postgraduate program of the CSE department can accommodate a maximum of 15 students.
Each PG student in the department is identified by Roll No, USN, Name, Semester.
Using appropriate Collection class, write a Java Program to simulate the following scenarios: 
i) On request, the capacity was increased from 15 to 20
ii) Only 3 students enroll for the course 
iii) Two students bearing Roll Numbers 2 and 3 voluntarily unroll from the program
iv) After a month, two students get enrolled to the program
v) Print the information of all the students currently enrolled in the program */
import java.util.ArrayList;
import java.util.Collections;

class student{
    int rollNo;
    String usn;
    String name;
    int semester;

    student(int rollNo, String usn, String name, int semester){
        this.rollNo = rollNo;
        this.usn = usn;
        this.name = name;
        this.semester = semester;
    }

    void display(){
        System.out.println("Roll No.: " + rollNo);
        System.out.println("USN: " + usn);
        System.out.println("Name: " + name);
        System.out.println("Semester: " + semester);
    }
}

class Q3_b{
    public static void main(String[] args) {
        ArrayList<student> cse = new ArrayList<>(15);
        
        //Capacity increased from 15 to 20
        cse.ensureCapacity(20);

        //Add 3 students
        student s1 = new student(1, "2SD22CS038", "Joy", 4);
        student s2 = new student(2, "2SD22CS400", "Rahul", 1);
        student s3 = new student(3, "2SD22CS350", "Rachit", 2);
        Collections.addAll(cse, s1, s2, s3);

        //Remove students with rollno 2 and 3
        for(int i = 0; i < cse.size(); i++){
            student s = cse.get(i);
            if(s.rollNo == 2 || s.rollNo == 3){
                cse.remove(i);
                i--;
            }
        }

        //Add 2 Students
        student s4 = new student(4, "2SD22CS300", "Abhimanyu", 1);
        student s5 = new student(5, "2SD22CS900", "Raghav", 1);
        Collections.addAll(cse, s4, s5);

        //Information of currently enrolled students
        System.out.println("The student details of currently enrolled students are:");
        for(student s : cse){
            s.display();
            System.out.println();
        }
    }
}