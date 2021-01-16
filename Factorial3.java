public class Factorial3 {
    public static void main (String []args)
    {
         System.out.println(factorial(5));   //return hai niche toh uppar khi na khi jyega return kaaraya jaha ye call hora

    }

    public static int factorial (int n)  // ye apna method isme value pass kri
    {
        if(n ==1)
        {

         return 1;          // 1 isliye kyu ki base case 1 hai 5 se 1 tak multiplication
        }
        else {
             return n* factorial(n-1);  //yaha pe fucntion call hogya wapas
        } 
    }
    
}
