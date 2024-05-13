/* Write a java program to create a generic class that includes a generic method to print the values supplied.
Note: 
1. Since there is generic datatype aplicable for specific function, the class that includes the function may not 
be generic but only method is made as generic method.
2. Generic method always begins with generic type except for cases which include access specifier, static or final keyword.
[static/final/access] <T> return_type name(parameters) */

//Static method in same class
/* 
public class genericMethod {

    static <T> void print(T e){
        System.out.println(e);
    }
    
    public static void main(String[] args) {
        print(12);
        print(3.4f);
    }    
}
*/

//Static method in different class
class test2{
    static <T> void print(T e){
        System.out.println(e);
    }
}

public class genericMethod {
    public static void main(String[] args) {
        test2.print(12);
        test2.print(3.4f);
    }    
}