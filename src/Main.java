public class Main
{
    public static void main(String[] args)
    {
        long numToExamine = 1111111111111111111L;
        if (numToExamine % 2 == 0)
        {
            System.out.println("The number " + numToExamine + " is even");
        }
        else
        {
            System.out.println("The number " + numToExamine + " is odd");
        }
    }
}