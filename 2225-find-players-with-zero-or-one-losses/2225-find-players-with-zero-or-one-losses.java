class Solution {
    public List<List<Integer>> findWinners(int[][] m) {
        HashMap<Integer,Integer> wmap = new HashMap<>();
        HashMap<Integer,Integer> lmap = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0;i<m.length;i++) {
            int w = m[i][0];
            int l = m[i][1];
            wmap.put(w, wmap.getOrDefault(w, 0)+1);
            lmap.put(l, lmap.getOrDefault(l, 0)+1);
            set.add(w);
            set.add(l);

        }
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        ArrayList<Integer> temp1 = new ArrayList<>();
        System.out.println(set);
        for(Integer p:set) {
           
            if(!lmap.containsKey(p) && wmap.containsKey(p)) {
                temp.add(p);
            }
            else if (lmap.getOrDefault(p,0) == 1) {
                temp1.add(p);

            }
        }
        
        Collections.sort(temp);
        Collections.sort(temp1);
        ans.add(temp);
        ans.add(temp1);
        return ans;
    }
}