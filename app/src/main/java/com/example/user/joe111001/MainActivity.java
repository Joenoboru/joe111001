package com.example.user.joe111001;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout ll = new LinearLayout(MainActivity.this);//建立linearlayout 物件
        // ll.setOrientation(LinearLayout.VERTICAL);
        ll.setOrientation(LinearLayout.HORIZONTAL);//設定linearlayout為水平

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT, 1);//建立Layout參數物件

        Button btn = new Button(MainActivity.this);//建立button物件
        btn.setText("Button!!");//設定btn上面的文字
        btn.setLayoutParams(params);//將參數資料設定給btn
        ll.addView(btn);//將btn放進view中
        Button btn2 = new Button(MainActivity.this);
        btn2.setLayoutParams(params);//將參數資料設定給btn
        btn2.setText("Button 22 !!");
        ll.addView(btn2);
        setContentView(ll);
//        Button btn = new Button(MainActivity.this);
//        btn.setText("click me");
//        setContentView(btn);
    }
}
