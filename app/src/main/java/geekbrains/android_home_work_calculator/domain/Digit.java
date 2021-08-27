package geekbrains.android_home_work_calculator.domain;

import java.util.ArrayList;

public class Digit {
    private ArrayList<Integer> mod = new ArrayList<>();
    private ArrayList<Integer> div = new ArrayList<>();

    private boolean isReal = false;

    public void removeDigit(){
        if (mod.isEmpty()){

        }
    }

//    public void makeReal() {
//        isReal = true;
//    }
//
//    public void makeInt() {
//        isReal = false;
//    }

    public void addDigit(int value) {
        if (!isReal) {
            mod.add(value);
        } else {
            div.add(value);
        }
    }

    public boolean isReal() {
        return isReal;
    }

    public double toDouble(){
    double result = 0;

    return result;
    }

}
