package com.example.sid.a9x9tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.sid.a9x9tictactoe.MainActivity;

public class firstpage extends AppCompatActivity {

    EditText etPname1,etPname2;
    Button bDone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.firstpage);
        etPname1 = (EditText) findViewById(R.id.etpname1);
        etPname2 = (EditText) findViewById(R.id.etpname2);
        bDone = (Button) findViewById(R.id.bDone);

        bDone.setOnClickListener(new View.OnClickListener() {
                                     public void onClick(View view) {
                                         String name1 = etPname1.getText().toString();
                                         String name2 = etPname2.getText().toString();
                                         Intent i = new Intent(firstpage.this, MainActivity.class);
                                         i.putExtra("NAME1", name1);
                                         i.putExtra("NAME2", name2);
                                         startActivity(i);
                                     }
                                 }
        );
    }
}
