package cursor.demo.lesson;

public class Main {
    public static void main(String[] args) {
        Client c1 = new Client("Petro","Dev","petro@i.ua");
        Client c2 = new Client();
        c2.position = "junior";
        c2.setName("Ivan");
        System.out.println(c2.position);

        c2.createReport();

    }
}
