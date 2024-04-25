//Write a Java program that prints all the command line arguments that are passed to it
class Q1{
    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("No arguments passed in command line");
            System.exit(0);
        }
        System.out.println("The Arguments passed in command line are:");
        for(int i = 0; i < args.length; i++){
            System.out.println(args[i]);
        }
    }
}