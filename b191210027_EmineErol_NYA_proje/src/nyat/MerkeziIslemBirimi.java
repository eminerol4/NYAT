package nyat;

public class MerkeziIslemBirimi implements Observer{

    boolean sogutucuAcikKapali = false;
    SicaklikOlcer olcer = new SicaklikOlcer();
    Eyleyici eyleyici = new Eyleyici();

    public void sogutucuyuAc()
    {
        if(sogutucuAcikKapali == false)
        {
            sogutucuAcikKapali = eyleyici.sogutucuyuAc(this);
            olcer.sicaklikDusurYukselt(true);
            System.out.println("Soğutucu Açılıyor......Soğutucu açıldı..");
        }
        else
            sogutucuAcikUyariMesaji();
    }

    public void sogutucuyuKapat()
    {
        if(sogutucuAcikKapali == true)
        {
            sogutucuAcikKapali = eyleyici.sogutucuyuKapat(this);
            olcer.sicaklikDusurYukselt(false);
            System.out.println("Soğutucu Kapatılıyor......Soğutucu Kapatıldı");
        }
        else
            sogutucuKapaliUyariMesaji();
    }

    public void sicaklikGoster()
    {
        System.out.println("Sıcaklık = " + olcer.sicaklikOku());
    }


    @Override
    public void sogutucuAcikUyariMesaji()
    {
        System.out.println("Soğutucu zaten açıktır.Bu yüzden bu işlem gerçekleştirilemiyor.");
    }

    @Override
    public void sogutucuKapaliUyariMesaji()
    {
        System.out.println("Soğutucu zaten kapalıdır.Bu yüzden bu işlem gerçekleştirlemiyor.");
    }
}