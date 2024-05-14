/* Postgraduate course of the CSE department can accommodate a maximum of 20 students.
Each PG student in the department is identified by his/her Roll No, USN, Name, Semester and Mobile Number.
Using appropriate Collection class, write a Java Program to simulate the following scenarios: 
i) On request, the capacity was increased from 20 to 25 
ii) Only 3 students enroll for the course 
iii) Two students bearing Roll Numbers 2 and 3 voluntarily unroll from the course 
iv) After a month, two students get enrolled in the course 
v) Print the information of all the students currently enrolled in the course */
class Q3{
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

    public static void main(String[] args) {
        
    }
}