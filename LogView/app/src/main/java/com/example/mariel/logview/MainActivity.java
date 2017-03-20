package com.example.mariel.logview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    EditText idEt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        idEt = (EditText) findViewById(R.id.etIId);

    }

    private void findViewById(EditText etIId) {
    }

    public void OnLogin(View view) {
        String IId = idEt.getText().toString();
        String type = "login";
        backgroundWorker backgroundWorker = new backgroundWorker(this);
        backgroundWorker.execute(type,IId);



    }
}

