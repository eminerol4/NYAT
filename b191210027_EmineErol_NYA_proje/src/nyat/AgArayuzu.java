package nyat;

import java.util.Scanner;

public class AgArayuzu {

    public void Arayuz()
    {
        Scanner a = new Scanner(System.in);
        String KullaniciAdi;
        String Sifre;
        MerkeziIslemBirimi sogutucuCihazi = new MerkeziIslemBirimi();
        while(true)
        {
            System.out.println("-----------Sistem Girişi-----------");
            System.out.println("Sisteme giriş yapmak için lütfen bir kullanıcı adı ve şifre giriniz.");
            System.out.print("Lütfen Kullanıcı Adınızı Giriniz : ");
            KullaniciAdi = a.next();
            System.out.print("Lütfen Şifrenizi Giriniz : ");
            Sifre = a.next();
            System.out.println("-----------------------------------");
            if(SogutucuVeriTabani.getInstance().Kontrol(KullaniciAdi , Sifre))
            {
                System.out.println("Kullanıcı Doğrulandı");
                break;
            }


            else
                System.out.println("Hatalı Giriş Yaptınız.");
        }
        //Menüden seçim yapılır
        while(true)
        {
            int secim;
            Scanner scanner = new Scanner(System.in);
            System.out.println("******************");
            System.out.println("   -MENÜ-    ");
            System.out.println("1- Soğutucuyu Aç");
            System.out.println("2- Sıcaklık Görüntüle");
            System.out.println("3- Soğutucuyu Kapat");
            System.out.println("4- Çıkış Yap");
            secim = scanner.nextByte();
            if(secim == 1)
            {
                System.out.println("Seçenek = 1");
                sogutucuCihazi.sogutucuyuAc();
            }
            if(secim == 2)
            {
                System.out.println("Seçenek = 2");
                sogutucuCihazi.sicaklikGoster();
            }
            if(secim == 3)
            {
                System.out.println("Seçenek = 3");
                sogutucuCihazi.sogutucuyuKapat();
            }
            if(secim == 4)
            {
                System.out.println("Seçenek = 4");
                System.out.println("Çıkış yaptınız.İyi günler dileriz");
                System.exit(1);

            }

        }
    }
}