package com.example.casestudy02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String HoTen =getIntent().getExtras().getString("hoten");
        String NamSinh = getIntent().getExtras().getString("namsinh");
        String st="";
        st="Họ Và Tên: \t"+HoTen;
        String ns="";
        st=st+ " \nNăm Sinh: "+NamSinh;
        TextView textView_KetQua = findViewById(R.id.textview_Ketqua);
        textView_KetQua.setText(st);
    }
}