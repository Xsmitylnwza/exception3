package exception3;

public class Lab4 {
    public static void main(String[] args) {
        try {
            System.out.println("statement 1");
            System.out.println(1/0);
            System.out.println("statement 3");
        }catch (ArithmeticException e){

        }finally {
            System.out.println("statement 4");
        }
        System.out.println("statement 5");
    }
}
