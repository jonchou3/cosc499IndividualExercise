import org.junit.*;

class testMain { 
    @Test
    void addThis(){
        var calc = new exercise(); 
        assertEquals(27, calc.addition(20, 7) )
    }
}
