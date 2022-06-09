package homework.brace;

import chapters.chapter6.Stack;

public class BraceChaecker {
    String text;

    Stack stack = new Stack();

    BraceChaecker(String text) {
        this.text = text;
    }

    void check() {
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);

            }
            char check;
            switch (c) {
                case ')':
                    check = (char) stack.pop();
                    if (check == '{' || check == '[') {
                        System.out.println("opened " + check + "but closed" + c + "at " + i);
                    }
                    break;

                case '}':
                    check = (char) stack.pop();
                    if (check == '(' || check == '[') {
                        System.out.println("opened " + check + "but closed" + c + "at " + i);

                    }
                    break;

                case ']':
                    check = (char) stack.pop();
                    if (check == '{' || check == '(') {
                        System.out.println("opened " + check + "but closed" + c + "at " + i);

                    }
            }


        }
        char last;
        while ((last = (char) stack.pop()) != 0) {
            System.out.println("opened" + last + " not closed ");
        }

    }
}









