class ee
{
public static void main (String []args) {
    int a=5;
    int b=3;
    System.out.println(a++);  //5 (6)
    System.out.println(a++);  //  6 (7)
    System.out.println(--a + a++);  // 6 + 6    12 

    System.out.println(a - --b); // a=7 - 2  5
    System.out.println(++b); // 3  
}
}