package com.example.wubeast.calculator_v2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private String set;
    private double val1;
    private double val2;
    private double ans;
    private TextView value1_display;
    private TextView value2_display;
    private TextView sign_display;
    private EditText answer_display;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    public void init() {

        value1_display=(TextView)findViewById(R.id.value1_TextView);
         value2_display=(TextView)findViewById(R.id.value2_TextView);
        sign_display=(TextView)findViewById(R.id.sign_TextView);
        answer_display=(EditText)findViewById(R.id.answer_TextView);

    }

    public void btnNumClick(View v)
    {
        Button button=(Button) v;
        if(sign_display.getText()=="")
        {
            value1_display.append(button.getText());
        }
        else
        {
            value2_display.append(button.getText());
        }

    }
    public void btnClearClick(View v)
    {
        value1_display.setText("");
        value2_display.setText("");
        sign_display.setText("");

    }
    public void btnAnsClick(View v)
    {

        val1=Double.parseDouble(value1_display.getText().toString());
        val2=Double.parseDouble(value2_display.getText().toString());

        if(set=="plus")
        {
            ans=val1+val2;
        }
        else if(set=="minus")
        {
            ans=val1-val2;
        }
        else if(set=="div")
        {
            ans=val1/val2;
        }
        else if(set=="mult")
        {
            ans=val1*val2;
        }
        answer_display.setText(String.valueOf(ans));
    }
    public void btnAddClic(View v)
    {
        set="plus";
       sign_display.setText("+");
    }
    public void btnMinusClic(View v)
    {
        set="minus";
        sign_display.setText("-");
    }
    public void btnDivClic(View v)
    {
        set="div";
        sign_display.setText("/");
    }
    public void btnMultClic(View v)
    {
        set="mult";
        sign_display.setText("*");
    }
}
