package fr.dauphine.ja.KhaldiChakib.td03;
import java.util.Iterator;

public class App {

    public static void main(String[] args) {

        // Question 1:
       Iterator<Integer> it = Panel.panel1(1,5);
        for(; it.hasNext();){
            System.out.println(it.next());
        }

       // question 3
        for(int i : Panel.panel2(1,5)){
            System.out.println(i);
        }
    }
}
