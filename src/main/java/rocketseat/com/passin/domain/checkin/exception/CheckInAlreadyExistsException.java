package rocketseat.com.passin.domain.checkin.exception;

public class CheckInAlreadyExists extends RuntimeException{
    public CheckInAlreadyExists(String message){
        super(message);
    }
}
