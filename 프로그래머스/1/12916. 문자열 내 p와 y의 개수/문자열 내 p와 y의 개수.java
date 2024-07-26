class Solution {
    boolean solution(String s) {
        boolean answer = true;
        char charP = 'p';
        char charY = 'y';
        int countP = 0;
        int countY = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char currentChar = Character.toLowerCase(s.charAt(i));
            if(currentChar == charP) {
                countP++;
            }
        else if(currentChar == charY) {
            countY++;
        }
        }
        if(countP == countY) {
            answer = true;
        }
        
        else if(countP != countY) {
            answer = false;
        }
        
        else {
            answer = true;
        }

        

        return answer;
    }
}