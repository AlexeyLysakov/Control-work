public class WrongPasswordException extends Exception {
    private String s;

    public WrongPasswordException(String s)
    {
        super(s);
    }

}
