package tw.org.iii.ellen.ellen08;

import android.app.Application;

public class MainApp extends Application {
    public int a ;
    public String b ;

    @Override
    public void onCreate() {
        super.onCreate();
        a = 10 ;
        b = "brad" ;
    }
}
