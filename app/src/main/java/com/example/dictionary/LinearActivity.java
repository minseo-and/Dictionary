package com.example.dictionary;

import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LinearActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear);
    }

    public void Btn1Click(View v) {
        Toast toast = Toast.makeText(this, "ㅋㅋ", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.END | Gravity.BOTTOM, 10, 10);
        // Toast 메시지의 위치를 바꾸는 코드
        // 안드로이드 11버전 이상 즉 API 30 이상인 기기에서는 적용되지 않음
        toast.show();
    }
}
