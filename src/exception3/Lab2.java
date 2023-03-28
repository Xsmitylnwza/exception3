package exception3;

public class Lab2 {
    public static void main(String[] args) {
        int[] list = new int[10];
        try {
            System.out.println("list[10] is " + list[10]);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        }catch (RuntimeException e){
            System.out.println("RuntimeException"); // ถึงจะเป็นIndexoutOfbound แต่ว่า คลาสแม่จับได้
        }catch (Exception e){
            System.out.println("Exception");
        }finally {
            System.out.println("KUY");
        }
    }
}
