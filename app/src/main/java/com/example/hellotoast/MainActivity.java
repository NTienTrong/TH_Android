package com.example.hellotoast;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private int count = 0;
    private TextView countTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countTextView = findViewById(R.id.text_count);
    }

    public void showToast(View view) {
        Toast.makeText(this, "Hello Toast!", Toast.LENGTH_SHORT).show();
    }

    public void incrementCount(View view) {
        count++;
        countTextView.setText(String.valueOf(count));
    }
}
