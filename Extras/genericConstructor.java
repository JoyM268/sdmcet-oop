//Implement generic constructors
class GenCons{
    Double var;
    <T extends Number>GenCons(T var){
        this.var = var.doubleValue();
    }

    void display(){
        System.out.println("The double value is: " +  var);
    }
}

class genericConstructor {
    public static void main(String[] args) {
        GenCons g1 = new GenCons(2);
        GenCons g2 = new GenCons(3.42F);

        g1.display();
        g2.display();
    }
}
