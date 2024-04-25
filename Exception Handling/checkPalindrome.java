/* Write a Java Program that takes a string as command-line argument and checks whether the string is palindrome or not.
Use exceptions to print if not a palindrome. */

class notPalindrome extends Exception{
    String s;
    notPalindrome(String s){
        this.s = s;
    }

    public String toString(){
        return s + " is not a palindrome";
    }
}

class checkPalindrome{
    public static void main(String[] args) {
        String str = args[0];
        StringBuilder s1 = new StringBuilder(str);
        if(str.equals(s1.reverse().toString())){
            System.out.println(str + " is a palindrome");
        }else{
            try {
                throw new notPalindrome(str);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}