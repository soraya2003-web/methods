package method;

public class AlphabetLetter
{
    public void printAlphabetsLetter(char begin, char finish)
    {
        for ( char letter = begin; letter <= finish; letter++)
        {
            System.out.println(letter);
        }
    }

    public static void main(String[] args)
    {
        char start = 'a';
        char end = 'z';
        AlphabetLetter alphabetLetter = new AlphabetLetter();
        alphabetLetter.printAlphabetsLetter(start, end);

    }
}
