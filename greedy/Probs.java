package greedy;

public class Probs {
    // assigning cookies to children
    public static int findContentChildren(int[] g, int[] s) {
        java.util.Arrays.sort(g);
        java.util.Arrays.sort(s);
        int child = 0, cookie = 0;
        while (child < g.length && cookie < s.length) {
            if (s[cookie] >= g[child]) {
                child++;
            }
            cookie++;
        }
        return child;
    }
    public static void main(String[] args) {
        int[] g = {1, 2, 3};
        int[] s = {1, 1};
        System.out.println("Content children: " + findContentChildren(g, s)); // Output: 1

        int[] g2 = {1,5,3,3,4};
        int[] s2 = {4,2,1,2,1,3};
        
        System.out.println("Content children: " + findContentChildren(g2, s2)); 
    }   
}
