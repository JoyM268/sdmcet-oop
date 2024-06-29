/* Write a Java Program that takes a string as command-line argument and checks whether the string is palindrome or not.
If the string is palindrome, then print proper message; otherwise, generate a used-defined exception StringNotPalindromeException. */

class StringNotPalindromeException extends Exception{
    String str;
    StringNotPalindromeException(String str){
        this.str = str;
    }

    public String toString(){
        return "The string \"" + str + "\" is not a palindrome";
    }
}

class Q3{
    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("Enter the string as arguments");
            System.exit(0);
        }
        String str = args[0];
        try{
            if(!str.equals(new StringBuilder(str).reverse().toString())){
                throw new StringNotPalindromeException(str);
            }else{
                System.out.println("String \"" + str + "\" is a palindrome");
            }
        }catch(Exception e){
            //e.printStackTrace();
            System.out.println(e);
        }
    }
}