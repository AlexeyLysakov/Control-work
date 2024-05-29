import java.util.List;

public class Client {

    private int id;
    private String name;
    private int age;
    private boolean gender; //true - мужчина, false - женщина
    private List<Telephone> listTelephone;

    public Client(int id, String name, int age, boolean gender, List<Telephone> listTelephone)
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.listTelephone = listTelephone;
    }

    public int getAge()
    {
        return age;
    }

    public boolean getGender()
    {
        return gender;
    }

    public boolean hasLandline()
    {
        return listTelephone.stream().anyMatch(telephone -> telephone.getType() == TelephoneType.LANDLINE);
    }

    public boolean hasMobile()
    {
        return listTelephone.stream().anyMatch(phone -> phone.getType() == TelephoneType.MOBILE);
    }
}
