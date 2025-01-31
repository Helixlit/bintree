public class Bintree extends Element
{
    Element root;

    public Bintree()
    {}

    @Override
    public boolean contains(String string)
    {
       return root.contains(string); 
    }

    @Override
    public Data search(String string)
    {
        return root.search(string);
    }

}