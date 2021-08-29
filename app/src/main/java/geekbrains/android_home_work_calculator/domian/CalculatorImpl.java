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
                if (Math.abs(argTwo - 0.0) < 0.0000000001) {
                    return 0;
                }
                return argOne / argTwo;
        }
        return 0;
    }
}