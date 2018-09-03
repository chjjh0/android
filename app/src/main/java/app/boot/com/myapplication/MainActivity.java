package app.boot.com.myapplication;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowInsets;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Context ctx = MainActivity.this;

        findViewById(R.id.plusBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                EditText num1 = findViewById(R.id.num1);
                String sNum1 =  num1.getText().toString();
                EditText num2 = findViewById(R.id.num2);
                String sNum2 = num2.getText().toString();
                TextView result = findViewById(R.id.result);
                String sresult = result.toString();
                sresult = String.valueOf(Integer.parseInt(sNum1)+Integer.parseInt(sNum2));
                Toast.makeText(ctx,sresult, Toast.LENGTH_SHORT).show();
                /*Toast.makeText(ctx, "입력한 숫자값:"+sNum1, Toast.LENGTH_SHORT).show();*/
            }
        });
        findViewById(R.id.minusBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText num1 = findViewById(R.id.num1);
                String sNum1 = num1.getText().toString();
                EditText num2 = findViewById(R.id.num2);
                String sNum2 = num2.getText().toString();
                TextView result = findViewById(R.id.result);
                String sresult = result.toString();
                sresult = String.valueOf(Integer.parseInt(sNum1)-Integer.parseInt(sNum2));
                Toast.makeText(ctx,sresult, Toast.LENGTH_SHORT).show();
            }
        });
        findViewById(R.id.multiBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText num1 = findViewById(R.id.num1);
                String sNum1 = num1.getText().toString();
                EditText num2 = findViewById(R.id.num2);
                String sNum2 = num2.getText().toString();
                TextView result = findViewById(R.id.result);
                String sresult = result.toString();
                sresult = String.valueOf(Integer.parseInt(sNum1)*Integer.parseInt(sNum2));
                Toast.makeText(ctx,sresult, Toast.LENGTH_SHORT).show();
            }
        });
        findViewById(R.id.dividBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText num1 = findViewById(R.id.num1);
                String sNum1 = num1.getText().toString();
                EditText num2 = findViewById(R.id.num2);
                String sNum2 = num2.getText().toString();
                TextView result = findViewById(R.id.result);
                String sresult = result.toString();
                sresult = String.valueOf(Integer.parseInt(sNum1)/Integer.parseInt(sNum2));
                Toast.makeText(ctx,sresult, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
