package tw.org.iii.ellen.ellen08;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.content.Intent;
import android.os.Bundle;

public class Page3Activity extends AppCompatActivity {

    private SwitchCompat soundSwitch ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);

        soundSwitch = findViewById(R.id.soundSwitch) ;

    }

    @Override
    public void finish() {
        Intent intent = new Intent() ;
        intent.putExtra("sound",soundSwitch.isChecked()) ;

        //死掉前要做的事
        //setResult(123) ;
        setResult(123,intent) ;
        super.finish();
    }
}
