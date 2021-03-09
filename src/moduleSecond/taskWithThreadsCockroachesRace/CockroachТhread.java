package moduleSecond.taskWithThreadsCockroachesRace;

import java.util.List;

public class CockroachТhread implements Runnable{
    private int numberOfSteps;
    private List<Score> result;


    public CockroachТhread(int numberOfSteps, List<Score> result) {
        this.numberOfSteps = numberOfSteps;
        this.result=result;
    }

    public int getNumberOfSteps() {
        return numberOfSteps;
    }

    public List<Score> getResult() {
        return result;
    }

    @Override
    public void run() {
        while (numberOfSteps > 0) {
            numberOfSteps--;
        }
    }
}
