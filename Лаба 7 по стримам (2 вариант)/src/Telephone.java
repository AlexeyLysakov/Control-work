public class Telephone {
    private String number;
    private TelephoneType type;

    public Telephone(String number, TelephoneType type)
    {
        this.type = type;
        this.number = number;
    }

    public TelephoneType getType()
    {
        return type;
    }
}
