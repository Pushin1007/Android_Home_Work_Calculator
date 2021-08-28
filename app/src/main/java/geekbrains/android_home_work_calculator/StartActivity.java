package geekbrains.android_home_work_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

import geekbrains.android_home_work_calculator.ui.MainActivity;

public class StartActivity extends AppCompatActivity {

    CheckBox checkBox = findViewById(R.id.check_theme);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);



        findViewById(R.id.check_theme).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(StartActivity.this,MainActivity.class); // создаем интент
                intent.putExtra(MainActivity.ARG_THEME, checkBox.callOnClick());  // кледем данные по ключу в интент. Примитивы

                startActivity(intent); // вызываем метод контекст

            }
        });
    }


}