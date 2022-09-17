/**
 * adds two numbers together
 * 
 * @author Jonathan Chou
 * @version Sep/16/2022
 */
public class exercise{
    int addition(int a, int b)
    {
        int sum = a + b;
        return sum;    
    }

    public static void main(String args[]){
        exercise ob = new exercise();
        int x = 25, y = 35;
        int result = ob.addition(x,y);
        System.out.println(result);
    }
}