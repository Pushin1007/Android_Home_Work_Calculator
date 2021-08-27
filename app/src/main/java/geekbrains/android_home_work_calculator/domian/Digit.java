package geekbrains.android_home_work_calculator.domian;


import java.util.ArrayList;

public class Digit {
    private ArrayList<Integer> mod = new ArrayList<>();
    private ArrayList<Integer> div = new ArrayList<>();

    private boolean isReal = false;

    public void removeDigit(){
        if (mod.isEmpty()){

        }
    }

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
for (int i: mod){
    result = result*10 +i;
}
        return result;
    }

}
