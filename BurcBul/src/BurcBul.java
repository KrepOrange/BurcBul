import java.util.Scanner;

public class BurcBul {
    public static void main(String[] args) {
        //variable
        int day, month;
        Scanner input = new Scanner(System.in);

        System.out.print("Doğdunuz gün: ");
        day = input.nextInt();

        System.out.print("Doğduğunuz ay: ");
        month = input.nextInt();

        /*
        Oğlak Burcu : 22 Aralık - 21 Ocak
        Kova Burcu : 22 Ocak - 19 Şubat
        Balık Burcu : 20 Şubat - 20 Mart
        Koç Burcu : 21 Mart - 20 Nisan
        Boğa Burcu : 21 Nisan - 21 Mayıs
        İkizler Burcu : 22 Mayıs - 22 Haziran
        Yengeç Burcu : 23 Haziran - 22 Temmuz
        Aslan Burcu : 23 Temmuz - 22 Ağustos
        Başak Burcu : 23 Ağustos - 22 Eylül
        Terazi Burcu : 23 Eylül - 22 Ekim
        Akrep Burcu : 23 Ekim - 21 Kasım
        Yay Burcu : 22 Kasım - 21 Aralık
        */

        if(month == 1) {
            if (day >= 1 && day <= 21)
                System.out.println("Oğlak burcusunuz.");
            else if (day >= 22 && day <= 31)
                System.out.println("Kova burcusunuz");
            else
                System.out.println("Hatalı gün bilgisi girdiniz! Tekrar deneyiniz.");
        }
        else if(month == 2){
            if (day >= 1 && day <= 19)
                System.out.println("Kova burcusunuz.");
            else if (day >= 20 && day <= 29)
                System.out.println("Balık burcusunuz");
            else
                System.out.println("Hatalı gün bilgisi girdiniz! Tekrar deneyiniz.");
        }
        else if(month == 3){
            if (day >= 1 && day <= 20)
                System.out.println("Balık burcusunuz.");
            else if (day >= 21 && day <= 31)
                System.out.println("Koç burcusunuz");
            else
                System.out.println("Hatalı gün bilgisi girdiniz! Tekrar deneyiniz.");
        }
        else if(month == 4){
            if (day >= 1 && day <= 20)
                System.out.println("Koç burcusunuz.");
            else if (day >= 21 && day <= 30)
                System.out.println("Boğa burcusunuz");
            else
                System.out.println("Hatalı gün bilgisi girdiniz! Tekrar deneyiniz.");
        }
        else if(month == 5){
            if (day >= 1 && day <= 21)
                System.out.println("Boğa burcusunuz.");
            else if (day >= 22 && day <= 31)
                System.out.println("İkizler burcusunuz");
            else
                System.out.println("Hatalı gün bilgisi girdiniz! Tekrar deneyiniz.");
        }
        else if(month == 6){
            if (day >= 1 && day <= 22)
                System.out.println("İkizler burcusunuz.");
            else if (day >= 23 && day <= 30)
                System.out.println("Yengeç burcusunuz");
            else
                System.out.println("Hatalı gün bilgisi girdiniz! Tekrar deneyiniz.");
        }
        else if(month == 7){
            if (day >= 1 && day <= 22)
                System.out.println("Yengeç burcusunuz.");
            else if (day >= 23 && day <= 31)
                System.out.println("Aslan burcusunuz");
            else
                System.out.println("Hatalı gün bilgisi girdiniz! Tekrar deneyiniz.");
        }
        else if(month == 8){
            if (day >= 1 && day <= 22)
                System.out.println("Aslan burcusunuz.");
            else if (day >= 23 && day <= 31)
                System.out.println("Başak burcusunuz");
            else
                System.out.println("Hatalı gün bilgisi girdiniz! Tekrar deneyiniz.");
        }
        else if(month == 9){
            if (day >= 1 && day <= 22)
                System.out.println("Başak burcusunuz.");
            else if (day >= 23 && day <= 30)
                System.out.println("Terazi burcusunuz");
            else
                System.out.println("Hatalı gün bilgisi girdiniz! Tekrar deneyiniz.");
        }
        else if(month == 10){
            if (day >= 1 && day <= 22)
                System.out.println("Terazi burcusunuz.");
            else if (day >= 23 && day <= 31)
                System.out.println("Akrep burcusunuz");
            else
                System.out.println("Hatalı gün bilgisi girdiniz! Tekrar deneyiniz.");
        }
        else if(month == 11){
            if (day >= 1 && day <= 21)
                System.out.println("Akrep burcusunuz.");
            else if (day >= 22 && day <= 30)
                System.out.println("Yay burcusunuz");
            else
                System.out.println("Hatalı gün bilgisi girdiniz! Tekrar deneyiniz.");
        }
        else if(month == 12){
            if (day >= 1 && day <= 21)
                System.out.println("Yay burcusunuz.");
            else if (day >= 22 && day <= 31)
                System.out.println("Oğlak burcusunuz");
            else
                System.out.println("Hatalı gün bilgisi girdiniz! Tekrar deneyiniz.");
        }
        else
            System.out.println("Hatalı ay bilgisi girdiniz! Tekrar deneyiniz.");
    }
}
