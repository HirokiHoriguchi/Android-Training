package jp.mixi.practice.messagingandnotification;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by suino on 2015/02/25.
 */
public class IntentActivity1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_1);

        View button1 = findViewById(R.id.CallActivity1);
        View button2 = findViewById(R.id.CallActivity2);
        View button3 = findViewById(R.id.CallActivity3);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO ここに、NewActivity1 を呼び出す処理を書く
                Intent intent = new Intent(IntentActivity1.this, NewActivity1.class);
                startActivity(intent);

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO ここに、NewActivity2 を呼び出す処理を書く
                // TODO NewActivity2 は、toast_message をキーとした Extra のデータを必要としているので、適宜 Intent に含めること
                Intent intent = new Intent(IntentActivity1.this, NewActivity2.class);
                intent.putExtra("ForToast", "this is message");
                startActivity(intent);

            }
        });
        //pendinginten がよくわからない。他のアプリケーションを起動するためのintentと言う役割を持っているのはわかった。
        // ただ、他のアプリに実際に飛ばしてみる処理をお試しで実装するには時間がかかりすぎてしまうのでいったんパス。
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO ここに、NewActivity3 を呼び出す処理を書く
                // TODO Intent に、Intent.FLAG_ACTIVITY_NO_HISTORY という flag をセットするとどうなるかレポートすること
                Intent intent = new Intent(IntentActivity1.this, NewActivity3.class);
                PendingIntent activityIntent = PendingIntent.getActivity(IntentActivity1.this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
            }
        });
    }

}
