package method;

public class DivisibleNumberByNine
{
    public void printDivisibleNumberByNineAndSum(int a , int b)
    {
        int sum = 0;
        for (int i = a; i <=b; i++)
        {
            if( i%9 == 0)
            {
                sum = sum + i;
                System.out.println("the number is = " + i);

            }
        }

        System.out.println("the sum is = " + sum);
    }

    public static void main(String[] args)
    {
        int start= 100;
        int end = 200;
        DivisibleNumberByNine divisibleNumberByNine= new DivisibleNumberByNine();
        divisibleNumberByNine.printDivisibleNumberByNineAndSum(start, end);


    }
}
