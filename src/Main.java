import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        System.out.println("Podaj id klienta:");
        int a = sc.nextInt();
        sc.nextLine();
        System.out.println("Podaj imie klienta:");
        String b = sc.nextLine();
        System.out.println("Podaj nazwisko klienta:");
        String c = sc.nextLine();
        System.out.println("Podaj miejscowowsc klienta:");
        String d = sc.nextLine();






        Klient klient = new Klient(a,b,c,d);

        System.out.println(klient.toString());


    }
}