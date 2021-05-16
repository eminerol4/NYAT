package nyat;

import java.util.Random;

public class SicaklikOlcer {

    private int sicaklik;
    private Random rnd = new Random();

    public SicaklikOlcer()
    {
        sicaklik = rnd.nextInt(20) + 10;
    }

    public int sicaklikOku()
    {
        return sicaklik;
    }

    public void sicaklikDusurYukselt(boolean kontrol)
    {
        if(kontrol == true)
        {
            sicaklik -= rnd.nextInt(10);
        }

        if(kontrol == false)
        {
            sicaklik += rnd.nextInt(10);
        }
    }
}