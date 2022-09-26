package ThreadOdev;



public class Main {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Thread t1 = new Thread(c1);
        t1.start();

    }
}
