package chapters.chapter7;

public class Stack {
    private int stck[] = new int[10];
    private int tos;

    Stack() {
        tos = -1;
    }

    void push(int item) {
        if (tos == 9)
            System.out.println("Stack - ը լրացել է");
        else
            stck[++tos] = item;

    }

    int pop() {
        if (tos < 0) {
            System.out.println("Stack - ը չի լցվել ");
            return 0;
        } else
            return stck[tos--];
    }

}


