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

    private Button key0; // обьявляем переменные кнопок
    private Button key1;
    private Button key2;
    private Button key3;
    private Button key4;
    private Button key5;
    private Button key6;
    private Button key7;
    private Button key8;
    private Button key9;
    private Button keyAdd;
    private Button keySub;
    private Button keyMult;
    private Button keyDiv;
    private Button keyClear;
    private Button keyDot;
    private Button keyDelete;
    private Button keyResult;

        private Calculator calc = new Calculator(); // создаем обьект калькулятора

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_calc);

        numView = findViewById(R.id.num_view); // инициализируем переменную отображения ввода/вывода и присваиваем соответствующую вьюху


        key0 = findViewById(R.id.key_0); // инициализация кнопок
        key1 = findViewById(R.id.key_1);
        key2 = findViewById(R.id.key_2);
        key3 = findViewById(R.id.key_3);
        key4 = findViewById(R.id.key_4);
        key5 = findViewById(R.id.key_5);
        key6 = findViewById(R.id.key_6);
        key7 = findViewById(R.id.key_7);
        key8 = findViewById(R.id.key_8);
        key9 = findViewById(R.id.key_9);
        keyDot = findViewById(R.id.key_dot);

        keyAdd = findViewById(R.id.key_add);
        keySub = findViewById(R.id.key_sub);
        keyMult = findViewById(R.id.key_mult);
        keyDiv = findViewById(R.id.key_div);

        keyClear = findViewById(R.id.key_clear);
        keyDelete = findViewById(R.id.key_delete);
        keyResult = findViewById(R.id.key_result);


        key0.setOnClickListener(new View.OnClickListener() { //обработка нажатий кнопок
            @Override
            public void onClick(View v) {
                calc.setList(0);
                updateNumWiev();
            }
        });

        key1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.setList(1);
                updateNumWiev();
            }
        });
        key2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.setList(2);
                updateNumWiev();
            }
        });

        key3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.setList(3);
                updateNumWiev();
            }
        });
        key4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.setList(4);
                updateNumWiev();
            }
        });
        key5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.setList(5);
                updateNumWiev();
            }
        });
        key6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.setList(6);
                updateNumWiev();
            }
        });
        key7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.setList(7);
                updateNumWiev();
            }
        });
        key8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.setList(8);
                updateNumWiev();
            }
        });
        key9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.setList(9);
                updateNumWiev();
            }
        });


        keyDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.setList(".");
                updateNumWiev();
            }
        });


        // Кнопки с операндами. Еще пока не придумал как их обрабатывать между числами
        keyAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.addition();
                updateNumWiev();
            }
        });


        keySub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.subtraction();
                updateNumWiev();
            }
        });

// здесь надо будет ловить эксепшен если второе число будет 0
        keyDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.division();
                updateNumWiev();
            }
        });


        keyMult.setOnClickListener(new View.OnClickListener() {
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