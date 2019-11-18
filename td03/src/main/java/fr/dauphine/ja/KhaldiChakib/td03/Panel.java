package fr.dauphine.ja.KhaldiChakib.td03;
import java.util.Iterator;

public class Panel implements Iterable<Integer>{

    private int inf;
    private int sup;

    public Panel(int inf, int sup) {
        this.inf = inf;
        this.sup = sup;
    }

    public int getInf() {
        return inf;
    }

    public void setInf(int inf) {
        this.inf = inf;
    }

    public int getSup() {
        return sup;
    }

    public void setSup(int sup) {
        this.sup = sup;
    }

    public static Iterator<Integer> panel1(int x, int y){
        final Panel panel = new Panel(x,y);
        //question1
       // return new Panel.PanelIterator(x,y);

        //question2
        return new Iterator<Integer>() {

            public boolean hasNext() {
                return panel.getInf() <= panel.getSup();
            }

            public Integer next() {
                panel.setInf(panel.getInf()+1);
                return panel.getInf() -1;
            }

            public void remove() {

            }
        };
    }


    public static Panel panel2(int x, int y){
        Panel panel = new Panel(x,y);
        return panel;
    }


        public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            public boolean hasNext() {
                return inf <= sup;
            }

            public Integer next() {
                inf ++;
                return inf-1;
            }

            public void remove() {

            }
        };
    }

    static class PanelIterator implements Iterator<Integer>{
        int inf;
        int sup;

        public PanelIterator(int inf, int sup) {
            this.inf = inf;
            this.sup = sup;
        }

        public boolean hasNext() {
            return inf <= sup;
        }

        public Integer next() {
            inf ++;
            return inf-1;
        }

        public void remove() {

        }
    }

}