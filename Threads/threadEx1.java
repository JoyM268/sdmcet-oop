/* Write a java program that creates one new thread that prints all the numbers from 1 to 10 with timing gap of 500ms 
the name of thread is naturalNosThread */

class naturalNosThread extends Thread{
    @Override
    public void run(){
        for(int i = 1; i <= 10; i++){
            System.out.println(i);
            try{
                sleep(500);
            }catch(InterruptedException ie){

            }
        }
    }
}

class threadEx1 {
    public static void main(String[] args) {
        naturalNosThread n1 = new naturalNosThread();
        n1.start();
    }
}
