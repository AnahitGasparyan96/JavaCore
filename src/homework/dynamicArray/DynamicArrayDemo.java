package homework.dynamicArray;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray dynArray = new DynamicArray();
        System.out.println(dynArray.isEmpty());
        System.out.println();
        dynArray.add(2);
        System.out.println(dynArray.getByIndex(dynArray.array, 0));
        System.out.println(dynArray.getByIndex(dynArray.array, 80));
        System.out.println();
        dynArray.add(7);
        dynArray.add(7);
        dynArray.add(6);
        dynArray.add(8);
        dynArray.add(9);
        dynArray.add(2);
        dynArray.add(3);
        dynArray.add(72);
        System.out.println(dynArray.getFirstIndexByValue(7));
        System.out.println();
        dynArray.print();
        System.out.println();
        dynArray.set(2, 4);
        System.out.println();
        dynArray.add(2, 5);
        System.out.println();
        dynArray.print();
        dynArray.delete(1);
        System.out.println();
        dynArray.print();
    }

}
