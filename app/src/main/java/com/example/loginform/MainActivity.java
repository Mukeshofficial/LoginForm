package com.example.loginform;

import static androidx.appcompat.app.AlertDialog.*;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etUserName, etPassword;
    Button btSubmit;
    private Object Button;
    Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUserName = findViewById(R.id.etUserName);
        etPassword = findViewById(R.id.etPassword);
        Button = findViewById(R.id.btSubmit);

        btSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (etUserName.getText().toString().equals("admin") && etPassword.getText().toString().equals("admin")) {
                    AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);

                    builder.setIcon(R.drawable.ic_baseline_check_24);
                    builder.setTitle("Login Successfully !!!");
                    builder.setMessage("Welcome to Android Coding...");

                    builder.setNegativeButton("YES", new OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int which) {
                            dialogInterface.cancel();

                        }
                    });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                } else {
                    Toast.makeText(getApplicationContext(), "Invalid Username & Password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}


