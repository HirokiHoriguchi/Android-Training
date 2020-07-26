
package jp.mixi.assignment.controller;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


/**
 * TODO: 課題2
 * 画面回転や、他のアプリ・画面の起動等で、状態遷移が起こると、それ以前の状態で持っていたデータが失われてしまいます。
 * これを防ぐため、この Activity の中で状態管理をしてください。
 *
 * @author keishin.yokomaku
 */
public class Controller2Activity extends AppCompatActivity implements TextWatcher {


    private int mTapCount = 0;
    private Button mBtnTest,mBtnShow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Hint: 状態遷移が何も起こっていない場合は、savedInstanceState は null です
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_controller2);

        if (savedInstanceState != null){
            String stg = savedInstanceState.getString("edit");
            EditText editText = (EditText) findViewById(R.id.Editor);
            editText.setText(stg);
            int Tapcount = savedInstanceState.getInt("tap_count");
            mTapCount = Tapcount;
        }

        mBtnTest = (Button) findViewById(R.id.btn_count_up);
        mBtnTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTapCount++;
            }
        });

        mBtnShow = (Button) findViewById(R.id.btn_show);
        mBtnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Controller2Activity.this, String.valueOf(mTapCount), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        EditText text = (EditText) findViewById(R.id.Editor);
        text.addTextChangedListener(this);
    }

    /**
     * TODO: 復帰処理はこちらか onCreate
     */
//    @Override
//    protected void onRestoreInstanceState(Bundle savedInstanceState) {
//        super.onRestoreInstanceState(savedInstanceState);
//    }

    /**
     * TODO: 保存処理はこちら
     */
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        EditText editText = (EditText) findViewById(R.id.Editor);
        String stg = editText.getText().toString();
        outState.putString("edit", stg);

        outState.putInt("tap_count", mTapCount);
    }

    @Override
    protected void onStop() {
        super.onStop();
        EditText text = (EditText) findViewById(R.id.Editor);
        text.removeTextChangedListener(this);
    }

    @Override
    public void afterTextChanged(Editable s) {
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        TextView text = (TextView) findViewById(R.id.SyncedText);
        text.setText(s);
    }
}