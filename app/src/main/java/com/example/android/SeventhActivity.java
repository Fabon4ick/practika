package com.example.android;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SeventhActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventh);

        // Инициализация ImageButton внутри метода onCreate
        ImageButton imageView10 = findViewById(R.id.imageView10);

        imageView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // При нажатии, меняем цвет изображения на красный
                imageView10.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.green), PorterDuff.Mode.SRC_IN);
            }
        });
    }

    public void onBackButtonClick(View view) {
        // Здесь вы можете определить действия при нажатии, например, перейти на главный экран
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}