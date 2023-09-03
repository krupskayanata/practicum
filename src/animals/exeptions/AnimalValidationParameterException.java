package animals.exeptions;

public class AnimalValidationParameterException extends RuntimeException {
    public AnimalValidationParameterException(String message) {
        super(message);
    }
}
