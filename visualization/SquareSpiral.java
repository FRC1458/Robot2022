//This is a test to make sure that Turtle works.

'
public class SquareSpiral
{
    public static void main(String[] args) 
    {
	Turtle bob = new Turtle();
        System.out.println("Hey");
        for(int i=0;i<360;i++)
        {		
            bob.forward(i*1.25);
            bob.left(90.25);
        }
    }
}
'