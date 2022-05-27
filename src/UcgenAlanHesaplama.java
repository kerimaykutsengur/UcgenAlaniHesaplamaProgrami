import java.util.Scanner;


public class UcgenAlanHesaplama {
    public static void main(String[] args) {
        int a, b, c;
        int cevre;
        int cevreninYarisi;
        double alaninKaresi, alan;

        Scanner input = new Scanner(System.in);
        System.out.print("1. Kenarı giriniz:");
        a = input.nextInt();
        System.out.print("2. Kenarı giriniz:");
        b = input.nextInt();
        System.out.print("3. Kenarı giriniz:");
        c = input.nextInt();

        cevre = a+b+c;
        System.out.println("Üçgenin Çevresi:"+cevre);
        cevreninYarisi = cevre /2;
        alaninKaresi = cevreninYarisi*(cevreninYarisi-a)*(cevreninYarisi-b)*(cevreninYarisi-c);
        alan = Math.sqrt(alaninKaresi);
        System.out.println("Üçgenin Alan:"+alan);



    }
}
