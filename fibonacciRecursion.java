class fibonacciRecursion
{
    int a=0,b=1,c,d;
    public static void main (String []args)
    {
        fibonacciRecursion ob1 =new fibonacciRecursion();
        ob1.printingfib(10);

    }
     void printingfib(int i)
     {
        if (i>=1)
        {
         c=a+b;
         a=b;
         b=c;
         System.out.println(c);
         
         printingfib(i-1);
         
        }
    }


}