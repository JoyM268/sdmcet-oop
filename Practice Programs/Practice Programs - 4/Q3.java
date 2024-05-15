/* Postgraduate course of the CSE department can accommodate a maximum of 20 students.
Each PG student in the department is identified by his/her Roll No, USN, Name, Semester and Mobile Number.
Using appropriate Collection class, write a Java Program to simulate the following scenarios: 
i) On request, the capacity was increased from 20 to 25 
ii) Only 3 students enroll for the course 
iii) Two students bearing Roll Numbers 2 and 3 voluntarily unroll from the course 
iv) After a month, two students get enrolled in the course 
v) Print the information of all the students currently enrolled in the course */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class student{
    int rollNo;
    String usn;
    String name;
    int semester;
    int mobileNo;

    student(int rollNo, String usn, String name, int semester, int mobileNo){
        this.rollNo = rollNo;
        this.usn = usn;
        this.name = name;
        this.semester = semester;
        this.mobileNo = mobileNo;
    }

    void display(){
        System.out.println("Roll No.: " + rollNo);
        System.out.println("USN: " + usn);
        System.out.println("Name: " + name);
        System.out.println("Semester: " + semester);
        System.out.println("Mobile Number: " + mobileNo);
    }
}

class Q3{
    public static void main(String[] args) {
        ArrayList<student> cse = new ArrayList<>(20);
        
        //Capacity increased from 20 to 25
        cse.ensureCapacity(25);

        //Add 3 students
        student s1 = new student(1, "2SD2201", "ABC", 1, 1234532213);
        student s2 = new student(2, "2SD2202", "EFG", 2, 1234237213);
        student s3 = new student(3, "2SD2203", "HIJ", 2, 1234534513);
        Collections.addAll(cse, s1, s2, s3);

        //Remove students with rollno 2 and 3
        Iterator<student> itr = cse.iterator();
        while(itr.hasNext()){
            student s = itr.next(); 
            if(s.rollNo == 2 || s.rollNo == 3){
                itr.remove();
            }
        }

        //Add 2 Students
        student s4 = new student(4, "2SD2204", "KLM", 1, 1232893213);
        student s5 = new student(5, "2SD2205", "NOP", 1, 1323534513);
        Collections.addAll(cse, s4, s5);

        //Information of currently enrolled students
        System.out.println("The student details of currently enrolled students are:");
        itr = cse.iterator();
        while(itr.hasNext()){
            itr.next().display();
            System.out.println();
        }
    }
}