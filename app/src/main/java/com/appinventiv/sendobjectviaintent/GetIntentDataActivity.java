package com.appinventiv.sendobjectviaintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.TextureView;
import android.widget.TextView;

public class GetIntentDataActivity extends AppCompatActivity {
    private TextView tvGetIntentData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_intent_data);

        tvGetIntentData = findViewById(R.id.tv_get_intent);

        TestSerializable testSerializable = (TestSerializable) getIntent().getExtras().getSerializable("OBJ");
        Log.d("DATA", "Data is "+testSerializable.add());

        tvGetIntentData.setText("GetIntent Data is  " + Integer.toString(testSerializable.add()));
    }
}
