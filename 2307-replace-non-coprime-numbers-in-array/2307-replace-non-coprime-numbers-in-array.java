import java.util.*;

class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        Stack<Integer> st = new Stack<>();

        for (int num : nums) {
            st.push(num);

            // Keep merging while last two are not coprime
            while (st.size() >= 2) {
                int x = st.pop();
                int y = st.pop();
                int g = gcd(x, y);

                if (g > 1) { // Not coprime
                    st.push(lcm(x, y));
                } else {
                    st.push(y);
                    st.push(x);
                    break;
                }
            }
        }

        return new ArrayList<>(st);
    }

    // Euclidean GCD
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // LCM formula
    private int lcm(int a, int b) {
        return (int)((long)a * b / gcd(a, b)); // cast to long to avoid overflow
    }
}
