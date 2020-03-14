package tw.org.iii.ellen.ellen08;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class Page2Activity extends AppCompatActivity {

    private TextView tv ;
    private MainApp mainApp ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        mainApp = (MainApp)getApplication() ;
        Log.v("ellen","a=" + mainApp.a) ;
        Log.v("ellen","b=" + mainApp.b) ;
        mainApp.a = 100 ;
        mainApp.b = "BRAD2" ;

        tv = findViewById(R.id.page2_tv) ;

        Intent intent = getIntent() ;
        String name = intent.getStringExtra("name") ;
        int lottery = intent.getIntExtra("lottery",88) ;
        tv.setText(name +":"+ lottery) ;

    }

    public void gotoMain(View view) {
        Intent intent = new Intent(this, MainActivity.class) ;
        startActivity(intent) ;
    }
}
