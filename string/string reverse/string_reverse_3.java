//https://youtu.be/m9QAjIVnmp4?si=CGufo8tflaUYHOle
class StringReverse3 {
    public static void reverseString(String input){
        char ansArr[] = input.toCharArray();
        int n = ansArr.length;
        for(int i=0; i<n/2; i++){
            char firstChar = ansArr[i];
            char lastChar = ansArr[n-1-i];
            ansArr[i] = lastChar;
            ansArr[n-1-i] = firstChar;
        }
        for(int i=0; i<n; i++){
            System.out.print(ansArr[i]);
        }
    }
    public static void main(String[] args) {
        reverseString("ABCDEF");
    }
}
