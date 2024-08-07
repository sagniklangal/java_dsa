import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // //String
        // System.out.println("Enter a word");
        // String word1 = sc.next();
        // System.out.println("Enter a word please");
        // String word2 = sc.next();
        
        // System.out.println("Enter a line");
        // String line1 = sc.nextLine();
        // System.out.println("Enter next line");
        // String line2 = sc.nextLine();
        
        // System.out.print("word1:"+word1+",");
        // System.out.print("word2:"+word2+",");
        // System.out.print("line1:"+line1+"*");
        // System.out.print("line2:"+line2+"*");
        
        //Integer
        System.out.println("Enter a number");
        String num1 = sc.next();
        System.out.println("Enter a number please");
        String num2 = sc.next();
        
        System.out.println("Enter a line");
        String line1 = sc.nextLine();
        System.out.println("Enter next line");
        String line2 = sc.nextLine();
        
        System.out.print("word1:"+num1+",");
        System.out.print("word2:"+num2+",");
        System.out.print("line1:"+line1+"*");
        System.out.print("line2:"+line2+"*");
    }
}
