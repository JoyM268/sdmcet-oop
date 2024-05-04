/* Write a java program to implement small component of furnace which needs to show three different threshold points of temperature,
if temperature of furnacee is greater than 4000k then it should indicate a notification "Too high temperature", if temperature
is less then 2000k notify with "Too low temperature", when temperature between 2000k and 4000k send the signal "normal temperature".
Implement using exception handling */

class tooHighTemperature extends Exception{
    @Override
    public String toString() {
        return "Too High Temperature";
    }
}

class tooLowTemperature extends Exception{
    @Override
    public String toString(){
        return "Too Low Temperature";
    }
}

class temperatureChecker {
    public static void main(String[] args) {
        int temp = Integer.parseInt(args[0]);
        try{
            if(temp > 4000){
                throw new tooHighTemperature();
            }else if(temp < 2000){
                throw new tooLowTemperature();
            }else{
                System.out.println("Normal Temperature");
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
