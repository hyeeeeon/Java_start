package operator;

public class Comp1 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        System.out.println(a == b); //f
        System.out.println(a != b); //t
        System.out.println(a > b); //f
        System.out.println(a < b); //t
        System.out.println(a >= b); //f
        System.out.println(a <= b); //t
        
        //결과를 boolean 변수에 담음
        boolean result = a == b;
        System.out.println("result = " + result);
    }
}
