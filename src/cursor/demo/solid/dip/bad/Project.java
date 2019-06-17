package cursor.demo.solid.dip.bad;

public class Project {

    private BackEndDeveloper javaDev = new BackEndDeveloper();
    private FrontEndDeveloper jsDev = new FrontEndDeveloper();

    public void implement() {
        javaDev.writeJava();
        jsDev.writeJS();
    }

}