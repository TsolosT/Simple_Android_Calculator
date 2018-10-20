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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnNumClick(View v)
    {
        TextView textView=(TextView)findViewById(R.id.infoTextView);
        TextView textView1=(TextView)findViewById(R.id.textView);
        TextView pros=(TextView)findViewById(R.id.textView2);
        Button button=(Button) v;
        if(pros.getText()=="")
        {
            textView.append(button.getText());
        }
        else
        {
            textView1.append(button.getText());
        }

    }
    public void btnClearClick(View v)
    {
        TextView textView=(TextView)findViewById(R.id.infoTextView);
        TextView textView1=(TextView)findViewById(R.id.textView);
        TextView prosimo=(TextView)findViewById(R.id.textView2);

        textView1.setText("");
        textView.setText("");
        prosimo.setText("");
    }
    public void btnAnsClick(View v)
    {
        TextView value1=(TextView)findViewById(R.id.infoTextView);
        TextView value2=(TextView)findViewById(R.id.textView);
        EditText text=(EditText)findViewById(R.id.editText);

        val1=Double.parseDouble(value1.getText().toString());
        val2=Double.parseDouble(value2.getText().toString());

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
        text.setText(String.valueOf(ans));
    }
    public void btnAddClic(View v)
    {   TextView prosimo=(TextView)findViewById(R.id.textView2);
        set="plus";
        prosimo.setText("+");
    }
    public void btnMinusClic(View v)
    {   TextView prosimo=(TextView)findViewById(R.id.textView2);
        set="minus";
        prosimo.setText("-");
    }
    public void btnDivClic(View v)
    {   TextView prosimo=(TextView)findViewById(R.id.textView2);
        set="div";
        prosimo.setText("/");
    }
    public void btnMultClic(View v)
    {   TextView prosimo=(TextView)findViewById(R.id.textView2);
        set="mult";
        prosimo.setText("*");
    }
}
