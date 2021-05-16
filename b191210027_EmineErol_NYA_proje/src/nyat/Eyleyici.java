package nyat;

public class Eyleyici implements Observable{

    public boolean sogutucuyuAc(Observer observer)
    {
        return true;
    }

    public boolean sogutucuyuKapat(Observer observer)
    {
        return false;
    }
}