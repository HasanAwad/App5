package app.ids.com.app2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by hackour on 3/15/17.
 */

public class SecActivity extends AppCompatActivity {


    TextView info = (TextView) findViewById(R.id.info);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);

        Intent ent = this.getIntent();
        String n = ent.getExtras().getString("UserName");
        String e = ent.getExtras().getString("UserEmail");



        info.setText("hello");


    }

}
