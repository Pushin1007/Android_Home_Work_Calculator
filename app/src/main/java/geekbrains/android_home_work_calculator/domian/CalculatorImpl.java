package geekbrains.android_home_work_calculator.domian;


public class CalculatorImpl implements Calculator {

    @Override
    public double performOperation(double argOne, double argTwo, Operation operation) {
        switch (operation) {
            case ADD:
                return argOne + argTwo;

            case MULT:
                return argOne * argTwo;

            case SUBS:
                return argOne - argTwo;
            case DIV:
                return argOne - argTwo;
        }
        return 0;
    }
}