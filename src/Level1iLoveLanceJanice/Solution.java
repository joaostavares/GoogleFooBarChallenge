package Level1iLoveLanceJanice;

public class Solution {
    public static String solution(String s){
        int size = s.length();
        char[] chr = s.toCharArray();
        for (int counter = 0; counter < size; counter++) {
            char chr2 = chr[counter];
            if (chr2 >= 'a' && chr2 <= 'z') {
                int pos = chr2 - 'a';
                chr[counter] = (char) ('a' + 25 - pos);
            }
        }
        return String.valueOf(chr);
    }

    public static void main(String[] args) {
        String firstInput = "wrw blf hvv ozhg mrtsg’h vkrhlwv?";
        String secondInput = "Yvzs! I xzm’g yvorvev Lzmxv olhg srh qly zg gsv xlolmb!!";
        System.out.println(solution(firstInput));
        System.out.println(solution(secondInput));
    }

}
