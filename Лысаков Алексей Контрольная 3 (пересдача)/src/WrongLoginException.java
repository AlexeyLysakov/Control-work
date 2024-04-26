public class WrongLoginException extends Exception {
    private String s;

    public WrongLoginException(String s)
    {
        super(s);
    }
}
