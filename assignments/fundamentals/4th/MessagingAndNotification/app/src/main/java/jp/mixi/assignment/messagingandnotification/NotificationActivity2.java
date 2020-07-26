package jp.mixi.assignment.messagingandnotification;

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
public class NotificationActivity2 extends AppCompatActivity {
    public static final String ACITON_VIEW_MY_OWN = "jp.mixi.assignment.messagingandnotification.android.intent.action.VIEW_MY_OWN";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification2);

        // TODO ここで通知を表示する
        // TODO intent には、ACTION_VIEW_MY_OWN の action をセットするだけにしておく
        // TODO 通知をタップした時に、複数の選択肢が表示されるが、どれがどの Activity に対応しているかがわかりづらくなっているので、AndroidManifest を編集して表示をわかりやすくする
        //以下の記述について。Wifiの速度が遅すぎて情報を見られないのでオフィスで閲覧すること。https://tech.pjin.jp/blog/2014/02/05/androidtips-broadcast%E3%81%A8intent%E3%81%AB%E3%81%A4%E3%81%84%E3%81%A6/
        Intent intent = new Intent(Intent.ACTION_VIEW_MY_OWN); // Broadcastするときは、元のIntentなどの情報は要らない
//        intent.setAction(ACTION_VIEW_MY_OWN);  // マニフェストの中のActivityのいくつかのintent-filterに<action android:name="jp.mixi.assignment.messagingandnotification.android.intent.action.VIEW_MY_OWN" />があるintent filterを書いておく事！
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);

        NotificationCompat.Builder builder = new NotificationCompat.Builder(this);
        Notification notification = builder
                .setSmallIcon(R.drawable.ic_launcher)
                .setContentTitle("通知テスト")
                .setContentText("通知の詳細テスト")
                .setContentIntent(pendingIntent)
                .build();

        NotificationManager manager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        manager.notify(0, notification);
    }
}
