/**
 * Write a description of class MyClass here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class exercise{
    int addition(int a, int b)
    {
        int sum = a + b;
        return sum;    
    }

    public static void main(String args[]){
        main ob = new main();
        int x = 25, y = 35;
        int result = ob.addition(x,y);
        System.out.println(result);
    }
}