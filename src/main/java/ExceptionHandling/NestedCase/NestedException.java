package ExceptionHandling.NestedCase;

public class NestedException {

    public static void main(String[] args){
        try{
            int x = 24;
            int y = 0;
            int ansInMain = NestedException.method1();
        }catch(ArithmeticException e){
            System.out.println(e.toString());
            System.out.println("Handled In Main");
        }

    }
    static int method1(){
        //some tasks
        int ansInsideMethod1 = method2();
        return 0;
    }
    static int method2(){
        //some task
        int z = 0;
        int y = 50 / z;
        return 0;
    }
}
