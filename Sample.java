import java.util.Scanner;

public class Sample
{
    public static void main(String[] arg)
    {
        // 好きなプログラミング言語の入力
        Scanner sc =  new Scanner(System.in);
        System.out.println("あなたの好きなプログラミング言語を入力してください。");
        System.out.println("1: Java");
        System.out.println("2: C 言語");
        System.out.println("3: C#");
        System.out.println("4: Phython");
        String in = sc.next();
        sc.close();

        // 文字列を数値に変換
        int number = 0;
        try{
            number = Integer.parseInt(in);
        }
        catch(Exception ex)
        {
            System.out.println("数字を入力してください。");
            return;
        };
        
        // プログラミング言語ごとに参照先を出力
        System.out.println("参考になるサイトはこちら。");

        switch(number){
            case 1:
                System.out.println("Java: " + "https://blackyblog.com/2019/05/18/java-fundamentals-overview-1/");
                break;
            case 2:
                System.out.println("C 言語: " + "https://c.com/sample");
                break;    
            case 3:
                System.out.println("C#: " + "https://csharp.com/sample");
                break;    
            case 4:
                System.out.println("Phython: " + "https://pjython.com/sample");
                break;    
            default:
                System.out.println("その他のプログラミング言語は現在準備中です。");
                break;
        }
        return;
    }
}