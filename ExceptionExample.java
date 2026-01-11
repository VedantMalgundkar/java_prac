class VedantExeption extends RuntimeException {
    public VedantExeption(String message) {
        super(message);
    }
}
class Calc {
    public int divide(int one, int two) throws ArithmeticException {
        return one / two;
    }
}
public class ExceptionExample {
    public static void main(String[] args) {
        try {
            Calc obj = new Calc();

            int num1 = 11;
            int num2 = 0;

            if (num1 == 11) {
                throw new VedantExeption("i hate 11 number");
            }
            
            int res = obj.divide(num1, num2);
    
            System.out.println(res);
        }
        catch (VedantExeption e) {
            System.out.println("error by vedant >> "+ e);
        }
        catch(ArithmeticException e){
            System.out.println("cant divide by zero "+ e);
        }
        catch (Exception e) {
            System.out.println("some thing went wrong");
        }

    }   
}
