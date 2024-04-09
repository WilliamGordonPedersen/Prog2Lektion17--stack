package opgave02;

import opgave01.models.LinkedStack;

import java.util.ArrayList;
import java.util.List;

public class Opgave02 {
    public static void main(String[] args) {
        /**
         * Stacker chars og ser om sætningen kode sætningen indeholder rigtige paranteser.
         */

        System.out.println(checkParantes("((()))")); //should return true


        System.out.println(checkParantes("((()"));   //should return false

    }


    public static boolean checkParantes(String s) {

        boolean checker = false;

        LinkedStack<Character> linkedStack = new LinkedStack<Character>();
        char[] chars = s.toCharArray();

            for (char c : chars) {
                if (c=='(') {
                    linkedStack.push(c);
                }
                if (c=='{') {
                    linkedStack.push(c);
                }
                if (c=='[') {
                    linkedStack.push(c);
                }
                if (c==')') {
                    if(linkedStack.peek()=='(')
                    linkedStack.pop();
                }
                if (c=='}') {
                    if(linkedStack.peek()=='{')
                        linkedStack.pop();
                }
                if (c==']') {
                    if(linkedStack.peek()=='[')
                        linkedStack.pop();
                }

                if (linkedStack.isEmpty()) {
                    checker=true;
                }

                if(!linkedStack.isEmpty()) {
                    checker=false;
                }


            }
            return checker;
    }
}
