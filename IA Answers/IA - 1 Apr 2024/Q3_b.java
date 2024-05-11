/* Write a Java Program that takes a string as command-line argument and checks whether the string is palindrome or not.
If the string is palindrome, then print proper message else, generate a used-defined exception StringNotPalindromeException.
[Hint:  use  equals() method to check equality of two strings] */

class StringNotPalindromeException extends Exception{
    String str;
    StringNotPalindromeException(String str){
        this.str = str;
    }

    public String toString(){
        return "The string " + str + " is not a palindrome";
    }
}

class Q3_b{
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
                System.out.println("String " + str + " is a palindrome");
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}