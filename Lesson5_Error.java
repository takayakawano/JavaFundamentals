import java.util.Scanner;

public class Lesson5_Error
{
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("How old are you?");
        String in = sc.nextLine();
        sc.close();
        int add10years = Integer.parseInt(in)+10;
        System.out.println("Your next 10year: "+Integer.toString(add10years));
        return;
    }
}