package jp.mixi.assignment.controller;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast toast = Toast.makeText(this, "MainonResume", Toast.LENGTH_SHORT);
        toast.show();
        findViewById(R.id.controller1_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = view.getContext();
                context.startActivity(new Intent(context, Controller1Activity.class));
            }
        });
        findViewById(R.id.controller2_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = view.getContext();
                context.startActivity(new Intent(context, Controller2Activity.class));
            }
        });
        findViewById(R.id.controller3_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = view.getContext();
                context.startActivity(new Intent(context, Controller3Activity.class));
            }
        });
        findViewById(R.id.controller4_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = view.getContext();
                context.startActivity(new Intent(context, Controller4Activity.class));
            }
        });

        findViewById(R.id.controller5_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = view.getContext();
                context.startActivity(new Intent(context, Controller5Activity.class));
            }
        });
    }

//    @Override
//    protected void onResume() {
//        super.onResume();
//        Toast toast = Toast.makeText(this, "MainonResume", Toast.LENGTH_SHORT);
//        toast.show();
//    }
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//        Toast toast = Toast.makeText(this, "MainonPause", Toast.LENGTH_SHORT);
//        toast.show();
//    }
//
//    @Override
//    protected void onStop() {
//        super.onStop();
//
//        Toast toast = Toast.makeText(this, "MainonStop", Toast.LENGTH_SHORT);
//        toast.show();
//    }
//
//    @Override
//    protected void onRestart() {
//        super.onRestart();
//        Toast toast = Toast.makeText(this, "MainonRestart", Toast.LENGTH_SHORT);
//        toast.show();
//    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        Toast toast = Toast.makeText(this, "MainonDestroy", Toast.LENGTH_SHORT);
//        toast.show();
//    }
}
