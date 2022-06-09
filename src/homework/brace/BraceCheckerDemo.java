package homework.brace;

import org.w3c.dom.Text;

public class BraceCheckerDemo {
    public static void main(String[] args) {
        BraceChaecker text = new BraceChaecker("(()}{]");
        text.check();
    }
}
