package jp.mixi.assignment.messagingandnotification;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

/**
 * Created by suino on 2015/02/25.
 */
public class IntentActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_2);

        View button = findViewById(R.id.CallActivityForResult);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO EditText と ボタンを 1 つずつ持つ新しい Activity を呼び出し、ボタンを押した時に結果を返すように実装する

                startActivityForResult(new Intent(IntentActivity2.this, EditActivity.class), EditActivity.REQUEST_CODE_HOGE);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch (requestCode) {
            case EditActivity.REQUEST_CODE_HOGE:
                String Text = data.getStringExtra("RESULT");
                if (Text.isEmpty()) {
                    Toast toast_1 = Toast.makeText(IntentActivity2.this, "入力値なし", Toast.LENGTH_SHORT);
                    toast_1.show();
                }else{
                    Toast toast = Toast.makeText(IntentActivity2.this, Text, Toast.LENGTH_LONG);
                    toast.show();
                }

                break;
            default:
                Toast toast_2 = Toast.makeText(IntentActivity2.this, "入力値なし", Toast.LENGTH_LONG);
                toast_2.show();
                break;
        }
    }
}
