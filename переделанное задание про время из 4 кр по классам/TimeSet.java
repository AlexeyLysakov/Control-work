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

    public void changeSecond(int second)
    {
        //a - минуты, b - часы, если вдруг пользователь введёт слишком много секунд
        int a = 0;
        int b = 0;
        if (second < 0)
        {
            while (second <= -60)
            {
                second += 60;
                a++;
            }

            while (a >= 60)
            {
                a -= 60;
                b++;
            }

            if (hour - b < 1)
            {
                throw ArithmeticException("кол-во часов не может быть отрицательным");
            }

            if (second > this.second)
            {
                if (minute == 0)
                {
                    if (hour == 0)
                    {
                        throw ArithmeticException;
                    }
                    else
                    {
                        hour--;
                        hour -= b;
                        minute += 59;
                        minute -= a;
                        this.second += 60;
                        this.second += second;
                    }
                }
                else
                {
                    minute--;
                    if (minute - a < 0)
                    {
                        if (hour == 0)
                        {
                            throw ArithmeticException;
                        }
                        else
                        {
                            hour--;
                            hour -= b;
                            minute += 59;
                            minute -= a;
                        }
                    }
                    this.second += 60;
                    this.second += second;
                }
            }
            else
            {
                this.second += second;
                if (minute - a < 0)
                {
                    if (hour == 0)
                    {
                        throw ArithmeticException;
                    }
                    else
                    {
                        hour--;
                        hour -= b;
                        minute += 60;
                        minute -= a;
                    }
                }
                else
                {
                    minute -= a;
                    hour -= b;
                }
            }
        }

        else if (second > 0)
        {
            while (second >= 60)
            {
                second -= 60;
                a++;
            }

            while (a >= 60)
            {
                a -= 60;
                b++;
            }

            if (b + hour > 23)
            {
                throw ArithmeticException("b > 23 || b > hour");
            }

            this.second += second;
            if (this.second >= 60)
            {
                this.second -= 60;
                minute++;
            }
            minute += a;
            if (minute >= 60)
            {
                minute -= 60;
                hour++;
            }
            hour += b;
        }
        else
        {
            System.out.println("Смысл было воодить 0, если ничего не изменится...?))");
        }
    }

    public void changeMinute(int minute)
    {
        int b = 0;
        if (minute < 0)
        {
            while (minute <= -60)
            {
                minute += 60;
                b++;
            }

            if (hour - b < 1)
            {
                throw ArithmeticException("кол-во часов не может быть отрицательным");
            }

            if (minute > this.minute)
            {
                hour--;
                hour -= b;
                this.minute += 60;
                this.minute += minute;
            }
            else
            {
                this.minute -= minute;
                hour -= b;
            }
        }

        else if (minute > 0)
        {
            while (minute >= 60)
            {
                minute -= 60;
                b++;
            }

            if (hour + b > 23)
            {
                throw ArithmeticException("кол-во часов больше 23");
            }

            this.minute += minute;
            if (this.minute >= 60)
            {
                this.minute -= 60;
                hour++;
            }
            hour += b;
        }

        else
        {
            System.out.println("Смысл было воодить 0, если ничего не изменится...?))");
        }
    }

    public void changeHour(int hour)
    {
        if (hour < 0)
        {
            if (this.hour + hour < 0)
            {
                throw  ArithmeticException;
            }

            this.hour -= hour;
        }

        else if (hour > 0)
        {
            if (this.hour + hour > 23)
            {
                throw  ArithmeticException;
            }

            this.hour += hour;
        }

        else
        {
            System.out.println("Смысл было воодить 0, если ничего не изменится...?))");
        }
    }
}
