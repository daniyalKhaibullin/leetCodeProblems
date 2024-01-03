class Solution {
    private int increment(int digit){
        return (digit==9) ? 0 : digit+1;
    }
    public int[] plusOne(int[] digits) {
        //do the first part, increment till it reaches the last digit
        boolean increment = true;
        for(int i = digits.length-1; i >=0; i--){
            if(increment) digits[i] = increment(digits[i]);
            if(digits[i]!=0){
                increment = false;
            }
        }
        //if it's 9999, then create an array with one more digit, and do the same for the entire digit of the number
        if(increment){
            int[] answer = new int[digits.length+1];
            answer[0] = 1;
            for(int i = 1; i < answer.length; i++){answer[i] = 0;}
            return answer;
        }
        return digits; 
    }
}