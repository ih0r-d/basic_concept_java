package cursor.demo.solid.dip.good;

import java.util.List;

public class Project {
    private List<Developer> developers;

    public Project(List<Developer> developers) {
        this.developers = developers;
    }

    public void implement() {
        for (Developer dev : developers) {
            dev.writeCode();
        }
//        developers.forEach(d -> d.writeCode());
    }
}
