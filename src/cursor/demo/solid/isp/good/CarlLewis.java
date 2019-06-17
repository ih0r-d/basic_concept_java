package cursor.demo.solid.isp.good;

public class CarlLewis implements Athlete,RunningAthlete {
    @Override
    public void compete() {
        System.out.println("Carl started competing");
    }

    @Override
    public void run() {
        System.out.println("Carl started running");
    }
}
