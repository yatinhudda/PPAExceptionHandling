package ExceptionHandling.NestedCase;

public class NestedException {

    public static void main(String[] args){
        try{
            int x = 24;
            int y = 0;
            System.out.println(1);
            int ans  = 50 / y;
            System.out.println(2);
            int arr[] = {4, 6};
            arr[10] = 90;
            System.out.println(3);

        }catch(ArithmeticException e){
            System.out.println(4);
            System.out.println(e.toString());
        }
        catch (IndexOutOfBoundsException e){
            System.out.println(5);
            System.out.println(e.toString());
        }
        catch(Exception e){
            System.out.println(e.toString());
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
