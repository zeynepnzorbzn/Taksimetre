import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args) {

        int km;

        Scanner giris = new Scanner(System.in);
        System.out.print("Gidilen mesafeyi giriniz: ");
        km = giris.nextInt();

        double ucret = (10 + km * 2.20);
        if (ucret > 20) {
            System.out.println("Ücret: " + ucret);
        }
        if (ucret <= 20) {
            System.out.println("Ücret: 20");
        }


    }
}