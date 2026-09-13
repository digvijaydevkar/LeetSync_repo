class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
          if (digits == null || digits.length() == 0) {
            return list;
        }
        
        Map<Character, String> mapd = new HashMap<>();
        mapd.put('2', "abc");
        mapd.put('3', "def");
        mapd.put('4', "ghi");
        mapd.put('5', "jkl");
        mapd.put('6', "mno");
        mapd.put('7', "pqrs");
        mapd.put('8', "tuv");
        mapd.put('9', "wxyz");
        backtrack(list,new StringBuilder(),0,digits,mapd);
        
        return list;
    }
    public void backtrack(List<String> list,StringBuilder comb,int ind,String digits,Map<Character,String> mapd){
        if(digits.length() == ind){
            list.add(comb.toString());
            return ;
        }

        String tmp = mapd.get(digits.charAt(ind));
        for(char ch : tmp.toCharArray()){
            comb.append(ch);
            backtrack(list,comb,ind+1,digits,mapd);
            comb.deleteCharAt(comb.length()-1);
        }

    }
}