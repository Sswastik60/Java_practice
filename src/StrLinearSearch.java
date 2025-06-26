public class StrLinearSearch {
    public static void main(String[] args) {
        String str="Swastik";
        String trgt="s";
        int c=strsearch(str,trgt);
        System.out.println(c);
    }

    static int strsearch(String word,String target){
        int count=0;
        for (int i = 0; i <word.length() ; i++) {
            if (word.charAt(i)==target.charAt(0)){
                count++;
            }
        }
        return count;
    }
}