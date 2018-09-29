package com.example.administrator.webtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText adress;

    private Button go;

    private String url;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adress = (EditText) findViewById(R.id.adress);
        go = (Button) findViewById(R.id.go);
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                url = adress.getText().toString();
                if(url.isEmpty()){
                    Toast.makeText(MainActivity.this, "请先输入网址", Toast.LENGTH_SHORT).show();
                }else {
                    Intent intent = new Intent(MainActivity.this, WebActivity.class);
                    intent.putExtra("URL", url);
                    startActivity(intent);
                }
            }
        });
    }
}
