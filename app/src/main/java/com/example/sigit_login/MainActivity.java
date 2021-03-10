package com.example.sigit_login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    Button btnLogin;
    EditText edmail, edpassword;
    String nama, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLogin=findViewById(R.id.bsignin);
        edmail=findViewById(R.id.TextEmail);
        edpassword=findViewById(R.id.TextPassword);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nama = edmail.getText().toString();
                password = edpassword.getText().toString();
                if (nama.equals("sigit") && password.equals("1234")){
                    Toast t = Toast.makeText(getApplicationContext()
                            ,"login Berhasil",Toast.LENGTH_LONG);
                    t.show();
                }
                else if(nama.equals("sigit") && !password.equals("1234")){
                    Toast t = Toast.makeText(getApplicationContext()
                            ,"Password Salah",Toast.LENGTH_LONG);
                    t.show();
                }
                else if(!nama.equals("sigit") && password.equals("1234")){
                    Toast t = Toast.makeText(getApplicationContext()
                            ,"Email Salah",Toast.LENGTH_LONG);
                    t.show();
                }
                else{
                    Toast t = Toast.makeText(getApplicationContext()
                            ,"Email dan Password Salah",Toast.LENGTH_LONG);
                    t.show();
                }

            }
        });
    }
}