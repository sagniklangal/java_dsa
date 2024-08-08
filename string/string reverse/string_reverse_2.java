//https://youtu.be/m9QAjIVnmp4?si=CYD3r6CZqg8ZFjiK
class StringReverse2 {
    public static void reverseString(String input){
        StringBuilder ans = new StringBuilder(input);
        int n = ans.length();
        for(int i=0; i<n/2; i++){
            char firstChar = ans.charAt(i);
            char lastChar = ans.charAt(n-1-i);
            ans.setCharAt(i, lastChar);
            ans.setCharAt(n-1-i, firstChar);
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        reverseString("ABCDEF");
    }
}
