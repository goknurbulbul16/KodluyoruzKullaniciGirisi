import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName , password , sifirla, yeniSifre;
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adını Giriniz: ");
        userName = input.nextLine();

        System.out.print("Şifrenizi Giriniz: ");
        password = input.nextLine();

        if(password.equals("java123")){
            System.out.println("Şifre Doğru Giriş Yapabilirsiniz.");
        }else{
            System.out.print("Yanlış Şifre ! Şifrenizi Sıfırlamak ister misiniz? ( evet yada hayır ): ");
            sifirla = input.nextLine();
            if(sifirla.equals("evet")){
                System.out.print("Oluşturulmak istediğiniz şifreyi giriniz: ");
                yeniSifre=input.nextLine();
                if(yeniSifre.equals("java123")){
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz." );
                }else{
                    System.out.println("Şifre oluşturuldu" );
                }
            }else{
                System.out.println("Şifre Değiştirilmedi.");
            }
        }
    }
}