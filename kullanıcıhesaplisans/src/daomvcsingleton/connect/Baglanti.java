package daomvcsingleton.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Baglanti {
    public static Baglanti baglantiIstek; //singleton
    private Connection cnn;

    private Baglanti(){
        try {
            Class.forName("com.mysql.jdbc.Driver");//driver
            cnn= DriverManager.getConnection("jdbc:mysql://localhost/lisans_takip","root","8124782.Aa");//url
        } catch (SQLException e) {
                e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Connection getCnn() {
        return cnn;
    }

    public synchronized static Baglanti baglantiAc(){
        if(baglantiIstek==null){
            baglantiIstek=new Baglanti();
        }
        return baglantiIstek;
    }

    public void baglantiKapat(){
        baglantiIstek=null;
    }
}
