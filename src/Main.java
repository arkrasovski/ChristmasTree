import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Main mainInstance = new Main();
        //kek a = mainInstance.new kek();
        //System.out.println(a.a);
        System.out.println("Hello world!");

        Scanner in = new Scanner(System.in);
        System.out.print("Input a height of three: ");
        int height = in.nextInt();


        for (int i = 1; i <= height; i++) {
            for(int j = height - 1; j <= 2*height + i -3; j++) {


                    if (j < (height - i) + (height - 1)) {

                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }

            }
            System.out.println();
        }
        for (int i = 0; i < height - 1; i++) {
            System.out.print(" ");
        }
        System.out.println("*");






        in.close();
    }
//    private class kek {
//        int a = 2;
//    }
}

