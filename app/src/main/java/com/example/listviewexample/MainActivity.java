package com.example.listviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String[] russian_words = {"Доброе утро!", "Здравствуйте!", "Я турист", "Добрый вечер!", "До свидания!",
    "Я в Кызыле впервые", "Извините", "Да", "Сегодня", "Завтра", "Сейчас", "Далеко"};
    String[] tyva_words = {"Эртенгиниӊ \n мендизи-биле!", "Экии!", "Мен турист мен", "Кежээкиниӊ \n мендизи-биле!", "Байырлыг!",
    "Мен Кызылче бир \n дугаар кээп тур мен", "Буруулуг болдум", "Ийе", "Бөгүн", "Эртен", "Ам", "Ырак"};
    int[] colors = new int[3];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        colors[0] = Color.parseColor("#559966CC");
        colors[1] = Color.parseColor("#55336699");
        colors[2] = Color.parseColor("#44422234");
        LinearLayout linLayout = (LinearLayout) findViewById(R.id.linLayout);
        LayoutInflater ltInflater = getLayoutInflater();
        for (int i = 0; i < russian_words.length; i++){
            View item = ltInflater.inflate(R.layout.item, linLayout, false);
            TextView tvName = (TextView) item.findViewById(R.id.tvName);
            tvName.setText(russian_words[i]);
            TextView tvPosition = (TextView) item.findViewById(R.id.tvPosition);
            tvPosition.setText(tyva_words[i]);
            item.getLayoutParams().width = LinearLayout.LayoutParams.MATCH_PARENT;
            item.setBackgroundColor(colors[i % 3]);
            linLayout.addView(item);

        }
    }
}