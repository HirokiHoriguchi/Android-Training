package jp.mixi.assignment.controller;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * TODO: 課題1
 * {@link Toast#makeText(Context, CharSequence, int)} または
 * {@link Toast#makeText(Context, int, int)} を利用して、各ライフサイクルメソッドがどのような順番で
 * 実行されているかを確認してください。
 * 確認したら、assignments/fundamentals/2nd/Report.md にその順番を記述してください。
 *
 * @author keishin.yokomaku
 */
public class Controller1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_controller1);

        Toast toast = Toast.makeText(this, "AonCreate", Toast.LENGTH_LONG);
        toast.show();
    }


//    @Override
//    protected void onResume() {
//        super.onResume();
//        Toast toast = Toast.makeText(this, "AonResume", Toast.LENGTH_SHORT);
//        toast.show();
//    }
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//        Toast toast = Toast.makeText(this, "AonPause", Toast.LENGTH_SHORT);
//        toast.show();
//    }
//
//    @Override
//    protected void onStop() {
//        super.onStop();
//
//        Toast toast = Toast.makeText(this, "AonStop", Toast.LENGTH_SHORT);
//        toast.show();
//    }
//
//    @Override
//    protected void onRestart() {
//        super.onRestart();
//        Toast toast = Toast.makeText(this, "AonRestart", Toast.LENGTH_SHORT);
//        toast.show();
//    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        Toast toast = Toast.makeText(this, "AonDestroy", Toast.LENGTH_SHORT);
//        toast.show();
//    }
}
