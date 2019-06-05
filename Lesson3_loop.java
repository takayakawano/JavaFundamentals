import java.util.ArrayList;

public class Lesson3_loop
{
    public static void main(String[] arg)
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add("aaaa");
        list.add("bbbb");
        list.add("cccc");
        
        // Loop1.for
        System.out.println("Loop1.for:");
        for(int i =0; i<list.size();i++)
            System.out.println(list.get(i));
        
        // Loop2.foreach
        int[] list2= {1,2,3};
        
        System.out.println("Loop2.foreach:");
        list.forEach(item -> System.out.println(item));

        // Loop3. while / do-while
        System.out.println("Loop3. do-while:");
        int current = 0;
        do{
            System.out.println(list.get(current));
            current++;
        }while(current < list.size() );

        System.out.println("Loop3. while:");
        current = 0;
        while(current < list.size() ){
            System.out.println(list.get(current));
            current++;
        };
        return;
    } 
}