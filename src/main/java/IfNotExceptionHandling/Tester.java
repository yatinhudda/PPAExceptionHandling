package IfNotExceptionHandling;

public class Tester {
    public static void main(String[] args){
        int x = 30;
        int y = 70;
        Tester.callMe();
    }
    static void callMe(){
        try{
            int y = 70;
            int x = 0;
            int z = y/x;
            System.out.println(z);
        }
        catch(Exception e){
            e.printStackTrace();
            System.out.println(e.toString());
        }

    }
}
