//Program to illustrate the implementation of StringBuilder
public class StrBuilder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        for(char ch = 'a'; ch <= 'z'; ch++){ 
            str.append(ch); //The loop iterates from character a to z and appends each to the string
        }
        System.out.println(str);
    }
}
