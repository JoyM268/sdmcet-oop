//Demonstrate various inbuilt exceptions and also show the use of try, catch and finally block
class exceptionEx1{
    public static void main(String[] args) {
        int[] arr = new int[5];
        int a = 10, b = 20, c = 10, d = 10;
        try{
            int res = (a + b)/(c - d);  //java.lang.ArithmeticException: / by zero
            System.out.println(arr[6]); //java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 5
        } catch(ArithmeticException ae){
            ae.printStackTrace();
        } catch(ArrayIndexOutOfBoundsException ai){
            System.out.println(ai);
        } catch(Exception e){
            System.out.println(e);
        }

        String s1 = null;
        try{
            System.out.println(s1.charAt(5));   //String is null - java.lang.NullPointerException
        } catch(NullPointerException npe){
            System.out.println("String is null - " + npe);
        }
        //System.out.println("Done"); //Instruction cannot be written between catch and finally block
        finally{
            System.out.println("Built in exceptions");
        }
        System.out.println("Exiting");
    }
}