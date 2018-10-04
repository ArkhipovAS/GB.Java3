package arkhipov.java3hw1;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit>{
    private List <T> data = new ArrayList <T> ();

    public Box() {    }


    public void addFruit (T fruit) {
        data.add(fruit);
    }

    public float getWeight() {
        float weight = 0;
        for (T i : data) {
            weight += i.getWeight();
        }
        return weight;
    }

    public boolean compareBox(Box<?> b){
        return (this.getWeight() == b.getWeight());
    }

    public void removeFruit (Box<T> o){
        o.data.addAll(this.data);
        this.data.clear();

    }
}
