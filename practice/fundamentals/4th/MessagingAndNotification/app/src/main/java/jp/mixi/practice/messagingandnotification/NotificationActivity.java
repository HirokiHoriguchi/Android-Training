package jp.mixi.practice.messagingandnotification;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.NotificationCompat;

/**
 * Created by suino on 2015/02/26.
 */
public class NotificationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);


        Intent intent = new Intent(this, SubActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);

        // TODO ここで通知を表示する
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this);
        Notification notification = builder
                // 通知の日時
                .setWhen(System.currentTimeMillis())
                // 通知のタイトル
                .setContentTitle("通知だヨ！")
                // 通知の詳細メッセージ
                .setContentText("通知の詳しい内容をここに書きます。")
                // 通知のアイコン
                .setSmallIcon(R.drawable.ic_launcher)
                // 通知を表示した瞬間、通知バーに表示するショートメッセージ
                .setTicker("通知だヨ！")
                // 通知をタップした時に使う PendingIntent
                .setContentIntent(pendingIntent)
                // この通知が未だ表示されていない時だけ、音やバイブレーション、ショートメッセージの表示を行う
                .setOnlyAlertOnce(true)
                // タップしたら消えるようにする
                .setAutoCancel(true)
                .build();


        NotificationManager manager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        manager.notify(0, notification);
    }

}
