package cursor.demo.lesson;

public class Client {
    private String name;
    String position; //default
    protected String email;
    public String city;


    public Client() {
    }

    public Client(String name, String position, String email, String city) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.city = city;
    }

    public Client(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public Client(String name, String position, String email) {
        this.name = name;
        this.position = position;
        this.email = email;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void createReport(){
        System.out.println("report was created . . .");
    }
}
