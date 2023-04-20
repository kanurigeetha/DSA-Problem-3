class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count = 0;
        for(int i=left; i<=right; i++){
            if(check(words[i]))
                count++;
        }
        return count;
    }
    private boolean check(String word){
        char i = word.charAt(0);
        char j = word.charAt(word.length()-1);
        String str = "aeiou";
        if(str.indexOf(i) != -1 && str.indexOf(j) != -1 )
            return true;
        return false;
    }
}