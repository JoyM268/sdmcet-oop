/* Write a Java program that implements the following class diagram:
                            +------------------------------+
                            |              Box             |
                            +------------------------------+
                            | -width                       |
                            | -height                      |
                            | -depth                       |
                            +------------------------------+
                            | +Box()                       |
                            | +Box(double, double, double) |
                            | +Box(double)                 |
                            | +volume()                    |
                            +------------------------------+
                                            ^
                                            |
                    +--------------------------------------------+
                    |                  BoxWeight                 |
                    +--------------------------------------------+
                    | -weight                                    |
                    +--------------------------------------------+
                    | +BoxWeight()                               |
                    | +BoxWeight(double, double, double, double) |
                    | +BoxWeight(double, double)                 |
                    +--------------------------------------------+
                                           ^
                                           |
                +---------------------------------------------------+
                |                      Shipment                     |
                +---------------------------------------------------+
                | -cost                                             |
                +---------------------------------------------------+
                | +Shipment()                                       |
                | +Shipment(double, double, double, double, double) |
                | +Shipment(double, double, double)                 |
                +---------------------------------------------------+
*/

class Box {
    double width;
    double height;
    double depth;

    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}

class BoxWeight extends Box {
    double weight;

    BoxWeight() {
        super();
        weight = -1;
    }

    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }

    BoxWeight(double len, double m) {
        super(len);
        weight = m;
    }
}

class Shipment extends BoxWeight {
    double cost;

    Shipment() {
        super();
        cost = -1;
    }

    Shipment(double w, double h, double d, double m, double c) {
        super(w, h, d, m);
        cost = c;
    }

    Shipment(double len, double m, double c) {
        super(len, m);
        cost = c;
    }
}

class Q7 {
    public static void main(String args[]) {
        Shipment shipment1 = new Shipment(10, 20, 15, 10, 3.41);
        double vol;
        vol = shipment1.volume();
        System.out.println("Volume of shipment1 is " + vol);
        System.out.println("Weight of shipment1 is " + shipment1.weight);
        System.out.println("Shipping cost: $" + shipment1.cost);
    }
}