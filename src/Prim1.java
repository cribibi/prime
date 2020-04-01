import java.util.Scanner;

public class Prim1 {


    public static boolean estePrim(int numar) {
        if (numar % 2 == 0) {
            return numar == 2;
        }
        for (int i = 3; i < numar; i++) {
            if (numar % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("dati un numar: ");
        Scanner scanner = new Scanner(System.in);
        int numar = scanner.nextInt();


        estePrim(numar);
        if (estePrim(numar) == false) {
            System.out.println("nu e prim");
        } else {
            System.out.println("e prim");
        }
    }


}

