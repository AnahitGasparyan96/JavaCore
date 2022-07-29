package homework.collection;

import java.util.*;

public class CollectionExample {

    public static void main(String[] args) throws WrongIndex {
        String[] array = {"a", "v", "f"};
//        System.out.println(arrayToList(array).getClass());
//        List<String> arrayList = new ArrayList<>();
//        System.out.println(removeById(arrayList, 80));
//        List<String> arrayList = new ArrayList<>();
//        System.out.println(listToSet(arrayList));
//        System.out.println(listToSet(arrayList).getClass());
//        List<Integer> arrayList = new ArrayList<>();
//        System.out.println(listToLinkedList(arrayList));
//        System.out.println(listToLinkedList(arrayList).getClass());
//        List<Integer> newList1 = new ArrayList<>();
//        System.out.println(reverseNumbers(newList1));
//        List<String> newList1 = new ArrayList<>();
//        printFirstFive(newList1);
        List<Integer> sizeOfList = new ArrayList<>();
        System.out.println(sizeOfList(sizeOfList));

    }

    //մեթոդը գրել այնպես, որ կանչենք, ու իրան ստրինգների մասիվ տանք, ինքը վերադարձնի նույն էլեմենտներով ArrayList
    static List<String> arrayToList(String[] values) {
        List<String> arrayList = new ArrayList<>();
        for (String value : values) {
            arrayList.add(value);

        }
        return arrayList;
    }

    //մեթոդը գրել այնպես, որ կանչենք ու տանք ինչ որ լիստ, ու ինդեքս, ինքը ջնջե էդ ինդեքսի տակ գտնվող էլեմենտը, ու վերադարձնե նույն լիստը, առանց էդ էլեմենտի։
    static List<String> removeById(List<String> list, int index) throws WrongIndex {
        for (int i = 0; i < 10; i++) {
            list.add(String.valueOf(i));


        }
        if (index < list.size()) {
            list.remove(index);

        } else {
            throw new WrongIndex("Not found index");

        }
        return list;
    }

    // մեթոդը գրել այնպես, որ ընդունի ցանկացած String-ների լիստ, վերադարձնի նույն արժեքներով HashSet
    static Set<String> listToSet(List<String> list) {
        for (int i = 0; i < 10; i++) {
            list.add(String.valueOf(i));

        }
//        list.add("a");
//        list.add("a");
//        list.add("a");
        HashSet<String> listSet = new HashSet<>(list);

        return listSet;
    }

    // մեթոդը գրել այնպես, որ ընդունի ցանկացած Integer-ների լիստ, վերադարձնի նույն արժեքներով LinkedList-ի օբյեկտ։
    static LinkedList<Integer> listToLinkedList(List<Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add(i);

        }
        LinkedList<Integer> linkedList = new LinkedList<>(list);

        return linkedList;
    }

    // մեթոդը գրել այնպես, որ ընդունի ցանկացած Integer-ների լիստ, վերադարձնի նոր լիստ, որի մեջ էլեմենտները կլինեն հակառակ հերթականությամբ։
    static List<Integer> reverseNumbers(List<Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add(i);

        }
        List<Integer> newList = new ArrayList<>();
        for (int i = list.size(); i > 0; i--) {
            newList.add(i);

        }

        return newList;
    }

    // մեթոդը գրել այնպես, որ ինչ մեծությամբ լիստ էլ տանք էս մեթոդին, ինքը տպե մենակ սկզբի 5 հատը։
    static void printFirstFive(List<String> list) {
        list.add("1");
        list.add("2");
        list.add("aa");
        list.add("8");
        list.add("vff");
        list.add("fkmkd");
        list.add("35");
        list.add("89");


        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));

        }

    }

    // մեթոդը գրել այնպես, որ ինչ list տանք վերադարձնի թե քանի էլեմենտ կա էդ լիստ-ի մեջ
    static int sizeOfList(List<Integer> list) {

        return list.size();
    }

}