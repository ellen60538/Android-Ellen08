package tw.org.iii.ellen.ellen08;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText input ;
    private MainApp mainApp ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainApp = (MainApp)getApplication() ;
        Log.v("ellen","a=" + mainApp.a) ;
        Log.v("ellen","b=" + mainApp.b) ;


        input = findViewById(R.id.input) ;
    }

    public void gotoPage2(View view) {
        Intent intent = new Intent(this, Page2Activity.class) ;
        intent.putExtra("name",input.getText().toString()) ;
        intent.putExtra("lottery",(int)(Math.random()*49+1)) ;
        //startActivity(intent) ;
        startActivityForResult(intent,2);
    }

    public void gotoPage3(View view) {
        Intent intent = new Intent(this, Page3Activity.class) ;
        startActivityForResult(intent,3) ;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.v("ellen","requestCode : " + requestCode) ;
        Log.v("ellen","resultCode : " + resultCode) ;

        if (requestCode == 3){
            boolean isSoundOnOff = data.getBooleanExtra("sound",false) ;
            Log.v("ellen","sound" + (isSoundOnOff ? "On" : "Off" ) ) ;
        }
    }

    @Override
    protected void onRestart() {
        Log.v("ellen","onRestart") ;
        Log.v("ellen","a=" + mainApp.a) ;
        Log.v("ellen","b=" + mainApp.b) ;
        super.onRestart();
    }
}
