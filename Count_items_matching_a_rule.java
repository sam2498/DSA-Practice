class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        
        int n = items.size();
        int c=0;
        switch(ruleKey){
                
            case "type":
                for(int i=0;i<n;i++){
                    if(items.get(i).get(0).equals(ruleValue))
                        c++;
                }
                break;
            case "color":
                for(int i=0;i<n;i++){
                    if(items.get(i).get(1).equals(ruleValue))
                        c++;
                }
                break;
            case "name":
                for(int i=0;i<n;i++){
                    if(items.get(i).get(2).equals(ruleValue))
                        c++;
                }
                break;
        }
        return c;
    }
}