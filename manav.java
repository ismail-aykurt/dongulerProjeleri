import java.util.Scanner;

public class manav {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double toplamTutar,armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5.0;
        System.out.print("armut kilosunu giriniz:");

        double armutKilo=input.nextDouble();
        double armutTutar=armut*armutKilo;
        System.out.print("elma kilosunu giriniz:");
        double elmaKilo=input.nextDouble();
        double elmaTutar=elma*elmaKilo;
        System.out.print("domates kilosunu giriniz:");
        double domatesKilo=input.nextDouble();
        double domatesTutar=domates*domatesKilo;
        System.out.print("muz kilosunu giriniz:");
        double muzKilo=input.nextDouble();
        double muzTutar=muz*muzKilo;
        System.out.print("patlican kilosunu giriniz:");
        double patlicanKilo=input.nextDouble();
        double patlicanTutar=patlican*patlicanKilo;
        toplamTutar=patlicanTutar+muzTutar+domatesTutar+elmaTutar+armutTutar;
        System.out.println("almış oldugunuz toplam meyve tutarı="+toplamTutar);
    }
}
