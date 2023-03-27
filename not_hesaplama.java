import java.util.Scanner;

public class not_hesaplama {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        float matematik,fizik,kimya,turkce,tarih,muzik,ortalama;


        System.out.print("Matematik notunu giriniz:");
        matematik=input.nextFloat();
        System.out.print("Fizik notunu giriniz:");
        fizik=input.nextFloat();
        System.out.print("Kimya notunu giriniz:");
        kimya= input.nextFloat();
        System.out.print("Türkçe notunu giriniz:");
        turkce=input.nextFloat();
        System.out.print("Tarih notunu giriniz:");
        tarih=input.nextFloat();
        System.out.print("Müzik notunu giriniz:");
        muzik=input.nextFloat();
        ortalama=(matematik+fizik+kimya+turkce+tarih+muzik)/6;
        System.out.println("Genel ortalamanız="+ortalama);
        boolean deger=ortalama<60;
        String sonuc=(deger) ? "üzgünüz dersten kaldınız" : "tebrikler dersi basarılı bir sekilde gectiniz";
        System.out.println(sonuc);




    }
}
