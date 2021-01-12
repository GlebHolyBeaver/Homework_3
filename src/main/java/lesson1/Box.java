package lesson1;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> fruitList;

    public Box () {
        this.fruitList = new ArrayList<>();
    }

    public void add(T fruit){
        fruitList.add(fruit);
    }

    public float getWeightFruit(){
        if (fruitList.size() > 0){
            return fruitList.get(0).getWeight() * fruitList.size();
        }
        return 0f;
    }

    public boolean compare(Box<?> box){
        return Math.abs(this.getWeightFruit() - box.getWeightFruit()) < 0.0001;
    }

    public void remote(Box<T> box){
        if (box == this) return;
        for ( int i = 0; i < fruitList.size(); i++){
            box.add(this.fruitList.get(i));
        }
        this.fruitList.clear();
    }
}
