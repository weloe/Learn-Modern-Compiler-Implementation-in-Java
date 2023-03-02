package chapter1.hw;

import chapter1.exp.*;
import chapter1.stm.*;

/**
 * 习题
 */
public class Example {
    public static void main(String[] args) {
        Stm prog = new CompoundStm(new AssignStm("a",
                                        new OpExp(new NumExp(5),
                                                OpExp.Plus, new NumExp(3))),
                new CompoundStm(new AssignStm("b",
                        new EseqExp(new PrintStm(new PairExpList(new IdExp("a"),
                                new LastExpList(new OpExp(new IdExp("a"),
                                        OpExp.Minus, new NumExp(1))))),
                                new OpExp(new NumExp(10), OpExp.Times,
                                        new IdExp("a")))),
                        new PrintStm(new LastExpList(new IdExp("b")))));


    }

    /**
     * 计算print语句中参数的最大值
     *
     * @param s
     * @return
     */
    int maxargs(Stm s) {

        return 0;
    }

    /**
     * 解释该语言编写的程序
     *
     * @param s
     */
    void interp(Stm s) {

    }

}
