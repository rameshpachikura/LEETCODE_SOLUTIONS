class Solution {
    public long minTime(int[] skill, int[] mana) {
        int n = skill.length;
        int m = mana.length;

        long[] prefixSkill = new long[n];
        prefixSkill[0] = skill[0];
        for (int i = 1; i < n; i++) {
            prefixSkill[i] = prefixSkill[i - 1] + skill[i];
        }
        

        long currentStartTime = 0;

        for (int j = 1; j < m; j++) {
            long manaPrev = mana[j - 1];
            long manaCurr = mana[j];
            
            // Calculate the delay required by wizards 1 to n-1
            long wizardDelay = 0; 
            for (int i = 1; i < n; i++) {
                long requiredDelay = prefixSkill[i] * manaPrev - prefixSkill[i - 1] * manaCurr;
                if (requiredDelay > wizardDelay) {
                    wizardDelay = requiredDelay;
                }
            }

            // Calculate the delay required by only wizard 0
            long wizard0Delay = (long)skill[0] * manaPrev;
            
            // The true delay is the greater of the two constraints
            long totalDelay = Math.max(wizardDelay, wizard0Delay);
            
            currentStartTime += totalDelay;
        }

        long totalTime = currentStartTime + prefixSkill[n - 1] * mana[m - 1];

        return totalTime;
    }
}