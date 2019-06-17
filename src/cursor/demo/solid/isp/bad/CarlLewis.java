package cursor.demo.solid.isp.bad;

public class CarlLewis implements Athlete {
    @Override
    public void compete() {
        System.out.println("Carl started competing");
    }

    @Override
    public void swim() {

    }

    @Override
    public void jump() {

    }

    @Override
    public void run() {
        System.out.println("Carl started running");
    }
}
