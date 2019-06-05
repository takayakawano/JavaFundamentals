import Car;
import java.time.LocalDate;

public class Lesson4_Class
{
    public static void main(String[] arg)
    {
        Car mycar = null;
        mycar = new Car();
        System.out.println(
            String.format("Registerd Mycar! model:%s, Owner: %s NextValidationdate: %s",
                mycar.GetModel(),mycar.GetOwner(),mycar.GetnextValidatedate() )
        );
        return;
    }
}