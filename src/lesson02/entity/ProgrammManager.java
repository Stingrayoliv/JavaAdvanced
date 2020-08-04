package lesson02.entity;

/**
 * JavaAdvanced
 * 04.08.20 19: 49
 */
public class ProgrammManager extends Programmer implements ManageAble {
    public ProgrammManager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void codeReview() {

    }

    @Override
    public void manage() {
    }



}
