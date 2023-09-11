package ExceptionHandling.NestedCase;

public class Finally {
    public static void main(String[] args){
        method1();
    }

    static int method1(){
        //some tasks
        for(int i = 0; i < 5; i++){
            try{
                int x = 24;
                int y = 0;
                System.out.println(1);
                if(i == 1) break;
                int arr[] = {4, 6};
                arr[10] = 90;
                System.out.println(3);

            }catch (Exception e){
                System.out.println(4);
            }
            finally {
                System.out.println(6);
            }

        }
        return 0;
    }
}
