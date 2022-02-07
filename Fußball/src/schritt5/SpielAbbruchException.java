package schritt5;

public class  SpielAbbruchException extends Exception {

    private int spielMinute;
    private String message;

    public SpielAbbruchException(int spielMinute){
        this.spielMinute = spielMinute;
    }

    public int getSpielMinute(){
        return spielMinute;
    }

    public String getMessage(){
        return message;
    }
}
