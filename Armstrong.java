class Armstrong
{
    public static void main (String []args)
    {
        int no=371, t1,length=0,t2,rem,arm=0;
         t1=no;
         while (t1 != 0)
         {
           t1= t1/10;
           length= length + 1;
         }
         t2=no;
         while (t2 != 0)
         {
           int multi =1;
         rem = t2 % 10; 
         for (int i=1;i<=length;i++)
         {
            multi= rem *multi;
         }
           arm = arm + multi;
           t2 = t2/10;
        }
         if (no == arm)
         {
         System.out.println("no is armstrong");
         }
         else 
         {
             System.out.println("not armstrong");
         }
         
        }

}