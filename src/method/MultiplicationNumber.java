package method;

public class MultiplicationNumber
{
    public int multiplicateNumbersBetweenOneToTen(int a, int b)
    {
        int result = 1;
        for (int i = 1 ; i<=10; i++)
        {
            result = result * i;

        }
        return result;

    }

    public static void main(String[] args)
    {
        int result;
        int start = 1;
        int end = 10;
        MultiplicationNumber multiplicationNumber = new MultiplicationNumber();
        int total = multiplicationNumber.multiplicateNumbersBetweenOneToTen(start, end);
        System.out.println("multiplication of all natural numbers between 1 to 10 == " + total);

    }
}
