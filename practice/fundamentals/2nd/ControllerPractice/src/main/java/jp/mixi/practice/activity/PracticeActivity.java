package jp.mixi.practice.activity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PracticeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice);

        // FragmentManager も、android.support.v4.app.FragmentManager を利用する
        FragmentManager manager = getSupportFragmentManager();
        // レイアウトから Fragment を見つけ出してインスタンスを得る
        Fragment fragment = manager.findFragmentById(R.id.NewFragment);
    }
}
