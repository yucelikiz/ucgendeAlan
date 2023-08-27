import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Değişkenler
        double a,b,c,alan,yariCevre;

        //Scanner sınıfı
        Scanner girdi = new Scanner(System.in);

        //Kenar uzunluklarını al
        System.out.print("a kenarını giriniz : ");
        a = girdi.nextDouble();
        System.out.print("b kenarını giriniz : ");
        b = girdi.nextDouble();
        System.out.print("c kenarını giriniz : ");
        c = girdi.nextDouble();

        //Alan formülü
        yariCevre = ((a+b+c)/2.0);
        alan = Math.sqrt(yariCevre*(yariCevre-a)*(yariCevre-b)*(yariCevre-c));
        System.out.print(alan);

    }
}