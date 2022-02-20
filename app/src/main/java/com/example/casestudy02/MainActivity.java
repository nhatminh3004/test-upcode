package com.example.casestudy02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText et_HoTen = findViewById(R.id.et_hoten);
        EditText et_NamSinh = findViewById(R.id.et_namsinh);

        Button btnSubmit = findViewById(R.id.bt_buttonSubmit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);//liên kết kết nối giữa 2 activity
                intent.putExtra("hoten",et_HoTen.getText().toString());//đẩy dữ liệu
                intent.putExtra("namsinh",et_NamSinh.getText().toString());//đẩy dữ liệu
                startActivity(intent);//bắt đầu start
            }
        });

    }
}