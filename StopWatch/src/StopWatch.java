import java.util.Scanner;

public class StopWatch {
    private long startTime,endTime;
    public void start() {
        this.startTime = System.currentTimeMillis();
    }
    public void stop() {
        this.endTime = System.currentTimeMillis();
    }
    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }
}
class testWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StopWatch myWatch = new StopWatch();
        
        System.out.println(myWatch.getElapsedTime());
    }
}
