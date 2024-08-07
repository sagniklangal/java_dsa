import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        String str = "sagnik langal";
        // System.out.println(str.toLowerCase());
        // System.out.println(str);
        
        // str = str.toLowerCase();
        // System.out.println(str);
        
        // str = str.toUpperCase();
        // System.out.println(str);
        
        // System.out.println(str.charAt(0)); //Character at a particular index
        
        //System.out.println(str.indexOf('l')); //Index of a character, always gives first ocuurence if multiple are present
        
        //System.out.println(str.lastIndexOf('l')); //Index of last occurence of a character
        
        //System.out.println(str.length()); //returns length
        
        /*char[] ch = str.toCharArray(); //Converting to a character array
        for(int i=0; i<ch.length; i++){
            System.out.print(ch[i]);
        }*/
        
        // //Compare two strings
        // System.out.println("sagnik".compareTo("sag"));
        // System.out.println("sag".compareTo("sagnik"));
        // System.out.println("sagnik".compareTo("sagnik"));
        // System.out.println("sagnik".compareTo("aagnik"));
        
        // //Removing leading and trailing spaces
        // System.out.println("      sagnik    ");
        // System.out.println("      sagnik    ".trim());
        
        // System.out.println("sagnik".startsWith("sag")); //Prefix
        // System.out.println("sagnik".endsWith("ik")); //Prefix

        // System.out.println("sagnik".substring(1,2));
        // System.out.println("sagnik".substring(3,3));
        
        // String myLocations = "hyderabad, chennai, bengalore, noida, pune";
        // String myLocationList[] = myLocations.split(",");
        
        // for(int i=0; i<myLocationList.length; i++){
        //     System.out.print(myLocationList[i] + " ");
        // }
        
        // //split()
        // String email1 = "abc@gmail.com";
        // String email2 = "def@hotmail.com";
        
        // String emailArr[] = email1.split("@");
        // String lastPart = emailArr[emailArr.length-1];
        // int dotIndex = lastPart.lastIndexOf('.');
        // System.out.println(lastPart.substring(0,dotIndex));

        // //StringBuilder
        // StringBuilder name1 = new StringBuilder("sagnik");
        // StringBuilder name2 = new StringBuilder("sagnik");
        // StringBuilder name3 = new StringBuilder("sagnik");
        // StringBuilder name4 = name1;
        
        // //Same value or not
        // System.out.println(name1.equals(name2));
        // System.out.println(name2.equals(name3));
        // System.out.println(name3.equals(name4));
        // System.out.println(name4.equals(name2));
        // System.out.println(name1.equals(name4));
        
        // name4.append("langal");
        
        // System.out.println(name1.equals(name2));
        // System.out.println(name2.equals(name3));
        // System.out.println(name3.equals(name4));
        // System.out.println(name4.equals(name2));
        // System.out.println(name1.equals(name4));
        
        // //Same place or not
        // System.out.println(name1==name2);
        // System.out.println(name2==name3);
        // System.out.println(name3==name4);
        // System.out.println(name4==name2);
        // System.out.println(name1==name4);
        
        // name4.append("langal");
        
        // System.out.println(name1==name2);
        // System.out.println(name2==name3);
        // System.out.println(name3==name4);
        // System.out.println(name4==name2);
        // System.out.println(name1==name4);
        
    }
}
