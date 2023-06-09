package com.example.smarthouse;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button_1;
    Button button_2;
    Button button_3;
    Button button_4;
    Button button_5;
    boolean[] buttonTest = new boolean[]{false, false, true, false, false};
    int color_green = Color.rgb(20, 140, 20);
    int color_red = Color.rgb(186, 11, 11);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonRendering();
    }

    public void onMyButton_1Click(View view) {
        button_1 = (Button) findViewById(R.id.button);
        buttonChecked(button_1, 0);

        /*
            // выводим сообщение
            Toast.makeText(this, "Зачем вы нажали?", Toast.LENGTH_SHORT).show();
        */
    }

    public void onMyButton_2Click(View view) {
        button_2 = (Button) findViewById(R.id.button2);
        buttonChecked(button_2, 1);
    }

    public void onMyButton_3Click(View view) {
        button_3 = (Button) findViewById(R.id.button3);
        buttonChecked(button_3, 2);
    }

    public void onMyButton_4Click(View view) {
        button_4 = (Button) findViewById(R.id.button4);
        buttonChecked(button_4, 3);
    }

    public void onMyButton_5Click(View view) {
        button_5 = (Button) findViewById(R.id.button4);
        buttonChecked(button_5, 4);
    }

    @SuppressLint("SetTextI18n")
    public void buttonChecked(Button button, int count_button) {
        if(buttonTest[count_button]) {
            button.setBackgroundColor(color_green);
            button.setText("On");
            buttonTest[count_button] = false;
        } else {
            button.setBackgroundColor(color_red);
            button.setText("Off");
            buttonTest[count_button] = true;
        }

    }

    public void buttonRendering() {
        button_1 = (Button) findViewById(R.id.button);
        button_2 = (Button) findViewById(R.id.button2);
        button_3 = (Button) findViewById(R.id.button3);
        button_4 = (Button) findViewById(R.id.button4);
        button_5 = (Button) findViewById(R.id.button5);

        buttonChecked(button_1, 0);
        buttonChecked(button_2, 1);
        buttonChecked(button_3, 2);
        buttonChecked(button_4, 3);
        buttonChecked(button_5, 4);
    }
}