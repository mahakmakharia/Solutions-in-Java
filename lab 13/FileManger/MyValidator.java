public class MyValidator {

    public void validateNumber(Float input) throws NegativeNumberException {
        if (input < 0)
            throw new NegativeNumberException("Negative NUmbers not allowed");
    }
}
