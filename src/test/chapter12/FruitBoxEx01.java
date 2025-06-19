package test.chapter12;

import test.chapter12.fruit.*;

public class FruitBoxEx01 {
    public static void main(String[] args) {

        Box<Fruit> fruitBox = new Box<>();
        Box<Apple> appleBox = new Box<>();
        Box<Banana> bananaBox = new Box<>();
        Box<Grape> grapeBox = new Box<>();
        Box<Toy> toyBox = new Box<>();

        new Fruit();

        Fruit fruitExam = new Apple();

        fruitBox.add(new Fruit());
        fruitBox.add(new Fruit());

        fruitBox.size();

        System.out.println("현재 과일 상자의 크기는 : " + fruitBox.size());

        Fruit firstFruit = fruitBox.get(0);
        Fruit secondFruit = fruitBox.get(1);

        System.out.println("FirstFruit : " + firstFruit);
        System.out.println("SecondFruit : " + secondFruit);

        appleBox.add(new Apple());
        appleBox.add(new Apple());

        toyBox.add(new Toy());

        // fruitBox == fruitBox.toString
        System.out.println("과일 상자이다. : " + fruitBox);
        System.out.println("사과 상자이다. : " + appleBox);
        System.out.println("장난감 상자이다. : " + toyBox);

    }
}
