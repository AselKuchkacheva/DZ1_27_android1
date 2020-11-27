package com.example.dz1_27_android1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private EditText etlogin;
    private EditText etpassword;
    private Button button;
    private TextView textView1, textView2, textView3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }


    private void init() {
        etlogin = findViewById(R.id.login);
        etpassword = findViewById(R.id.password);
        button = findViewById(R.id.btn_button);
        textView1 = findViewById(R.id.txt_message1);
        textView2 = findViewById(R.id.txt_message2);
        textView3 = findViewById(R.id.txt_message3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etlogin.getText().toString().isEmpty()) {
                    textView1.setText("Логин не должен быть пустым!");
                }
                else if (etpassword.getText().toString().isEmpty()){
                    textView2.setText("Заполните пароль!");
                }
                else if (etpassword.getText().length()<6){
                    textView3.setText("Длина пароли должна быть больше 6 символов!");
                }
                else {
                    textView1.setText("Успешно!");
                    textView2.setText("Успешно!");
                    textView3.setText("Успешно!");
                }
            }
        });
    }
}