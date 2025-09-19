package javabasic;

public class ExceptionDemo {
    public static void main(String...a){
        try{
           // int number = Integer.parseInt(a[0]);
            int dividend=10;
            int divisor =0;
            int result = dividend/divisor;
        }catch (ArrayIndexOutOfBoundsException|ArithmeticException arrayIndexOutOfBoundsException){
            System.out.println("Please pass argument");
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
