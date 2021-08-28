package geekbrains.android_home_work_calculator.ui;
/*
1. Создайте активити с настройками, где включите выбор темы приложения.

2. Доделайте приложение «Калькулятор». Это последний урок с созданием приложения «Калькулятор».
 Сделано, но так себе.  Большая чать конечно скопирована у Вас, но зато это позволило детально разобраться. Спасибо

3. * Сделайте интент-фильтр для запуска калькулятора извне, а также напишите тестовое приложение, запускающее приложение-калькулятор
Сделано. Приложение launcher_calculator
 */

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import geekbrains.android_home_work_calculator.R;
import geekbrains.android_home_work_calculator.domian.CalculatorImpl;


public class MainActivity extends AppCompatActivity implements MainView {

    private MainPresenter presenter;
    public static final String ARG_THEME = "ARG_THEME";
    private TextView numView;

    private Button key0;
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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_calc);

        numView = findViewById(R.id.num_view); // инициализируем переменную отображения ввода/вывода и присваиваем соответствующую вьюху
        presenter = new MainPresenter(this, new CalculatorImpl());

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
                presenter.onKeyPressed(0);
            }
        });
        key1.setOnClickListener(v -> presenter.onKeyPressed(1));
        key2.setOnClickListener(v -> presenter.onKeyPressed(2));
        key3.setOnClickListener(v -> presenter.onKeyPressed(3));
        key4.setOnClickListener(v -> presenter.onKeyPressed(4));
        key5.setOnClickListener(v -> presenter.onKeyPressed(5));
        key6.setOnClickListener(v -> presenter.onKeyPressed(6));
        key7.setOnClickListener(v -> presenter.onKeyPressed(7));
        key8.setOnClickListener(v -> presenter.onKeyPressed(8));
        key9.setOnClickListener(v -> presenter.onKeyPressed(9));

        keyDot.setOnClickListener(v -> presenter.onKeyDotPressed());

        keyAdd.setOnClickListener(v -> presenter.onKeyPlusPressed());
        keySub.setOnClickListener(v -> presenter.onKeySubPressed());
        keyMult.setOnClickListener(v -> presenter.onKeyMultPressed());
        keyDiv.setOnClickListener(v -> presenter.onKeyDivPressed());

        keyClear.setOnClickListener(v -> presenter.onKeyClearPressed());
        keyDelete.setOnClickListener(v -> presenter.onKeyDeletePressed());
        keyResult.setOnClickListener(v -> presenter.onKeyResultPressed());

    }

    @Override
    public void showResult(String result) {
        numView.setText(result);
    }
}