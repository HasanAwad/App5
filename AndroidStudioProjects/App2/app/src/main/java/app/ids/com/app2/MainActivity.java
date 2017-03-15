package app.ids.com.app2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText Name = (EditText)findViewById(R.id.NameInput);
    EditText email = (EditText)findViewById(R.id.emailInput);
    EditText phone = (EditText)findViewById(R.id.PhoneInput);
    EditText postal = (EditText)findViewById(R.id.PostalInput);
    Button submit ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this,SecActivity.class);
                i.putExtra("UserName",Name.getText().toString());
                i.putExtra("UserEmail",email.getText().toString());
                i.putExtra("UserPhone",phone.getText().toString());
                i.putExtra("UserPostal",postal.getText().toString());
                startActivity(i);
            }
        });


    }
}
