class Solution {
    public String makeLargestSpecial(String s) {

        List<String> ans = new ArrayList<>();
        int count = 0;
        int start = 0;

        for (int i = 0; i < s.length(); i++) {
            count += (s.charAt(i) == '1') ? 1 : -1;

            if (count == 0) {
                String inner = s.substring(start + 1, i);
                String processed = "1" + makeLargestSpecial(inner) + "0";
                ans.add(processed);
                start = i + 1;
            }
        }

        Collections.sort(ans, Collections.reverseOrder());


        StringBuilder result = new StringBuilder();
        for (String str : ans) {
            result.append(str);
        }

        return result.toString();
    }
}