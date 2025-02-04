public class App
{
    public static void main(String[] args) throws Exception
    {
        Bintree bintree = new Bintree();
        bintree.insert(new Student("Max", 10));
        bintree.insert(new Student("Hello", 20));
        bintree.insert(new Student("World", 30));
        bintree.insert(new Student("!", 40));

        System.out.println(bintree.search("!"));
    }
}
