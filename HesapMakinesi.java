import java.util.Scanner;


public class HesapMakinesi {
    public static void main(String[] args) {
        int a,b,select;

        Scanner i = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz: ");
        a = i.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        b = i.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Lütfen yapacağınız işlemi seçiniz: ");
        select = i.nextInt();

                switch (select) {
                    case 1:
                        System.out.println(a + b);
                        break;
                    case 2:
                        System.out.println(a - b);
                        break;
                    case 3:
                        System.out.println(a * b);
                        break;
                    case 4:
                        if(b == 0){
                            System.out.println("Bir sayı 0'a bölünemez. Tekrar deneyiniz.");
                        }else{
                            System.out.println("result : "+(a / b));
                        }
                        break;

                    default:
                        System.out.println("Hatalı seçim yaptınız.");
                        break;

                }
    }
}
