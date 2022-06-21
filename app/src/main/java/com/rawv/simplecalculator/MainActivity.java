package com.rawv.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText ent1;
    private EditText ent2;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ent1=(EditText)findViewById(R.id.ent1);
        ent2=(EditText)findViewById(R.id.ent2);
        result=(TextView)findViewById(R.id.Result);
    }

    public void btndiv(View view) {
        int n1=Integer.parseInt(ent1.getText().toString());
        int n2=Integer.parseInt(ent2.getText().toString());
        int div = n1/n2;
        result.setText(String.valueOf(div));
    }

    public void btnmul(View view) {
        int n1=Integer.parseInt(ent1.getText().toString());
        int n2=Integer.parseInt(ent2.getText().toString());
        int mul = n1*n2;
        result.setText(String.valueOf(mul));
    }

    public void btnsub(View view) {
        int n1=Integer.parseInt(ent1.getText().toString());
        int n2=Integer.parseInt(ent2.getText().toString());
        int sub = n1-n2;
        result.setText(String.valueOf(sub));
    }

    public void btnadd(View view) {
        int n1=Integer.parseInt(ent1.getText().toString());
        int n2=Integer.parseInt(ent2.getText().toString());
        int add = n1+n2;
        result.setText(String.valueOf(add));
    }
}