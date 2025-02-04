class Node extends Element
{
    Data data;
    Element left;
    Element right;
    
    public Node(Data data)
    {
        this.data = data;
        this.left = new End();
        this.right = new End();
    };

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

    @Override
    public Element insert(Data data)
    {
        if (this.data.compare(data.toString()) == 0)
            return this;

        if (this.data.compare(data.toString()) < 0)
            this.left = this.left.insert(data);
        else
            this.right = this.right.insert(data);
        
        return this;
    }
}