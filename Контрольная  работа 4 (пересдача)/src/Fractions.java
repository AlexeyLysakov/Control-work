public class Fractions {

    private int numerator;
    private int denominator;

    public Fractions(int numerator, int denominator)
    {
        if (denominator == 0 || numerator == 0)
        {
            throw new NullPointerException("denominator == 0 || numerator == 0");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    @Override
    public String toString()
    {
        return numerator + "/" + denominator;
    }

    private static int gcd (int a, int b)
    {
        while (a != 0 && b != 0)
        {
            if (a > b)
            {
                a = a % b;
            }
            else
            {
                b = b % a;
            }
        }
        return a+b;
    }

    public void sum(int numerator, int denominator)
    {
        if (this.denominator == denominator)
        {
            this.numerator += numerator;
        }

        else
        {
            this.numerator *= denominator;
            this.numerator += numerator * this.denominator;
            this.denominator *= denominator;
        }
    }

    public void difference(int numerator, int denominator)
    {

    }

    public void multiplication(int numerator, int denominator)
    {
        this.numerator *= numerator;
        this.denominator *= denominator;
    }

    public String comparison(int numerator, int denominator)
    {
        if ((numerator / this.numerator == denominator / this.denominator) || ((numerator == this.numerator) && (denominator == this.denominator)))
        {
            return "Дроби равны";
        }
        else if (this.denominator == denominator)
        {
            if (this.numerator > numerator)
            {
                return "Дробь с числителем " + this.numerator + " больше";
            }

            else
            {
                return "Дробь с числителем " + numerator + " больше";
            }
        }

        else if (this.numerator == numerator)
        {
            if (this.denominator > denominator)
            {
                return "Дробь со знаменателем " + denominator + " больше";
            }

            else
            {
                return "Дробь со знаменателем " + this.denominator + " больше";
            }
        }

        else
        {
            if (this.numerator * denominator > numerator * this.denominator)
            {
                return "Дробь с числителем " + this.numerator + " больше";
            }

            else
            {
                return "Дробь с числителем " + numerator + " больше";
            }
        }
    }

    public void reduction()
    {
        while (gcd(numerator, denominator) != 1)
        {
            numerator /= gcd(numerator, denominator);
            denominator /= gcd(numerator, denominator);
        }
    }
}
