class Solution {
    public int bestClosingTime(String customers) {
        int n = customers.length();

        // Penalty if shop is closed all day
        int closedPenalty = 0;
        for (int i = 0; i < n; i++) {
            if (customers.charAt(i) == 'Y') {
                closedPenalty++;
            }
        }

        int openPenalty = 0;
        int minPenalty = closedPenalty;
        int closingHour = 0;

        for (int i = 0; i < n; i++) {
            if (customers.charAt(i) == 'Y') {
                closedPenalty--;
            } else {
                openPenalty++;
            }

            if (closedPenalty + openPenalty < minPenalty) {
                minPenalty = closedPenalty + openPenalty;
                closingHour = i + 1;
            }
        }

        return closingHour;
    }
}