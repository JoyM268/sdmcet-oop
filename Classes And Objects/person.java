/* Implement the following class diagram
 
                            +--------------------------+
                            |          person          |
                            +--------------------------+
                            |          id : int        |
                            |         name : String    |
                            +--------------------------+
                            |      display() : void    |
                            +--------------------------+
                                          ^
                                          |
                            +--------------------------+
                            |         employee         |
                            +--------------------------+
                            |       salary : float     |
                            |       company: String    |
                            +--------------------------+
                            |      display() : void    |
                            +--------------------------+
*/

class person{
    int id;
    String name;

    person(int id, String name){
        this.id = id;
        this.name = name;
    }

    void display(){
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
    }
}

class employee extends person{
    float salary;
    String company;

    employee(int id, String name, float salary, String company){
        super(id, name);
        this.salary = salary;
        this.company = company;
    }

    void display(){
        super.display();
        System.out.println("Salary: " + this.salary);
        System.out.println("Company: " + this.company);
    }
}