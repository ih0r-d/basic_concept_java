package cursor.demo.solid.isp.good;


public class SerhiyBubka implements Athlete,JumpingAthlete {
    @Override
    public void compete() {
        System.out.println("Serhiy started competing");
    }

    @Override
    public void jump() {
        System.out.println("Serhiy started jumping");
    }
}
