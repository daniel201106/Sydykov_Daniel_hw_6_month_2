package com.gekss.sydykov_daniel_hw_6_month_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import javax.sql.RowSetWriter;

public class MainActivity extends AppCompatActivity {

    private TextView tvVhod, tvWelcom,tvFirst, tvSecond;

    private EditText etUser, etPassword;

    private Button btnEnter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvVhod = findViewById(R.id.tv_vhod);
        tvWelcom = findViewById(R.id.tv_welcom);
        tvFirst = findViewById(R.id.tv_first);
        tvSecond = findViewById(R.id.tv_second);
        etUser = findViewById(R.id.et_user);
        etPassword = findViewById(R.id.et_user);
        btnEnter = findViewById(R.id.btn_enter);
        etPassword.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (etPassword.getText().toString().isEmpty()){
                    btnEnter.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.gray));
                } else {
                    btnEnter.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.orenge));
                }
            }
        });
        etUser.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (etUser.getText().toString().isEmpty()){
                    btnEnter.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.gray));
                } else {
                    btnEnter.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.orenge));
                }
            }
        });
        btnEnter.setOnClickListener(view -> {
            if (etUser.getText().toString().equals("admin") && etPassword.getText().toString().equals("admin"));
            tvSecond.setVisibility(View.GONE);
            tvFirst.setVisibility(View.GONE);
            tvVhod.setVisibility(View.GONE);
            etPassword.setVisibility(View.GONE);
            etUser.setVisibility(View.GONE);
            btnEnter.setVisibility(View.GONE);
            Toast.makeText(this, "Вы успешно зарегистрировались", Toast.LENGTH_SHORT).show();
        });
    }
}