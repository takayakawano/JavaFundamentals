public class Car
{
    // Member variables
    public String model = null;
    private String nextValidatedate = null;
    private String owner = null;

    // Constructorsdd
    public Car()
    {

    };
    public Car(String model, String nextdate, String owner)
    {
        this.model = model;
        this.nextValidatedate = nextdate;
        this.owner = owner;
    };

    // Member mothods
    private void SetModel(String model)
    {
        this.model = model;
    };
    public void SetnextValidatedate(String nextDate)
    {
        this.nextValidatedate = nextDate;
    };
    public void SetOwner(String owner)
    {
        this.owner = owner;
    };
    public String GetModel()
    {
        return this.model;
    };
    public String GetnextValidatedate()
    {
        return this.nextValidatedate;
    };
    public String GetOwner()
    {
        return this.owner;
    };
}