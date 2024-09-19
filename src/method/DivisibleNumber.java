package method;

public class DivisibleNumber
{
    public void printDivisibleNumberByThreeAndFive(int x, int z)
    {
        for ( int i = x; i<= z; i++)
        {
            if(i %3 == 0 && i %5 == 0)
            {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args)
    {
        int start = 0;
        int end = 100;
        DivisibleNumber divisibleNumber = new DivisibleNumber();
        divisibleNumber.printDivisibleNumberByThreeAndFive(start , end );

    }
}
