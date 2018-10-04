package arkhipov.java3hw1;

public class TestGeneric {
    public static void main(String[] args) {
        task();
    }

    private static void task() {
        Box<Apple> boxOfApples = new Box<>();
        Box<Apple> boxOfApples1 = new Box<>();
        Box<Orange> boxOfOrange = new Box<>();
        boxOfOrange.addFruit(new Orange());
        boxOfOrange.addFruit(new Orange());
        boxOfApples.addFruit(new Apple());
        boxOfApples.addFruit(new Apple());
        boxOfApples.addFruit(new Apple());
        boxOfApples1.addFruit(new Apple());
        System.out.println("Weight Apple: " + boxOfApples.getWeight());
        System.out.println("Weight Orange: " + boxOfOrange.getWeight());
        System.out.println("Compare box fruits: " + boxOfApples.compareBox(boxOfOrange));
        boxOfApples.removeFruit(boxOfApples1);
        System.out.println("Weight new box Apple: " + boxOfApples1.getWeight());
        System.out.println("Weight old box Apple: " + boxOfApples.getWeight());
    }
}

