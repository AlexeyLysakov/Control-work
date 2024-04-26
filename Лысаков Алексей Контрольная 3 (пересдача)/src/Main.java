import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {

        Scanner in = new Scanner(System.in);

        //Задание 1
/*
        int N = in.nextInt();

        ArrayList<Integer> list_array = new ArrayList<>();
        LinkedList<Integer> list_linked = new LinkedList<>();

        //Array list
        long startTime = System.nanoTime();

        for (int i = 1; i <= N; i++)
        {
            list_array.add(i);
        }

        int k = 1;

        while (list_array.size() != 1)
        {
            if (k >= list_array.size() - 1)
            {
                k = 0;
            }
            list_array.remove(k);
            k++;
        }

        long endTime = System.nanoTime();

        long elapsedTime = endTime - startTime;

        System.out.println("Arraylist time: " + elapsedTime);

        //Linked list
        startTime = System.nanoTime();

        for (int i = 1; i <= N; i++)
        {
            list_linked.add(i);
        }

        int l = 1;

        while (list_linked.size() != 1)
        {
            if (l >= list_linked.size() - 1)
            {
                l = 0;
            }
            list_linked.remove(l);
            l++;
        }

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;

        System.out.println("Linkedlist time: " + elapsedTime);

 */
/*
        //Задание 2

        int X = in.nextInt();

        String s = "50 11 236 44 231 8744 14 64 2 789 42 74 5 6 78 14 0 1 354 4 5";

        LinkedList<Integer> list = new LinkedList<>();

        for (String a : s.split(" "))
        {
            list.add(Integer.parseInt(a));
        }

        list.add(X);

        System.out.println(list.toString());

        Collections.sort(list);

        System.out.println(list.toString());
 */
/*
        //Исключения

        String A = in.next();
        String B = in.next();
        String C = in.next();

        Matcher a = Pattern.compile("[\\w]{1,20}").matcher(A);
        Matcher b = Pattern.compile("[\\w]{1,20}").matcher(B);

        System.out.println(account(A, B, C));

 */
    }
/*
    public static boolean account(String login, String password, String confirmPassword) throws WrongPasswordException, WrongLoginException
    {
        Matcher matcher_login = Pattern.compile("[\\w]{1,20}").matcher(login);
        Matcher matcher_password = Pattern.compile("[\\w]{1,20}").matcher(password);
        if (matcher_login.matches())
        {
            if (matcher_password.matches() && password.equals(confirmPassword))
            {
                return true;
            }
            else
            {
                throw new WrongPasswordException("WrongPasswordException");
            }
        }
        else
        {
            throw new WrongLoginException("WrongLoginException");
        }
    }
    */
}
