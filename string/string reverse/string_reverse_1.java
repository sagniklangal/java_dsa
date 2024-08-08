//https://youtu.be/m9QAjIVnmp4?si=CYD3r6CZqg8ZFjiK
class StringReverse {
    public static void reverseString(String input){
        String ans = "";
        for(int i=0; i<input.length(); i++){
            ans = input.charAt(i) + ans;
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        reverseString("ABCDEF");
    }
}
