package manal13.calci2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button add = (Button) findViewById(R.id.add);
        Button subtract = (Button) findViewById(R.id.subtract);
        Button multiply = (Button) findViewById(R.id.multiply);
        Button divide = (Button) findViewById(R.id.divide);
    }
    public void add(View v)
    {
        int res;
        TextView a = (TextView) findViewById(R.id.first);
        TextView b = (TextView) findViewById(R.id.second);
        int c = new Integer(a.getText().toString());
        int d = new Integer(b.getText().toString());
        res = c+d;
        Toast.makeText(getApplicationContext(),"The result is "+res,Toast.LENGTH_SHORT).show());
    }
    public void subtract(View v)
    {
        int res;
        TextView a = (TextView) findViewById(R.id.first);
        TextView b = (TextView) findViewById(R.id.second);
        int c = new Integer(a.getText().toString());
        int d = new Integer(b.getText().toString());
        res = c+d;
        Toast.makeText(getApplicationContext(),"The result is "+res,Toast.LENGTH_SHORT).show());
    }
    public void multiply(View v)
    {
        int res;
        TextView a = (TextView) findViewById(R.id.first);
        TextView b = (TextView) findViewById(R.id.second);
        int c = new Integer(a.getText().toString());
        int d = new Integer(b.getText().toString());
        res = c+d;
        Toast.makeText(getApplicationContext(),"The result is "+res,Toast.LENGTH_SHORT).show());
    }
    public void divide(View v)
    {
        int res;
        TextView a = (TextView) findViewById(R.id.first);
        TextView b = (TextView) findViewById(R.id.second);
        int c = new Integer(a.getText().toString());
        int d = new Integer(b.getText().toString());
        res = c+d;
        Toast.makeText(getApplicationContext(),"The result is "+res,Toast.LENGTH_SHORT).show());
    }
}
