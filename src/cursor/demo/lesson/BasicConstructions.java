package cursor.demo.lesson;

public class BasicConstructions {
    public static void main(String[] args) {


 /*       if (2<4) {
            System.out.println("true");
        } else if (4 > 5) {
            System.out.println("false");
        } else {
            System.out.println("else");
        } */

        for (int i = 0; i < 5; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println("i = " +i );
        }

        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println("i = " +i );
        }

        // continue vs break vs return

/*        int a = 3;
        int b = 5;
        int c = a < b ? a + b : b - a;

        int d;
        if (a < b) {
            d = a + b;
        } else {
            d = b - a;
        } */
        int x = 2;
//        switch (x){
//            case 1:
//                System.out.println("1");
//                break;
//            case 2:
//                System.out.println("2");
//                break;
//            default:
//                    System.out.println("default");
//        }
//
//        int number = switch(x){
//            case 1 ->  1;
//            case 2 ->  2;
//            default -> 6;
//        }
//        int q = 0;
//        while (q<5) {
//            System.out.println(q);
//            q++;
//        }


    }
}
