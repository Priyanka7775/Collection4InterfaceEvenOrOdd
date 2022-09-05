public class Main {
    public static void main(String[] args) {
        EvenOdd evenOdd=number -> {
           if(number%2==0){
               System.out.println("Even number");
           }else {
               System.out.println("Odd number");
           }
            return true;
        };
        System.out.println(evenOdd.isEven(441));
    }
}
