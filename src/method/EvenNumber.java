package method;

public class EvenNumber
{
    public void displayEvenNumber(int a, int b)
    {
        for (int i = a; i <=b; i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }

        }
    }

    public static void main(String[] args)
    {
        int start = 10;
        int end = 30;
        EvenNumber evenNumber = new EvenNumber();
        evenNumber.displayEvenNumber(10, 30);

    }
}
