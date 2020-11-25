package com.example.dz1_27_android1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText et_login;
    private EditText et_password;
    private Button button;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        et_login = findViewById(R.id.login);
        et_password = findViewById(R.id.password);
        button = findViewById(R.id.btn_button);
        textView = findViewById(R.id.txt_message);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et_login.getText().toString().equals("")){
                    textView.setText("Вы ввели не правильные данные");
                }      else {
                    textView.setText("Успешно!");
                }
            }
        });
    }
}