package jp.mixi.assignment.messagingandnotification;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

/**
 * Created by suino on 2015/03/04.
 */
public class EditActivity extends AppCompatActivity {
    EditText editText;
    public static final int REQUEST_CODE_HOGE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);
        editText = (EditText) findViewById(R.id.MyEdit);
        View button = findViewById(R.id.Submit);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO ここで、id が MyEdit の EditText からテキストを取得して、結果にセットする
                Intent intent = new Intent();
                String text = editText.getText().toString();
                intent.putExtra("RESULT", text);
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
}
