package chapter1.stm;

import chapter1.exp.Exp;

/**
 * AssignStm 包含一个标识符和表达式
 */
public class AssignStm extends Stm{
    public String id;
    public Exp exp;

    public AssignStm(String id, Exp exp) {
        this.id = id;
        this.exp = exp;
    }
}
