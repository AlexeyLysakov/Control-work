public class TimeSet {

    private int hour;
    private int minute;
    private int second;

    public TimeSet(int hour, int minute, int second)
    {
        if (hour < 0 || minute < 0 || second < 0 || hour > 23 || minute > 59 || second > 59)
        {
            throw new ArithmeticException("hour < 0 || minute < 0 || second < 0 || hour > 23 || minute > 59 || second > 59");
        }

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    @Override
    public String toString()
    {
        return hour + ":" + minute + ":" + second;
    }

    public void setHour(int hour)
    {
        if (hour < 0 || hour > 23)
        {
            throw new ArithmeticException("hour < 0 || hour > 23");
        }

        this.hour = hour;
    }

    public void setMinute(int minute)
    {
        if (minute < 0 || minute > 59)
        {
            throw new ArithmeticException("minute < 0 || minute > 59");
        }

        this.minute = minute;
    }

    public void setSecond(int second)
    {
        if (second < 0 || second > 59)
        {
            throw new ArithmeticException("second < 0 || second > 59");
        }

        this.second = second;
    }
}
