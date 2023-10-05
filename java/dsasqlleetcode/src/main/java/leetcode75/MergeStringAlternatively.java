package leetcode75;

public class MergeStringAlternatively {

    public static void main(String[] args) {
        String world1 = "abc";
        String world2 ="pqr";
        System.out.println(mergeAlternately(world1,world2));

    }

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder stringBuilder = new StringBuilder();

        int maxLength = Math.max(word1.length(),word2.length());
        int j=0;
        char[] w1 = word1.toCharArray();
        char[] w2 = word2.toCharArray();


        for(int i=0;i<maxLength;i++){
            if (i < w1.length) {
                stringBuilder.append(w1[i]);
            }
            if (j < w2.length) {
                stringBuilder.append(w2[j]);
            }
            j++;
        }

        return stringBuilder.toString();
    }
}
