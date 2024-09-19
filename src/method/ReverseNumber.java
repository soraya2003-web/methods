package method;

public class ReverseNumber
{
    public void displayTenReverseNumbers(int a, int b)
    {
        for (int i = a; i>=b; i--)
        {
            System.out.println(i);
        }
    }

    public static void main(String[] args)
    {
        int start = 10;
        int end = 0;
        ReverseNumber reverseNumber = new ReverseNumber();
        reverseNumber.displayTenReverseNumbers(start, end);

    }
}
