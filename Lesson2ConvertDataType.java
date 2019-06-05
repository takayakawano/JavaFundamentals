/// Test クラス
public class Test{
    // Main メソッド
    public static void main(String[] args) {
        try{
            Integer.parseInt("dd");
        }
        catch(Exception ex){
            System.out.println("Incorrect Value.");
        };
        return;
    }
}