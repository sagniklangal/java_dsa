//https://youtu.be/-HGtMO4MkWs?si=MxMMc2KudvvggBjW
class palindrome {
    public static boolean checkPalindrome(String input1){
        String input = input1.toLowerCase(); //For handling case sensitive ones
        int start=0;
        int end = input.length()-1;
        while(start<end){
            if(input.charAt(start) != input.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(checkPalindrome("NAMAN"));
    }
}
