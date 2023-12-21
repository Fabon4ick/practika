package com.example.android;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MaterialButton button1 = findViewById(R.id.button1);
        MaterialButton button2 = findViewById(R.id.button2);
        MaterialButton button3 = findViewById(R.id.button3);
        MaterialButton button4 = findViewById(R.id.button4);
        MaterialButton button5 = findViewById(R.id.button5);
        MaterialButton button6 = findViewById(R.id.button6);
        MaterialButton button7 = findViewById(R.id.button7);
        MaterialButton button8 = findViewById(R.id.button8);
        MaterialButton button9 = findViewById(R.id.button9);
        MaterialButton button10 = findViewById(R.id.button10);
        MaterialButton button11 = findViewById(R.id.button11);
        MaterialButton button12 = findViewById(R.id.button12);


        ImageView imageView2 = findViewById(R.id.imageView2);
        ImageView imageView3 = findViewById(R.id.imageView3);
        ImageView imageView5 = findViewById(R.id.imageView5);
        ImageView imageView6 = findViewById(R.id.imageView6);

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGpsActivity();
            }
        });

        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {openCalendarActivity();}
        });


        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {openInfoActivity();}
        });

        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {openProfilActivity();}
        });


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSecondActivity();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openThirdActivity();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFourthActivity();
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFifthActivity();
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSixthActivity();
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSeventhActivity();
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openEighthActivity();
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNinthActivity();
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTenthActivity();
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openEleventhActivity();
            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTwelfthActivity();
            }
        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openThirteenthActivity();
            }
        });
    }
    private void openGpsActivity() {
        Intent intent = new Intent(this, GpsActivity.class);
        startActivity(intent);
        // Дополнительные настройки перехода, если нужно
    }
    private void openCalendarActivity() {
        Intent intent = new Intent(this, CalendarActivity.class);
        startActivity(intent);
        // Дополнительные настройки перехода, если нужно
    }
    private void openInfoActivity() {
        Intent intent = new Intent(this, InfoActivity.class);
        startActivity(intent);
        // Дополнительные настройки перехода, если нужно
    }
    private void openProfilActivity() {
        Intent intent = new Intent(this, ProfilActivity.class);
        startActivity(intent);
        // Дополнительные настройки перехода, если нужно
    }

    private void openThirdActivity() {
        Intent intent = new Intent(this, ThirdActivity.class);
        startActivity(intent);
    }

    private void openSecondActivity() {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
    private void openFourthActivity() {
        Intent intent = new Intent(this, FourthActivity.class);
        startActivity(intent);
    }
    private void openFifthActivity() {
        Intent intent = new Intent(this, FifthActivity.class);
        startActivity(intent);
    }
    private void openSixthActivity() {
        Intent intent = new Intent(this, SixthActivity.class);
        startActivity(intent);
    }
    private void openSeventhActivity() {
        Intent intent = new Intent(this, SeventhActivity.class);
        startActivity(intent);
    }
    private void openEighthActivity() {
        Intent intent = new Intent(this, EighthActivity.class);
        startActivity(intent);
    }
    private void openNinthActivity() {
        Intent intent = new Intent(this, NinthActivity.class);
        startActivity(intent);
    }
    private void openTenthActivity() {
        Intent intent = new Intent(this, TenthActivity.class);
        startActivity(intent);
    }
    private void openEleventhActivity() {
        Intent intent = new Intent(this, EleventhActivity.class);
        startActivity(intent);
    }
    private void openTwelfthActivity() {
        Intent intent = new Intent(this, TwelfthActivity.class);
        startActivity(intent);
    }
    private void openThirteenthActivity() {
        Intent intent = new Intent(this, ThirteenthActivity.class);
        startActivity(intent);
    }

}