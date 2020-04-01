import java.util.Scanner;

public class Prim2 {

    public static boolean numerePrime(int numar) {
        for (int i = 2; i < (numar / 2); i++) {
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

        numerePrime(numar);
        if (numerePrime(numar) == false) {
            System.out.println("nu e prim");
        } else {
            System.out.println("e prim");
        }
    }
}

