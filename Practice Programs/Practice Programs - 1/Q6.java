/* A vehicle is identified by how many wheels it has. A car is identified by engine number, chassis number and manufacturer. A bike is identified by engine
number, chassis number and  manufacturer. Similarly, a truck is identified by engine  number, chassis  number and manufacturer.
car is - a vehicle,  bike is - a vehicle and truck is - a vehicle. Using  this information, write a Java Program that displays all the information of vehicle,
car, bike and truck. Also draw the class diagram for the above scenario.  */
class vehicle {
    int wheels;

    vehicle(int wheels) {
        this.wheels = wheels;
    }
}

class car extends vehicle {
    String engineNumber;
    String chassisNumber;
    String manufacturer;

    car(int wheels, String engineNumber, String chassisNumber, String manufacturer) {
        super(wheels);
        this.engineNumber = engineNumber;
        this.chassisNumber = chassisNumber;
        this.manufacturer = manufacturer;
    }

    void displayInfo() {
        System.out.println("Car Details:");
        System.out.println("Wheels: " + wheels);
        System.out.println("Engine Number: " + engineNumber);
        System.out.println("Chassis Number: " + chassisNumber);
        System.out.println("Manufacturer: " + manufacturer);
    }
}

class bike extends vehicle {
    String engineNumber;
    String chassisNumber;
    String manufacturer;

    bike(int wheels, String engineNumber, String chassisNumber, String manufacturer) {
        super(wheels);
        this.engineNumber = engineNumber;
        this.chassisNumber = chassisNumber;
        this.manufacturer = manufacturer;
    }

    void displayInfo() {
        System.out.println("Bike Details:");
        System.out.println("Wheels: " + wheels);
        System.out.println("Engine Number: " + engineNumber);
        System.out.println("Chassis Number: " + chassisNumber);
        System.out.println("Manufacturer: " + manufacturer);
    }
}

class truck extends vehicle {
    String engineNumber;
    String chassisNumber;
    String manufacturer;

    truck(int wheels, String engineNumber, String chassisNumber, String manufacturer) {
        super(wheels);
        this.engineNumber = engineNumber;
        this.chassisNumber = chassisNumber;
        this.manufacturer = manufacturer;
    }

    void displayInfo() {
        System.out.println("Truck Details:");
        System.out.println("Wheels: " + wheels);
        System.out.println("Engine Number: " + engineNumber);
        System.out.println("Chassis Number: " + chassisNumber);
        System.out.println("Manufacturer: " + manufacturer);
    }
}

class Q6 {
    public static void main(String[] args) {
        car car = new car(4, "12345", "DEF123", "McLaren");
        car.displayInfo();
        System.out.println();

        bike bike = new bike(2, "678910", "JKL456", "BMW");
        bike.displayInfo();
        System.out.println();

        truck truck = new truck(4, "101112", "PQR789", "Tesla");
        truck.displayInfo();
        System.out.println();
    }
}