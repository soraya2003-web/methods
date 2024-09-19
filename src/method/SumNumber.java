package method;

public class SumNumber
{
    public int findSumNumberBetweenOneToTen(int a, int b)
    {
        int total = 0;
        for ( int i = a; i <=b; i++)
        {
            total = total + i;
        }

        return total;
    }

    public static void main(String[] args)
    {
        int total;
        int start = 1;
        int end = 10;
        SumNumber sumNumber = new SumNumber();
        int result = sumNumber.findSumNumberBetweenOneToTen(start, end);
        System.out.println("the sum of all natural numbers between 1 to 10 == " + result);
    }
}
