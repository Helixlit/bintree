public class DataString implements Data
{
    private String string;
    
    public DataString(String string)
    {
        this.string = string;
    }
    
    public void print()
    {
        System.out.println(string);
    }
    
    public String toString()
    {
        return this.string;
    }
    
    public int compare(String string)
    {
        return this.string.compareTo(string);
    }

}
