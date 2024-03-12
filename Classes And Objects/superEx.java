/* Implement the following class diagram and show the use of super keyword
 
                            +--------------------------+
                            |          vehicle         |
                            +--------------------------+
                            |      maxSpeed : int      |
                            +--------------------------+
                            |      display() : void    |
                            +--------------------------+
                                          ^
                                          |
                            +--------------------------+
                            |            car           |
                            +--------------------------+
                            |      model : String      |
                            |        type : int        |
                            +--------------------------+
                            |      display() : void    |
                            +--------------------------+
*/

class vehicle {
    int maxSpeed;

    vehicle(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }    

    void display(){
        System.out.println("This is a vehicle");
    }
}

class car extends vehicle{
    String model;
    int type;

    car(String model, int type, int max){
        super(max); //Invoke immediate parent class constructor in child class
        this.model = model;
        this.type = type;
    }

    void display(){
        System.out.println("This is car class");
        super.display(); //Invoke immediate parent method in child class
    }

    void setMaxSpeed(int max){
        super.maxSpeed = max; //Invoke immediate parent class variable in child class
    }
}

class superEx{
    public static void main(String[] args) {
        car c1 = new car("ABC", 4, 100);
        c1.display();
        System.out.println(c1.model);
        System.out.println(c1.type);
        System.out.println(c1.maxSpeed);
        c1.setMaxSpeed(150);
        System.out.println(c1.maxSpeed);
    }
}