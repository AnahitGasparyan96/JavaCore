package chapters.chapter5;

public class Switch {
    public static void main(String[] args) {
        int month = 4;
        String season;
        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "ձմեռ";
                break;
            case 3:
            case 4:
            case 5:
                season = "գարուն";
                break;
            case 6:
            case 7:
            case 8:
                season = "ամառ";
                break;
            case 9:
            case 10:
            case 11:
                season = "աշուն";
                break;
            default:
                season = "հորինված ամիս";
        }
        System.out.println("ապրիլ >> " + season + ".");
    }
}
