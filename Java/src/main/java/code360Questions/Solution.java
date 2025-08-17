package code360Questions;

public class Solution {
    public static Boolean splitString(String str) {
        int noOfVowelInFirstHalf = 0;
        int noOfVowelInSecondHalf = 0;
        // Write your code here.
        int size = str.length() / 2;
        for (int i = 0; i < size; i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                noOfVowelInFirstHalf++;
            }
        }
        for (int i = size; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                noOfVowelInSecondHalf++;
            }
        }
        if (noOfVowelInSecondHalf == noOfVowelInFirstHalf) {
            return true;
        }
        return false;
    }

    public static void main(String args[]){
        System.out.println(splitString("aa"));
    }
}