package geekbrains.android_home_work_calculator;


import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;


public class Calc {

    private ArrayList<Object> list;
    protected Integer digit;

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
        list.clear();
    }

    public void delete() {

    }

    public void result() {

    }

    public ArrayList<Object> getList() {
        return list;
    }


    public Integer printNum() {//обработка списка

        int size = list.size();
        digit = Integer.valueOf(0);
        for (int i = 0; i < size; i++) {

            if (list.get(i) instanceof Integer){digit = digit * 10 + (Integer) list.get(i);}
            
//            // не могу придумать логику как использовать точку как флаг и после нее нее использовать формулу
//            // digit = digit.add(((BigDecimal) list.get(i)).divide(BigDecimal.valueOf(10))));
        }
        return digit;
    }

    public void setList(Object a) {//

        list.add(a);
    }
}