package LeetCode.IntegerToRoman;

public class Solution {
    public String intToRoman(int num) {
        String[] romanSymbols = {"M", "CM", "D", "CD", "C", "XC",
                "L", "XL", "prepOCA.X", "IX", "V", "IV", "I"};
        short[] romanValues = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        StringBuilder romanBuilder = new StringBuilder();

        for (int i = 0; i < romanValues.length; i++) {
            while (num >= romanValues[i]) {
                romanBuilder.append(romanSymbols[i]);
                num -= romanValues[i];
            }
        }
        return romanBuilder.toString();
    }
}