package method;

public class FactorialNumber
{
    public int factorialOfGivenNumber (int n)
    {
        int total = n;
        while (n>1)
        {
            total = total * (n - 1);
            n--;
        }
            return total;
    }

    public static void main(String[] args)
    {
        int s = 5;
        FactorialNumber factorialNumber = new FactorialNumber();
        int result = factorialNumber.factorialOfGivenNumber(s);
        System.out.println("factorial of a given number == " + result);

    }
}
