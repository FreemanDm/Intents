package com.freeman.intents.intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FormActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText inputName, inputPhoneNumber;
    private Button saveBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        inputName = (EditText) findViewById(R.id.user_name);
        inputPhoneNumber = (EditText) findViewById(R.id.user_phone);
        saveBtn = (Button) findViewById(R.id.save_btn);
        saveBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.save_btn){
            Intent intent = new Intent();
            intent.putExtra("NAME", String.valueOf(inputName.getText()));
            intent.putExtra("PHONE_NUMBER", String.valueOf(inputPhoneNumber.getText()));
            setResult(RESULT_OK, intent);
            finish();
        }
    }
}
