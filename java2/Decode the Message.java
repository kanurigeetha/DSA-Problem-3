class Solution {
    public String decodeMessage(String key, String message) {
        int len = key.length();
        String res = "";
        ArrayList<Character> keyWithoutDuplicates = new ArrayList<>();

        for(int i = 0; i < len; i++) {
            char c = key.charAt(i);
            if(keyWithoutDuplicates.indexOf(c) == -1 && c != ' ')
                keyWithoutDuplicates.add(c);
        }
        len = message.length();
        for(int i = 0; i < len; i++) {
            char c = message.charAt(i);
            if(c == ' ') {
                res += " ";
                continue;
            }
            int index = keyWithoutDuplicates.indexOf(c);
            res +=(char) ('a' + index);
        }
        
        return res;
    }
}