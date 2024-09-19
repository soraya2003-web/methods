package method;

public class AverageNumber
{
    public int findAverageNumbersBetweenTwoToEight(int x, int y)
    {
        int total = 0;
        int avg;
        for (int i = x ; i<=y; i++)
        {
            total = total + i;
        }
        avg = total / 7;

        return avg;
    }

    public static void main(String[] args)
    {
        int avg;
        int start = 2;
        int end = 8;
        AverageNumber averageNumber = new AverageNumber();
        int result = averageNumber.findAverageNumbersBetweenTwoToEight(start, end);
        System.out.println( "the average of all natural numbers between 2 and 8 == " + result);
    }
}
