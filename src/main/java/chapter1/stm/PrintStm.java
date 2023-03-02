package chapter1.stm;

import chapter1.exp.ExpList;

public class PrintStm extends Stm{
    public ExpList exps;

    public PrintStm(ExpList exps) {
        this.exps = exps;
    }
}
