package ExceptionHandling.ChningException;
class NetworkException extends RuntimeException{
    public NetworkException(String message, Throwable cause){
        super(message, cause);
    }

    public NetworkException(){
        super();
    }
};

class MyArithmeticException extends RuntimeException{
    public MyArithmeticException(String message, Throwable cause){
        super(message, cause);
    }
    public MyArithmeticException(){
        super();
    }
};

class MyException extends RuntimeException{
    public MyException(String message, Throwable cause){
        super(message, cause);
    }
    public MyException(){
        super();
    }
};

public class ExceptionChaning {

    public static void main(String[] args){
        try{
            Integer ans = method1();
            System.out.println(ans.toString());
        }catch(Exception e){
            System.out.println(e.toString());
            throw new MyException("Comming due to Arithmetic Exception", e);
        }

    }

    static Integer method1(){
        Integer o = null;
        int y = 0;
        try{
            y = getAadharAge();
        }catch(NetworkException e){

        }

        try{
            Integer avg = 50 / y;
            o = avg;
        }catch (RuntimeException re){
            throw new MyArithmeticException("I came due to Network Exception", re);
        }

        return o;
    }

    static int getAadharAge(){
        throw new NetworkException();
    }
}
