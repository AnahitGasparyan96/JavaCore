package chapters.chapter3;

public class LifeTime {
    public static void main(String[] args) {
        int x;
        for (x = 0; x < 3; x++) {
            int y = -1;
            System.out.println("y-ը հավասար է " + y);
            y = 100;
            System.out.println("y-ը այժմ հավասար է " + y);
        }
    }
}
