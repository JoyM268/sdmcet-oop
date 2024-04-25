/* A chemical company named “XYZ Chemicals Pvt. Ltd.” manufactures various chemicals. To automate and monitor the manufacturing process, they are planning
to install an "Automated Manufacturing and Maintenance System". One important task of this system is to sense the rise in temperature of the furnace and monitor
its temperature. If the temperature of the furnace rises above 300⁰C, then it should immediately generate an alarm. It should also generate a separate alarm 
if the temperature of the furnace falls below 100⁰C. You are hired as a Java Programmer to develop this system. Write a Java Program which simulates the
above scenario using exception handling mechanism */

class highTemperatureException extends Exception{
    public String toString(){
        return "The temperature of furnace is above 300 C";
    }
}

class lowTemperatureException extends Exception{
    public String toString(){
        return "The temperature of furnace is below 100 C";
    }
}

public class Q6 {
    public static void main(String[] args) {
        int temperature = Integer.parseInt(args[0]);
        try{
            if(temperature > 300){
                throw new highTemperatureException();
            }else if(temperature < 100){
                throw new lowTemperatureException();
            }else{
                System.out.println("Normal Temperature");
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
