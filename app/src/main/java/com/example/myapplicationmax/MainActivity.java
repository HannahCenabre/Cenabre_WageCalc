package com.example.myapplicationmax;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    EditText num1;
    EditText num2;
    TextView result;
    Button compare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = (EditText) findViewById(R.id.txtNum1);
        num2 = (EditText) findViewById(R.id.txtNum2);
        result = (TextView) findViewById(R.id.txtRes);
        compare = (Button) findViewById(R.id.btnCompare);
        compare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x, y, myMax;
                try {
                    x = Integer.parseInt(num1.getText().toString());
                    y = Integer.parseInt(num2.getText().toString());
                } catch (NumberFormatException e) {
                    System.err.println("Input is not a valid integer: " + e.getMessage());
                    x = 0;
                    y = 0;
                }
                myMax = max(x, y);
                result.setText(String.valueOf("The max Value is : "+myMax)); // Convert myMax to string before setting it as text
            }
        });
    }

    public int max(int num1, int num2){
        int maxResult;
        if (num1 > num2)
            maxResult = num1;
        else
            maxResult = num2;
        return maxResult;
    }
}