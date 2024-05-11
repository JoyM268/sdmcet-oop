/* A vehicle is identified by how many wheels it has. Car and bike is identified by engine number, chassis number and manufacturer.
Car is - a vehicle and Bike is - a vehicle. Using this information, write a Java Program that displays all the information of vehicle, car and bike.
Also draw the class diagram for the above scenario. */
class vehicle{
    int wheels;

    vehicle(int wheels){
        this.wheels = wheels;
    }
}

class car extends vehicle{
    int engineNumber;
    int chassisNumber;
    String manufacturer;
    car(int wheels, int engineNumber, int chassisNumber, String manufacturer){
        super(wheels);
        this.engineNumber = engineNumber;
        this.chassisNumber = chassisNumber;
        this.manufacturer = manufacturer;
    }
}

class bike extends vehicle{
    int engineNumber;
    int chassisNumber;
    String manufacturer;
    bike(int wheels, int engineNumber, int chassisNumber, String manufacturer){
        super(wheels);
        this.engineNumber = engineNumber;
        this.chassisNumber = chassisNumber;
        this.manufacturer = manufacturer;
    }
}

class Q1_a{
    public static void main(String[] args) {
        vehicle v = new vehicle(4);
        System.out.println("Vehicle Information:\n" + "Wheels: " + v.wheels);

        car c = new car(4, 1234, 2334, "Toyota");
        System.out.println("\nCar Information:");
        System.out.println("Wheels: " + c.wheels);
        System.out.println("Engine Number: " + c.engineNumber);
        System.out.println("Chassis Number: " + c.chassisNumber);
        System.out.println("Manufacturer: " + c.manufacturer);

        bike b = new bike(2, 2132, 4323, "Hero");
        System.out.println("\nBike Information:");
        System.out.println("Wheels: " + b.wheels);
        System.out.println("Engine Number: " + b.engineNumber);
        System.out.println("Chassis Number: " + b.chassisNumber);
        System.out.println("Manufacturer: " + b.manufacturer);

    }
}