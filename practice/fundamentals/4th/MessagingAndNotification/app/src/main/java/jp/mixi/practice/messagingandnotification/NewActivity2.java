package jp.mixi.practice.messagingandnotification;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class NewActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new2);

        Intent received = getIntent();
        String stringextra = received.getStringExtra("ForToast");
        Toast toast = (Toast) Toast.makeText(this, stringextra, Toast.LENGTH_SHORT);
        toast.show();
    }
}
