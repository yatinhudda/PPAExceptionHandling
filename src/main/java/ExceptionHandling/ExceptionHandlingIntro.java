package ExceptionHandling;

public class ExceptionHandlingIntro {

    public static void main(String[] args) {
        int x = 30;
        int y = 70;
        ExceptionHandlingIntro.callMe();
    }

    static void callMe() {
        try {
            int y = 70;
            int x = 0;
            int z = y / x;
            System.out.println(z);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("We have catched the Exception.");
            System.out.println(e.toString());
        }

    }
}
