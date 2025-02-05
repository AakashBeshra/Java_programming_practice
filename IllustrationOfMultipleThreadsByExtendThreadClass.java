// Illustration of multiple threads by extend Thread class
import java.util.*;
class MyThread extends Thread
{
    public void run(){
        System.out.println("This is a thread");
        for(int i = 1; i <= 5; i++){
            System.out.println("i = "+ i);
        }
    }
}
class IllustrationOfMultipleThreadsByExtendThreadClass
{
    public static void main(String[] args)
    {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.start();
        t2.start();
    }
}