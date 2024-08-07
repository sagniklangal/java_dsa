import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        double num = 67.86789765;
        String address = "chhinamore, Hooghly";
        // System.out.println(num);
        // System.out.printf("Number is %.2f",num);
        
        //String name = String.format("Number is %.2f address is %s",num,address);
        String name = String.format("Number is %2$f address is %1$s",address,num);
        System.out.println(name);
    }
}
