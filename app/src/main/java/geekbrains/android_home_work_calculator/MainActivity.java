package geekbrains.android_home_work_calculator;
/*
1. Напишите обработку каждой кнопки из макета калькулятора.
2. Создайте объект с данными и операциями калькулятора. Продумайте, каким образом будете хранить введённые пользователем данные.

 */

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private TextView numView; //объявляем переменную отображения ввода/вывода
    private Button key_0, key_1, key_2, key_3, key_4, key_5, key_6, key_7, key_8, key_9, key_dot, key_add,
            key_sub, key_mult, key_div, key_clear, key_delete, key_result; // обьявляем переменные кнопок
    Calc calc = new Calc();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_calc);

        numView = findViewById(R.id.num_view); // инициализируем переменную отображения ввода/вывода и присваиваем соответствующую вьюху


        key_0 = findViewById(R.id.key_0); // инициализация кнопок
        key_1 = findViewById(R.id.key_1);
        key_2 = findViewById(R.id.key_2);
        key_3 = findViewById(R.id.key_3);
        key_4 = findViewById(R.id.key_4);
        key_5 = findViewById(R.id.key_5);
        key_6 = findViewById(R.id.key_6);
        key_7 = findViewById(R.id.key_7);
        key_8 = findViewById(R.id.key_8);
        key_9 = findViewById(R.id.key_9);
        key_dot = findViewById(R.id.key_dot);

        key_add = findViewById(R.id.key_add);
        key_sub = findViewById(R.id.key_sub);
        key_mult = findViewById(R.id.key_mult);
        key_div = findViewById(R.id.key_div);

        key_clear = findViewById(R.id.key_clear);
        key_delete = findViewById(R.id.key_delete);
        key_result = findViewById(R.id.key_result);


        key_0.setOnClickListener(new View.OnClickListener() { //обработка нажатий кнопок
            @Override
            public void onClick(View v) {
                calc.setList(0);
                updateNumWiev();
            }
        });

        key_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.setList(1);
                updateNumWiev();
            }
        });
        key_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.setList(2);
                updateNumWiev();
            }
        });

        key_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.setList(3);
                updateNumWiev();
            }
        });
        key_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.setList(4);
                updateNumWiev();
            }
        });
        key_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.setList(5);
                updateNumWiev();
            }
        });
        key_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.setList(6);
                updateNumWiev();
            }
        });
        key_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.setList(7);
                updateNumWiev();
            }
        });
        key_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.setList(8);
                updateNumWiev();
            }
        });
        key_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.setList(9);
                updateNumWiev();
            }
        });


        key_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.setList(".");
                updateNumWiev();
            }
        });


        // Кнопки с операндами. Еще пока не придумал как их обрабатывать между числами
        key_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.addition();
                updateNumWiev();
            }
        });


        key_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.subtraction();
                updateNumWiev();
            }
        });

// здесь надо будет ловить эксепшен если второе число будет 0
        key_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.division();
                updateNumWiev();
            }
        });


        key_mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.multiplication();
                updateNumWiev();
            }
        });
    }


    private void updateNumWiev() { // Метод обновления вьюшки. не могу понять почему не работает
        numView.setText(String.valueOf(calc.printNum()));
    }


}