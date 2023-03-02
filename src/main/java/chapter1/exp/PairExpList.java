package chapter1.exp;

import chapter1.exp.Exp;
import chapter1.exp.ExpList;

public class PairExpList extends ExpList {
    public Exp head;
    public ExpList tail;

    public PairExpList(Exp head, ExpList tail) {
        this.head = head;
        this.tail = tail;
    }
}
