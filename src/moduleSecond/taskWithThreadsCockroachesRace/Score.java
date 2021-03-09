package moduleSecond.taskWithThreadsCockroachesRace;

public class Score {
    private String cockroachName;
    private Long timeInMilliseconds;

    public Score(String cockroachName, Long timeInMilliseconds) {
        this.cockroachName = cockroachName;
        this.timeInMilliseconds = timeInMilliseconds;
    }

    public String getCockroachName() {
        return cockroachName;
    }

    public Long getTimeInMilliseconds() {
        return timeInMilliseconds;
    }

    public void setTimeInMilliseconds(Long timeInMilliseconds) {
        this.timeInMilliseconds = timeInMilliseconds;
    }

    @Override
    public String toString() {
        return "Score{" +
                "name='" + cockroachName + '\'' +
                ", timeInMilliseconds=" + timeInMilliseconds +
                '}';
    }
}
