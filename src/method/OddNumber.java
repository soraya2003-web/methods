package method;

public class OddNumber
{
    public void displayOddNumber(int a, int b)
    {
        for (int i = a; i<=b; i++)
        {
            if (i%2 == 1)
            {
                System.out.println(i);
            }
        }

    }

    public static void main(String[] args)
    {
        int start = 0;
        int end = 20;
        OddNumber oddNumber = new OddNumber();
        oddNumber.displayOddNumber(start, end);

    }
}
