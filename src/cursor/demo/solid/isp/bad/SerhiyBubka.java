package cursor.demo.solid.isp.bad;

public class SerhiyBubka implements Athlete {
    @Override
    public void compete() {
        System.out.println("Serhiy started competing");
    }

    @Override
    public void swim() {

    }

    @Override
    public void jump() {
        System.out.println("Serhiy started jumping");
    }

    @Override
    public void run() {

    }
}
