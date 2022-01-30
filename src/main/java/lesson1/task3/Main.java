package lesson1.task3;

public class Main {
    public static void main(String[] args) {
       final BoxWithFruits<Apple>  box1 = new BoxWithFruits<>();
      box1.add(new Apple());
        box1.add(new Apple());
        box1.add(new Apple());
        final float appleBoxWeight = box1.getWeight();
        System.out.println("Вес коробки с яблоками равен " + appleBoxWeight );

        final  BoxWithFruits<Orange>  box2 = new BoxWithFruits<>();
        box2.add(new Orange());
        box2.add(new Orange());
        box2.add(new Orange());
        final float orangeBoxWeight = box2.getWeight();
        System.out.println("Вес коробки с апельсинами равен " + orangeBoxWeight );
        System.out.println("Коробки равны по весу?  " + box1.compare(box2) + "\n");

        System.out.println("Создаем новые коробки, c 3 апельсинами  и c  5 яблоками  пересыпаем в" +
                " них 3 апельсина и 3 яблока из старых коробок соответственно");
        final BoxWithFruits<Apple> box3 = new BoxWithFruits<>();
        box3.add(new Apple());box3.add(new Apple());
        box3.add(new Apple());box3.add(new Apple());
        box3.add(new Apple());box3.add(new Apple());
        box1.pour(box3);
        final double appleBoxWeightTwo = box3.getWeight();
         System.out.println("Вес коробки с яблоками: " + appleBoxWeightTwo);

        final BoxWithFruits<Orange> box4 = new BoxWithFruits<>();
        box4.add(new Orange());
        box4.add(new Orange());
        box4.add(new Orange());
        box2.pour(box4);
        final double orangeBoxWeightTwo = box4.getWeight();


        System.out.println("Вес коробки с апельсинами: " + orangeBoxWeightTwo);
        System.out.println("Коробки равны по весу?  " + box3.compare(box4));

    }
}
