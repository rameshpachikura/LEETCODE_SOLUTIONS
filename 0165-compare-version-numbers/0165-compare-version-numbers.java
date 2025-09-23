class Solution {
    public int compareVersion(String version1, String version2) {
    String[] a = version1.split("\\.");
    String[] b = version2.split("\\.");
    int n = Math.max(a.length, b.length);

    for (int i = 0; i < n; i++) {
        int v1=0;
        int v2=0;
        if(i<a.length){
            v1=Integer.parseInt(a[i]);
        }
        if(i<b.length){
            v2=Integer.parseInt(b[i]);
        }
        if(v1<v2){
            return -1;
        }
        else if(v1>v2){
            return 1;
        }
    }
    return 0;
    }
}