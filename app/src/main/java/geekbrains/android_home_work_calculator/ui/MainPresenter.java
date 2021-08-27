package geekbrains.android_home_work_calculator.ui;

import geekbrains.android_home_work_calculator.domian.Calculator;
import geekbrains.android_home_work_calculator.domian.Operation;

public class MainPresenter {

    private static final int BASE = 10;

    private final MainView view;

    private final Calculator calculator;

    private Double argOne = 0.0;
    private Double argTwo = null;

    private boolean isRealInput = false;
    private int realMultiplier = BASE;

    private Operation operation;

    private int num;

    public MainPresenter(MainView view, Calculator calculator) {
        this.view = view;
        this.calculator = calculator;
    }

    public void onKeyClearPressed() {
        argOne = 0.0;
        argTwo = null;
        view.showResult(String.valueOf(0.0));

    }


    public void onKeyDeletePressed() { // стирает только один знак
        if (!isRealInput) {
            if (argTwo == null) {
                argOne = (argOne - num) / BASE;
                view.showResult(String.valueOf(argOne));

            } else {
                argTwo = (argTwo - num) / BASE;
                view.showResult(String.valueOf(argTwo));
            }
        } else {
            if (argTwo == null) {
                argOne = argOne - num / (double) realMultiplier * BASE;
                view.showResult(String.valueOf(argOne));

            } else {
                argTwo = argTwo - num / (double) realMultiplier * BASE;
                view.showResult(String.valueOf(argTwo));
            }


        }
    }

    public void onKeyPressed(int value) {

        if (argTwo == null) {
            argOne = addDigit(argOne, value);

            view.showResult(String.valueOf(argOne));

        } else {
            argTwo = addDigit(argTwo, value);

            view.showResult(String.valueOf(argTwo));
        }
    }


    public void onKeyPlusPressed() {
        performOperation(Operation.ADD);
    }

    public void onKeyMultPressed() {
        performOperation(Operation.MULT);
    }

    public void onKeySubPressed() {
        performOperation(Operation.SUBS);
    }

    public void onKeyDivPressed() {
        performOperation(Operation.DIV);
    }

    public void onKeyResultPressed() {
        double res = calculator.performOperation(argOne, argTwo, operation);
        view.showResult(String.valueOf(res));
        argOne = res;
        argTwo = 0.0;
        isRealInput = false;

    }


    public void onKeyDotPressed() {
        if (isRealInput) {
            return;
        }
        isRealInput = true;
        realMultiplier = BASE;
    }

    private void performOperation(Operation op) {
        if (argTwo == null) {
            operation = op;
            argTwo = 0.0;

        } else {

              double res = calculator.performOperation(argOne, argTwo, operation);
              view.showResult(String.valueOf(res));

              argOne = res;
              argTwo = 0.0;
              operation = op;}


        isRealInput = false;
    }

    private double addDigit(double arg, int digit) {
        num = digit;
        if (!isRealInput) {
            return arg * BASE + digit;
        } else {
            double result = arg + digit / (double) realMultiplier;
            realMultiplier *= BASE;
            return result;

        }
    }


}




