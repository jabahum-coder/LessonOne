package com.lyecdevelopers.lessonone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

  public   TextView  mtext;
    public  TextView hereText;
    public  EditText edtUsername;
    public EditText edtPassword;
    public  Button mLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        String username = edtUsername.getText().toString();
        String password = edtPassword.getText().toString();

        getEditText(username,password);



    }

    private void getEditText(String user, String pass) {

        mLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hi"+user, Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, "Your password is"+pass, Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void init() {
        mtext = (TextView) findViewById(R.id.txtLogin);
        hereText =(TextView)  findViewById(R.id.txtHere);
        edtUsername = (EditText) findViewById(R.id.edtUsername);
        edtPassword = (EditText) findViewById(R.id.edtPassword);
        mLogin = (Button) findViewById(R.id.btnLogin);
    }
}