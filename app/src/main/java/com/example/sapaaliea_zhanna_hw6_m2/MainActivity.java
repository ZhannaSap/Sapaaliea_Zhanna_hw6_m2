package com.example.sapaaliea_zhanna_hw6_m2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.InputType;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView enter = findViewById(R.id.text_view_ent);
        EditText editTextEmail = findViewById(R.id.editTextEmail);
        EditText editTextPassword = findViewById(R.id.editTextPassword);
        Button buttonLogin = findViewById(R.id.buttonLogin);
        TextView textViewWelcome = findViewById(R.id.textViewWelcome);
        TextView textViewDescription = findViewById(R.id.textViewDescription);
        TextView textViewForgotPassword = findViewById(R.id.foggot_password_text);
        TextView textClickHere = findViewById(R.id.textview_click_here);

        editTextPassword.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);

        editTextEmail.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.length() > 0) {
                    buttonLogin.setBackgroundColor(getResources().getColor(R.color.orange));
                } else {
                    buttonLogin.setBackgroundColor(getResources().getColor(R.color.gray));
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        editTextPassword.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.length() > 0) {
                    buttonLogin.setBackgroundColor(getResources().getColor(R.color.orange));
                } else {
                    buttonLogin.setBackgroundColor(getResources().getColor(R.color.gray));
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = editTextEmail.getText().toString();
                String password = editTextPassword.getText().toString();


                if (email.equals("admin") && password.equals("admin")) {
                    Toast.makeText(MainActivity.this, "Вы успешно зарегестрировались", Toast.LENGTH_SHORT).show();
                    textViewWelcome.setVisibility(View.VISIBLE);
                    enter.setVisibility(View.GONE);
                    textViewDescription.setVisibility(View.GONE);
                    editTextEmail.setVisibility(View.GONE);
                    editTextPassword.setVisibility(View.GONE);
                    buttonLogin.setVisibility(View.GONE);
                    textViewForgotPassword.setVisibility(View.GONE);
                    textClickHere.setVisibility(View.GONE);
                } else {
                    Toast.makeText(MainActivity.this, "Неправельный логин и пароль", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}