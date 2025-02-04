public class Bintree
{
    Element root;

    public Bintree()
    {
        this.root = new End();
    }

    
    public boolean contains(String string)
    {
       return root.contains(string); 
    }

    public Data search(String string)
    {
        return root.search(string);
    }

    public void insert(Data data)
    {
        this.root = root.insert(data);
    }

}