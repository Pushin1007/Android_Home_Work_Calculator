package geekbrains.android_home_work_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;


import geekbrains.android_home_work_calculator.ui.MainActivity;

public class StartActivity extends AppCompatActivity {
    private boolean nigthTheme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        CheckBox checkBox = findViewById(R.id.check_theme);


        Intent intent = new Intent(StartActivity.this, MainActivity.class); // создаем интент


        findViewById(R.id.start).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra(MainActivity.ARG_THEME, nigthTheme);  // кледем данные по ключу в интент. Примитивы
                startActivity(intent); // вызываем метод контекст

            }
        });


        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    nigthTheme = true;//меняем флажок на тру
                } else {
                    nigthTheme = false;
                }
            }
        });
    }
}