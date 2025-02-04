class End extends Element
{
    Data data;

    @Override
    public boolean contains(String string) 
    {
        return false;
    }

    @Override
    public Data search(String string) 
    {
        return null;
    }
    
    @Override
    public Element insert(Data data)
    {
        return new Node(data);
    }
    
}
