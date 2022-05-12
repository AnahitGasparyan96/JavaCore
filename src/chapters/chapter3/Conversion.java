package chapters.chapter3;

public class Conversion {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;
        System.out.println("int կոդը փոխակերպել byte կոդի");
        b = (byte) i;
        System.out.println("i և b " + i + " " + b);

        System.out.println("double կոդը փոխակերպել int կոդի");
        i = (int) d;
        System.out.println("d և i " + d + " " + i);

        System.out.println("double կոդը փոխակերպել byte կոդի ");
        b = (byte) d;
        System.out.println("d և b" + d + " " + b);
    }
}
