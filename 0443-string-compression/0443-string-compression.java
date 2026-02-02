class Solution {
    public int compress(char[] chars) {
                if(chars.length==1){
                    return 1;
                }
                
                char prev = chars[0];
                int c = 1;
                int cc = 1;
                ArrayList<Character> ans = new ArrayList<>();
                int i = 1;
                for(i = 1;i<chars.length;i++){
                    if(prev!=chars[i]){
                        ans.add(prev);
                        String s = ""+c;
                        prev = chars[i];

                        if(c==1){
                            c = 1;
                            continue;
                        }
                        for(int k = 0;k<s.length();k++) {
                            ans.add(s.charAt(k));
                        }
                        c = 1;

                    }
                    else{
                        c++;
                    }
                }
                ans.add(chars[--i]);
        String s = ""+c;
        if(c!=1) {
            for (int k = 0; k < s.length(); k++) {
                ans.add(s.charAt(k));
            }
        }
        int k = 0;
        for(k = 0;k<ans.size();k++){
            chars[k] = ans.get(k);
        }
        return k;
    }
    }
