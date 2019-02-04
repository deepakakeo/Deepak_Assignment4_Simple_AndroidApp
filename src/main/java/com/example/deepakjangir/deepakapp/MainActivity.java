package com.example.deepakjangir.deepakapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText Name;
    private EditText Password;
    private Button Login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name=(EditText)findViewById(R.id.editText5);
        Password=(EditText)findViewById(R.id.editText7);
        Login=(Button)findViewById(R.id.button);
        Login.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View view)
            {

            validate(Name.getText().toString(),Password.getText().toString());
            }
        });
    }
    private void validate(String userName,String userPassword){
        if((userName.equals("Admin"))&&(userPassword.equals("1234"))) {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        }
    }
}
