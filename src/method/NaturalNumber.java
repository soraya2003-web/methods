package method;

public class NaturalNumber
{
    public void displayNaturalNumbers(int a)
    {
        for(int i = 0; i<=a; i++)
        {
            System.out.println(i);
        }
    }

    public static void main(String[] args)
    {   int x = 10;
        NaturalNumber naturalNumber = new NaturalNumber();

        // Call the method inside natural number class
        naturalNumber.displayNaturalNumbers(x);

    }

}
