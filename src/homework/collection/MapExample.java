package homework.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExample {
    private static final List<FootballTeamMember> newFootballMember = new ArrayList<>();
    private static final HashMap<Integer, String> footballHash = new HashMap<>();

    public static void main(String[] args) {

        FootballTeamMember footballTeamMember = new FootballTeamMember(8, "Carlos");
        FootballTeamMember footballTeamMember1 = new FootballTeamMember(12, "Ronaldo");
        FootballTeamMember footballTeamMember2 = new FootballTeamMember(1, "Kaka");
        newFootballMember.add(footballTeamMember);
        newFootballMember.add(footballTeamMember1);
        newFootballMember.add(footballTeamMember2);
//        System.out.println(createFootballTeam(newFootballMember));
//        System.out.println(removeFromMap(footballHash, 12));
//        System.out.println(removeFromMap(footballHash, 112));
//        printAllMemberNames(footballHash);
        printAllMembers(footballHash);
    }

    //Ունենք FootballTeamMember-ի լիստ, պետք է ստանանք HashMap որտեղ կեյ-ը կլինի խաղացողի համարը, իսկ վելյուն իրա անունը։
    static Map<Integer, String> createFootballTeam(List<FootballTeamMember> members) {
        for (FootballTeamMember member : members) {
            footballHash.put(member.getNumber(), member.getName());

        }
        return footballHash;

    }

    //Մեթոդի մեջ պետք է տրված մապ-ից ջնջենք removedNumber համարը եթե կա, ու վերադարձնենք true, եթե չկա վերադարձնենք false
    static boolean removeFromMap(Map<Integer, String> memberMap, Integer removedNumber) {
        footballHash.put(12, "hbhs");
        footballHash.put(162, "hbhs");
        footballHash.put(129, "hbhs");
        footballHash.put(126, "hbhs");
        for (Integer integer : memberMap.keySet()) {
            if (integer.equals(removedNumber)) {
                footballHash.remove(removedNumber);
                return true;
            }

        }
        return false;
    }

    //Մեթոդով տպելու ենք միայն անունները
    static void printAllMemberNames(Map<Integer, String> memberMap) {
        footballHash.put(12, "hbhs");
        footballHash.put(162, "hbhs");
        footballHash.put(129, "hbhs");
        footballHash.put(126, "hbhs");
        for (String value : memberMap.values()) {
            System.out.println(value);
        }


    }

    //Մեթոդով տպելու ենք թե համարը, թե խաղացողի անունը հետյալ ձև՝
    // 11 - Poxos Poxosyan
    // 12 - Petros Petrosyan
    static void printAllMembers(Map<Integer, String> memberMap) {
        footballHash.put(12, "hbhs");
        footballHash.put(162, "hbhs");
        footballHash.put(129, "hbhs");
        footballHash.put(126, "hbhs");
        for (Map.Entry<Integer, String> integerStringEntry : memberMap.entrySet()) {
            System.out.println(integerStringEntry.getKey() + " - " + integerStringEntry.getValue());
        }


    }


    static class FootballTeamMember {
        private int number;
        private String name;

        public FootballTeamMember(int number, String name) {
            this.number = number;
            this.name = name;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}