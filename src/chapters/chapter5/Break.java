package chapters.chapter5;

public class Break {
    public static void main(String[] args) {
        boolean t = true;
        first:
        {
            second:
            {
                third:
                {
                    System.out.println("Նախորդում է break օպերատորին ");
                    if (t) break second;
                    System.out.println("Այս օպերատորը չի աշխատի ");
                }
                System.out.println("Այս օպերատորը չի աշխատի ");
            }
            System.out.println("Այս օպերատորը հաջորդում է 2-րդ բլոկին ");
        }
    }
}
