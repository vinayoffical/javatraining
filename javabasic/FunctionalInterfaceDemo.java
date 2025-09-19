package javabasic;

@FunctionalInterface
public interface FunctionalInterfaceDemo {
    void instruction();
}
//class FunctionalInterfaceDemoImpl implements FunctionalInterfaceDemo{
//
//    @Override
//    public void instruction() {
//        System.out.println("Inside FunctionalInterfaceDemoImpl");
//    }
//}
class FunctionalInterfaceDemoMain{
    public static void main(String[] args){
        // Traditional way
//        FunctionalInterfaceDemo firstWay= new FunctionalInterfaceDemoImpl();
//        firstWay.instruction();
//
//        // Anonymous inner class
//        FunctionalInterfaceDemo secondWay = new FunctionalInterfaceDemo() {
//            @Override
//            public void instruction() {
//                System.out.println("Inside Anonymous class");
//            }
//        };
//        secondWay.instruction();

        // Java 8 lambda expression

        FunctionalInterfaceDemo lambdaExpression=()->  System.out.println("Inside Lambda class");
        lambdaExpression.instruction();


    }
}