package com.example.lesson1android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private ImageView imageView;
    private EditText editText;
    private Button button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
       textView = findViewById(R.id.Приветствие);
       imageView = findViewById(R.id.Картина);
       editText = findViewById(R.id.Надпись);
       button = findViewById(R.id.Кнопка);
       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               String text = editText.getText().toString();
               textView.setText(text);
               imageView.setImageResource(R.drawable.ic_launcher_foreground);
           }
       });
             imageView.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {
                 textView.setText("");
                 editText.setText("");
                 }
             });

    }
}
