package moduleSecond.lesson05112020ExeptionTask.exeptions;

public class InvalidIbanLengthException extends Exception{
    public InvalidIbanLengthException(String message){
        super(message);
    }
}
