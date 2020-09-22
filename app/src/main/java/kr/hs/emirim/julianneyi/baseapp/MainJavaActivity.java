package kr.hs.emirim.julianneyi.baseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainJavaActivity extends AppCompatActivity implements View.OnClickListener {

    Button button1;
    CheckBox checkBox1;
    CheckBox checkBox2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.toast_btn);
        button1.setOnClickListener(this);

        checkBox1 = findViewById(R.id.checkBox1);
        checkBox1.setOnClickListener(this);
        checkBox2 = findViewById(R.id.checkBox2);

    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.toast_btn :
                Toast.makeText(this, "출력됬음",Toast.LENGTH_LONG).show();
                break;
            case R.id.checkBox1 :
            case R.id.checkBox2:

                CheckBox check = (CheckBox) v;
                Toast.makeText(this,
                        "내가 좋아하는 것은"+check.getText(),Toast.LENGTH_LONG).show();
                break;
        }

    }
}