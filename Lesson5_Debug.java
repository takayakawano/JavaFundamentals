import java.util.Scanner;

/// Lesson5. Debug
public class Lesson5_Debug
{
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number.");
        String in = sc.nextLine();
        sc.close();
        int enternumber = Integer.parseInt(in);
        System.out.println("10 / number = "+Integer.toString(10/enternumber));
        return;
    }
}