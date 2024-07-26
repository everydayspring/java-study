package week05.thread;

public class TestThread  extends Thread{
    @Override
    public void run() {
        // thread에서 수행할 작업
        // System.out.println("thread 입니다");
        for (int i = 0; i < 100; i++) {
            System.out.print("* ");
        }
    }
}
