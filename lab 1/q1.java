public class q1
{
    public static void main(String[] args) 
    {
        int x=-1, y=2;
        if(x==0 && y==0)
          System.out.println("("+ x+","+y+")"+" - Origin");
        else if(x>=0 && y<0)
          System.out.println("("+ x+","+y+")"+" - Second Quadrant");
        else if(x<=0 && y<0)
          System.out.println("("+ x+","+y+")"+" - Third Quadrant");
        else if(x<0 && y>=0)
          System.out.println("("+ x+","+y+")"+" - Fourth Quadrant");
        else
          System.out.println("("+ x+","+y+")"+" - First Quadrant");

    }
}
