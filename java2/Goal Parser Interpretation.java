class Solution {
    public String interpret(String command) {

        command = command.replace("()", "o");
        command = command.replace("(al)", "al");
        return command;

        // String temp = "";
        // String res = "";

        // for(int i=0; i<command.length(); i++){
        //     temp += command.charAt(i);
        //     if(temp.equals("()")){
        //         res += "o";
        //         temp = "";
        //     }
        //     else if(temp.equals("G")){
        //         res += "G";
        //         temp = "";
        //     }
        //     else if(temp.equals("(al)")){
        //         res += "al";
        //         temp = "";
        //     }
        // }

        // return res;
        
    }
}