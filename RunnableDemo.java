// Illustration of multithread application by implements Runnable interface
class Mythread implements Runnable{
    public void run(){
        System.out.println("Thread is running");
        for(int i = 1; i <= 5; i++){
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
class RunnableDemo{
    public static void main(String[] args){
        Mythread r1 = new Mythread();
        Mythread r2 = new Mythread();
        Thread t1 = new Thread(r1, "first");
        Thread t2 = new Thread(r2, "second");
        t1.start();
        t2.start();
        // t1.join()
        // t2.join()
    }// main
}// class