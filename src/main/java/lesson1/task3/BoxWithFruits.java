package lesson1.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class BoxWithFruits<T extends Fruit> {


    private ArrayList<T> list;

    public BoxWithFruits() {
        this.list = new ArrayList<>();
    }


    public BoxWithFruits(T... fruits) {
        this.list = new ArrayList<>(Arrays.asList(fruits));
    }

    public float getWeight() {
        float weight = 0.0f;

        for (T o : list) {
            weight += o.getWeight();
        }

        return weight;
    }

    public void pour(BoxWithFruits<T> another) {
        another.list.addAll(list);
        list.clear();
    }

    public void add(T fruit) {
        list.add(fruit);
    }

    public void add(Collection<T> fruit) {
        list.addAll(fruit);
    }

    public boolean compare(BoxWithFruits<?> o) {

        // избегаем ошибки округления с помощью дельты
        return Math.abs(this.getWeight() - o.getWeight()) < 0.001;
    }

}
