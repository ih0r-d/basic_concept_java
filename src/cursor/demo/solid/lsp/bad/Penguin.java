package cursor.demo.solid.lsp.bad;

public class Penguin extends Bird {
    private Double speedOfSwim;


    public Penguin(String name, Double speed, Double speedOfSwim) {
        super(name, speed);
        this.speedOfSwim = speedOfSwim;
    }
}
