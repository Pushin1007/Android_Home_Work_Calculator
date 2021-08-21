package geekbrains.android_home_work_calculator;


import java.math.BigDecimal;
import java.util.ArrayList;


public class Calc {

    private ArrayList<Object> list;
    protected BigDecimal digit;

    public Calc() {
        this.list = new ArrayList<Object>();
    }

    //Еще пока не придумал как  обрабатывать операнды между числами
    public void addition() {

    }

    public void subtraction() {

    }

    public void multiplication() {

    }

    // здесь надо будет ловить эксепшен если второе число будет 0
    public void division() {

    }

    public void clear() {

    }

    public void delete() {

    }

    public void result() {

    }

    public ArrayList<Object> getList() {
        return list;
    }


    public BigDecimal printNum() {//обработка списка

        int size = list.size();
        digit = BigDecimal.valueOf(0.0);
        for (int i = 0; i < size; i++) {
            digit = digit.multiply(BigDecimal.valueOf(10)).add((BigDecimal) list.get(i));
            // не могу придумать логику как использовать точку как флаг и после нее нее использовать формулу
            // digit = digit.add(((BigDecimal) list.get(i)).divide(BigDecimal.valueOf(10))));
        }
        return digit;
    }

    public void setList(Object a) {//
        list.add(a);
    }
}