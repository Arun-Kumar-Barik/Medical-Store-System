public class Customers {
    private String name;
    int points;
    long number;

    public Customers(String n,int p,long num)
    {
        name = n;
        points = p;
        number=num;
    }
    public String getName()//return the name of Customer
    {
        return name;
    }
    public int getPoints()//Rs 10 purchase = 1 point(usse zyada nahi 🗿)
    {
        return points;
    }
    public long getNumber()//return the phone number of customer
    {
        return number;
    }
}
