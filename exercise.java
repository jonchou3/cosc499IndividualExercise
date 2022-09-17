/**
 * adds two numbers together
 * 
 * @author Jonathan Chou
 * @version Sep/16/2022
 */
public class exercise{
    int multiplication(int a, int b)
    {
        int product = a * b;
        return product;    
    }

    public static void main(String args[]){
        exercise ob = new exercise();
        int x = 35, y = 25;
        int result = ob.multiplication(x,y);
        System.out.println(result);
    }
}