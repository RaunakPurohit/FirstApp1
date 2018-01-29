package test.com;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText etFirstNo, etSecondNo;
Button btAdd;
int firstNo, secondNo, result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etFirstNo = findViewById(R.id.etNumberone);
        etSecondNo = findViewById(R.id.etNumberTwo);
        //btAdd = findViewById(R.id.btnAdd);

    }

    public void Addition(View v){
        firstNo = Integer.parseInt(etFirstNo.getText().toString());
        secondNo = Integer.parseInt(etSecondNo.getText().toString());
        result = firstNo + secondNo;
        Toast.makeText(this, "Sum is " + result, Toast.LENGTH_SHORT).show();
    }

}
