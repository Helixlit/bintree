class Node extends Element
{
    Data data;
    Element left;
    Element right;
    
    public Node()
    {};

    @Override
    public boolean contains(String string)
    {
        if (this.data.compare(string) == 0)
            return true;

        if (this.data.compare(string) < 0)
            return this.left.contains(string);

        return this.right.contains(string);
    }

    @Override
    public Data search(String string)
    {
        if (this.data.compare(string) == 0)
            return this.data;

        if (this.data.compare(string) < 0)
            return this.left.search(string);

        return this.right.search(string);
    }
}