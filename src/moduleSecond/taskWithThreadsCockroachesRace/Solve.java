package moduleSecond.taskWithThreadsCockroachesRace;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Solve {
    public static void main(String[] args) throws Exception {
        int numberOfCockroaches = 5;
        int min = 1000;
        int max = 4000;
        int numbersOfSteps=100;

        System.out.println( "Race with random time for sleeping:\n"
                + getScoresTimeForSleepingIsSame( numberOfCockroaches, min, numbersOfSteps ) );
        System.out.println( "Race with the same time for sleeping:\n"
                + getScoresTimeForSleepingIsRandomNumber( numberOfCockroaches, min, max, numbersOfSteps ) );
    }

    public static List<Score> getScoresTimeForSleepingIsRandomNumber(int numberOfCockroaches, int min, int max,
                                                                     int numbersOfSteps) throws InterruptedException {
        List<Score> result = new ArrayList<>();

        for (int i = 1; i <= numberOfCockroaches; i++) {
            Runnable cockroachТhread = new CockroachТhread( numbersOfSteps, result );
            Thread thread = new Thread( cockroachТhread );

            Instant start = Instant.now();
            thread.start();
            thread.join();

            try {
                Thread.sleep( getRandomNumber( min, max ) );
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            Instant finish = Instant.now();
            long timeElapsed = Duration.between( start, finish ).toMillis();//in millis

            synchronized (result){
                result.add( new Score( " cockroach's number " + i, timeElapsed ) );
            }

            result.sort( (x1, x2) -> (int) (x1.getTimeInMilliseconds() - x2.getTimeInMilliseconds()) );

        }
        return result;
    }

    public static int getRandomNumber(int min, int max) {
        return (int) (Math.random() * (max - min)) + min;
    }


    public static List<Score> getScoresTimeForSleepingIsSame(int numberOfCockroaches, int timeForSleeping,
                                                  int numbersOfSteps) throws InterruptedException {
        List<Score> result = new ArrayList<>();

        for (int i = 1; i <= numberOfCockroaches; i++) {
            Runnable cockroachТhread = new CockroachТhread( numbersOfSteps, result );
            Thread thread = new Thread( cockroachТhread );

            Instant start = Instant.now();
            thread.start();
            thread.join();

            try {
                Thread.sleep( timeForSleeping );
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            Instant finish = Instant.now();
            long timeElapsed = Duration.between( start, finish ).toMillis();//in millis

            synchronized (result){
                result.add( new Score( " cockroach's number " + i, timeElapsed ) );
            }
        }

        result.sort( (x1, x2) -> (int) (x1.getTimeInMilliseconds() - x2.getTimeInMilliseconds()) );
        return result;
    }
}
