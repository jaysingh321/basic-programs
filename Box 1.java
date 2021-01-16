class Box
{
    private int length,breadth,height;
    public void setdimension (int l,int b,int h )
    {
      length=l;
      breadth=b;
      height=h;
    }
    public void showdimension ()
    {
        System.out.println ("l=" +length);
        System.out.println  ("b=" +breadth);
        System.out.println ("h=" +height);

    }
    
}
class Example 
{


    public static void main (String []args)
    {
       Box e11 = new Box();
       e11.setdimension (22,34,56);
       e11.showdimension();

    }
}