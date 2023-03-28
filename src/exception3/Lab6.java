package exception3;

public class Lab6 {
    public static void main(String[] args) {
        int[] list = new int[5];
        try {
            System.out.println("list[5] is " + list[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            //e.printStackTrace();
            //System.out.println(e.getMessage());
            //System.out.println(e.toString());

            StackTraceElement[] s = e.getStackTrace();
            for(int i =0 ;i<s.length;i++){
                System.out.println(s[0].getClassName());
                System.out.println(s[0].getMethodName());
                System.out.println(s[0].getFileName());
                System.out.println(s[0].getLineNumber());
            }

        }
    }
}
