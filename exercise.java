/**
 * adds two numbers together
 * 
 * @author Jonathan Chou
 * @version Sep/16/2022
 */
public class exercise{
    int subtraction(int a, int b)
    {
        int difference = a - b;
        return difference;    
    }

    public static void main(String args[]){
        exercise ob = new exercise();
        int x = 35, y = 25;
        int result = ob.subtraction(x,y);
        System.out.println(x + " - " + y + " = " + result);
        x = 12;
        y = 58;
        result = ob.subtraction(x,y);
        System.out.println(x + " - " + y + " = " + result);
    }
}