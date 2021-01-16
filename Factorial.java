public class Factorial {
 
    public static void main (String[]args)
    {
                                                            //5*4*3*2*1=120 
                                                            //1*1=1
                                                            //1*2=2
                                                            //2*3=6
                                                            //6*4=24
                                                            //24*5=12
           int i,k=1;
           for (i=1;i<=5;i++)
           {
                  k=i*k;
           }         
           
           System.out.println(k);



    }

}
