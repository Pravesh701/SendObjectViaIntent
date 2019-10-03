package com.appinventiv.sendobjectviaintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {

    private TextView tvSendIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvSendIntent = findViewById(R.id.tv_send_intent);
        tvSendIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TestSerializable serializable = new TestSerializable();
                Intent intent = new Intent(MainActivity.this, GetIntentDataActivity.class);
                intent.putExtra("OBJ", serializable);
                startActivity(intent);


            }
        });
    }
}

class TestSerializable implements Serializable {
    public int add(){
        return 2+5;
    }
}
