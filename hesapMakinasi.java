import java.util.Scanner;
public class hesapMakinasi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double sayi1,sayi2;
        int islem;
        System.out.println("1.Sayıyı giriniz:");
        sayi1=input.nextDouble();
        System.out.println("2.Sayıyı giriniz:");
        sayi2=input.nextDouble();
        System.out.println("Lütfen işlem seçiniz:\n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        islem=input.nextInt();
        switch (islem){
            case (1):
                System.out.println("Toplamları:"+(sayi1+sayi2));
                break;
            case (2):
                System.out.println("Farkları:"+(sayi1-sayi2));
                break;
            case (3):
                System.out.println("Çarpımları:"+(sayi1*sayi2));
                break;
            case (4):
                if (sayi2!=0){
                    System.out.println("Bölümleri:"+(sayi1/sayi2));
                }
                else {
                    System.out.println("Bir sayı 0'a bölünemez.");
                }
                break;
            default:
                System.out.println("Geçersiz işlem numarası.");
        }
    }
}
