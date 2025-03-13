class Solution {
    public int[] plusOne(int[] digits) {
        ArrayList<Integer> a = new ArrayList<>();

        for (int num : digits) {
            a.add(num);
        }

        int n = a.size();
        if (a.get(n - 1) == 9) {
            a.set(n - 1, 0);
            for (int i = n - 2; i >= 0; i--) {
                if (a.get(i) != 9) {
                    a.set(i, a.get(i) + 1);
                    break;
                } else {
                    a.set(i, 0);
                }
            }
            if (a.get(0) == 0) {
                a.add(0, 1);
            }
        } else {
            a.set(n - 1, a.get(n - 1) + 1);
        }
        int[] x = new int[a.size()];
        for (int i = 0; i < a.size(); i++) {
            x[i] = a.get(i);
        }
        
        return x;
    }
}
