package geekbrains.android_home_work_calculator.ui;

import geekbrains.android_home_work_calculator.domian.Calculator;
import geekbrains.android_home_work_calculator.domian.Digit;
import geekbrains.android_home_work_calculator.domian.Operation;

public class MainPresenter {

    private MainView view;

    private Calculator calculator;
    private Digit argOne = new Digit();
    private Digit argTwo;

    private Operation operation;

    public MainPresenter(MainView view, Calculator calculator) {
        this.view = view;
        this.calculator = calculator;
    }

    public void onKeyOnePresed() {
        argOne.addDigit(1);
        view.showResult(String.valueOf(argOne.toDouble()));
    }

    public void onKeyTwoPresed() {
        argOne.addDigit(2);
        view.showResult(String.valueOf(argOne.toDouble()));
    }

    public void onKeyPlusPressed() {
        view.showResult("ggghhh");

        operation = Operation.ADD;
        if (argOne != null && argTwo !=null){
            double res = calculator.performoperation(argOne,argTwo,operation);
            view.showResult("ggghhh");
        }

    }
}
