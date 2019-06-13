package com.example.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //declaring some variables
    private EditText editText_01;
    private Button btn_01;
    private TextView textView_01;
    private String usd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //cast the variables to their ids
        editText_01 = findViewById(R.id.EditText01);
        btn_01 = findViewById(R.id.bnt);
        textView_01 = findViewById(R.id.Yen);

        //Click event
        btn_01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //convert user's input to string
                usd = editText_01.getText().toString();
                //if else statement to make sure user cannot leave the Text Blank
                if (usd.equals("")) {
                    textView_01.setText("This field cannot be blank!");
                } else {
                    //convert string to double
                    Double d_Inputs = Double.parseDouble(usd);
                    //convert function, using currency rate as of 2019
                    Double result = d_Inputs * 112.02;
                    //display the result
                    textView_01.setText("$" + usd + " = " + "¥"+String.format("%.2f",result));
                    //clear the edit text after clicking
                    editText_01.setText("");
                }
            }
        });
    }
}
