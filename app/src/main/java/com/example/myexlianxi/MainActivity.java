package com.example.myexlianxi;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button=(Button)findViewById(R.id.buttondenglu);
        final EditText denglu=(EditText)findViewById(R.id.userid) ;
        final EditText password=(EditText)findViewById(R.id.password) ;

        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                LayoutInflater inflater = getLayoutInflater();
                builder.setView(inflater.inflate(R.layout.login_dialog,null))
                        .setTitle("登陆")
                        .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                if(denglu.getText().equals("abc")&&password.getText().equals("123")){
                                    
                                }

                            }
                        })
            }

    }



    });



}
