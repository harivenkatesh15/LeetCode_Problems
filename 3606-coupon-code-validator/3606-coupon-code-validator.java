import java.util.*;

class Solution {

    private boolean isValidCode(String s) {
        if (s == null || s.length() == 0) return false;
        return s.matches("^[a-zA-Z0-9_]+$");
    }

    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {

       
        Map<String, Integer> priority = new HashMap<>();
        priority.put("electronics", 1);
        priority.put("grocery", 2);
        priority.put("pharmacy", 3);
        priority.put("restaurant", 4);

        List<String[]> validCoupons = new ArrayList<>();

    
        for (int i = 0; i < code.length; i++) {

            if (isValidCode(code[i]) && priority.containsKey(businessLine[i]) && isActive[i]                              
            ) {
                validCoupons.add(new String[]{businessLine[i], code[i]});
            }
        }

        Collections.sort(validCoupons, (a, b) -> {
            if (!a[0].equals(b[0])) {
                return priority.get(a[0]) - priority.get(b[0]);
            }
            return a[1].compareTo(b[1]);
        });

        List<String> result = new ArrayList<>();
        for (String[] coupon : validCoupons) {
            result.add(coupon[1]);
        }

        return result;
    }
}
