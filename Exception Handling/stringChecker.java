//Program to check if two strings are equal or not, if not throw a custom exception called stringsNotEqual
class stringsNotEqual extends Exception{
    String s1;
    String s2;
    stringsNotEqual(String s1, String s2){
        this.s1 = s1;
        this.s2 = s2;
    }

    @Override
    public String toString(){
        return "The 2 strings " + s1 + " and " + s2 + " are unequal";
    }
}

class stringChecker {
    public static void main(String[] args) {
        String s1 = args[0];
        String s2 = args[1];
        try{
            if(s1.equals(s2)){
                System.out.println(s1 + " and " + s2 + " are equal");
            }else{
                throw new stringsNotEqual(s1, s2);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
