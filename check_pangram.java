class Solution {
    public boolean checkIfPangram(String sentence) {
        
        int n = sentence.length();
        
        
//         int[] freq = new int[26];
        
//         for(int i=0;i<n;i++){
//             freq[(int)sentence.charAt(i)-97]++;
//         }
        
//         for(int i=0;i<26;i++){
//             if(freq[i]==0)
//                 return false;
//         }
//         return true;
        
//     }
        
//         Set<Character> charNo = new HashSet<Character>();
    
//         for(int i=0;i<n;i++){
//             charNo.add(sentence.charAt(i));
            
//             if(charNo.size()==26)
//                 return true;
//         }
//         return false;
        
        String sampleStr = "abcdefghijklmnopqrstuvwxyz";
        
        for(int i=0;i<sampleStr.length();i++){
            
            if(sentence.indexOf(sampleStr.charAt(i))<0)
                return false;
            
        }
        return true;
    } 
}