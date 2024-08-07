import java.util.*;
public class QuestionOnString {
    public static void main(String[] args) {
        printAllSubstring("abc");
    }
    public static void printAllSubstring(String input){
        int n = input.length();
        for(int startIndex=0; startIndex<n; startIndex++){
            for(int endIndex=startIndex+1; endIndex<=n; endIndex++){
                System.out.println(input.substring(startIndex, endIndex));
            }
        }
    }
}

/*To use the `printAllSubstring` function without making it static, you need to create an instance of the `QuestionOnString` class. Here's how you can modify your code to achieve that:

```java
import java.util.*;

public class QuestionOnString {
    public static void main(String[] args) {
        QuestionOnString question = new QuestionOnString();
        question.printAllSubstring("abc");
    }

    public void printAllSubstring(String input){
        int n = input.length();
        for(int startIndex = 0; startIndex < n; startIndex++){
            for(int endIndex = startIndex + 1; endIndex <= n; endIndex++){
                System.out.println(input.substring(startIndex, endIndex));
            }
        }
    }
}
```

### Explanation:
1. **Create an instance of the class**: In the `main` method, an instance of `QuestionOnString` is created using `QuestionOnString question = new QuestionOnString();`.
2. **Call the method on the instance**: The `printAllSubstring` method is then called on this instance with `question.printAllSubstring("abc");`.

By making `printAllSubstring` a non-static method, you need to call it on an instance of the class rather than directly through the class name.*/
