package javabasic;

public class HelloWorld {
    public static void  main(String...a){//var args
//        System.out.println("Hello");
//        for(String s:a ){
//            System.out.println(s);
//        }

        System.out.println( sum(1,2,3,4,5,6,7,8));

    }
    static Integer sum(Integer... args){
        int sum=0;
        for(Integer i:args){
        sum+=i;
        }
        return sum;
    }

}
