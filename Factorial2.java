 class Factorial2 {
        
    int fact=1;
  
      public static void main(String []args)
      {
        int result,a=5;
        
            Factorial2 a1 = new Factorial2();
            result = a1.getfact(a);
            System.out.println(result);

      } 
    
     int getfact(int a)
     {
         if (a>= 1)
         {
             fact = fact*a;
              getfact(a-1);
            }
            return fact;

     }


}
