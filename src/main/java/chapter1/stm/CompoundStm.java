package chapter1.stm;

/**
 * CompoundStm有两个域
 */
public class CompoundStm extends Stm{
    public Stm stm1,stm2;

    public CompoundStm(Stm stm1, Stm stm2) {
        this.stm1 = stm1;
        this.stm2 = stm2;
    }


}
