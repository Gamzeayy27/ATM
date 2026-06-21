import java.util.Scanner;

public class ATM {
    public static void main(String[]args ){
        Scanner oku = new Scanner(System.in);
        int bakiye = 1000;
        int secim;
        do {
            System.out.println("\n----ATM MENUSU----");
            System.out.println("1-bakiye görüntüle ");
            System.out.println("2-para yatır");
            System.out.println("3-çıkış");
            System.out.println("seçiminiz");

            secim = oku.nextInt();
            switch (secim) {
                case 1:

                    System.out.println("Bakiyeniz: " + bakiye + "TL");
                    break;
                case 4:
                    System.out.println("çıkış yapılıyor...");
                    break;
                default:
                    System.out.println("Geçersiz seçim ");}
        }while (secim !=4);
    }
}