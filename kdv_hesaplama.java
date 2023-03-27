import java.util.Scanner;

public class kdv_hesaplama {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double tutar,kdvoran=0.18,kdvTutar,kdvsizTutar;
        System.out.print("Lütfen ürünün fiyatını giriniz:");
        tutar=input.nextDouble();
        kdvTutar=tutar*kdvoran;
        kdvsizTutar=tutar-kdvTutar;
        System.out.println("Ürün tutarı="+tutar+"\nÜrün KDV'si="+kdvoran+"\nÜrün KDV'siz tutarı="+kdvsizTutar);

    }
}
