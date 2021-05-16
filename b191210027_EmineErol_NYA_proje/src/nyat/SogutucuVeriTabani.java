package nyat;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SogutucuVeriTabani {

    private static SogutucuVeriTabani instance = null;
    private synchronized static void createInstance() {
        if (instance == null)
            instance = new SogutucuVeriTabani();
    }
    public static SogutucuVeriTabani getInstance() {
        if (instance == null)
            createInstance();
        return instance;
    }

    private Connection Baglan(){

        Connection conn=null;

        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/kullanici",
                    "postgres", "1234");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    public boolean Kontrol(String KullaniciAdi , String Sifre)
    {
        String sql= "SELECT * FROM \"public\".\"kullanici\"";
        String isim = "";
        String sifre = "";

        Connection conn=this.Baglan();
        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            conn.close();

            while(rs.next())
            {
                isim = rs.getString("kullaniciAdi");
                sifre = rs.getString("sifre");
            }
            rs.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isim.equals(KullaniciAdi) && sifre.equals(Sifre);

    }
}