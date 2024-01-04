class Solution {
    public String intToRoman(int num) {
        HashMap<Integer, String> numeralMap = new HashMap<>();
        String answer = "";
        numeralMap.put(1, "I");
        numeralMap.put(4, "IV");
        numeralMap.put(5, "V");
        numeralMap.put(9, "IX");
        numeralMap.put(10, "X");
        numeralMap.put(40, "XL");
        numeralMap.put(50, "L");
        numeralMap.put(90, "XC");
        numeralMap.put(100, "C");
        numeralMap.put(400, "CD");
        numeralMap.put(500, "D");
        numeralMap.put(900, "CM");
        numeralMap.put(1000, "M");

        TreeMap<Integer, String> reverseNumeralMap = new TreeMap<>(Comparator.reverseOrder());
        reverseNumeralMap.putAll(numeralMap);

        for(Map.Entry<Integer, String> entry : reverseNumeralMap.entrySet()){
            if(num/entry.getKey()!=0){
                String some = entry.getValue().repeat(num/entry.getKey());
                answer += some;
                num%=entry.getKey();
            }
        }
        return answer; 
    }
}