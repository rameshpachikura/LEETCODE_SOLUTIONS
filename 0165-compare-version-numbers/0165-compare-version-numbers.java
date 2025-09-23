class Solution {
    public int compareVersion(String version1, String version2) {
      String[] a = version1.split("\\.");
    String[] b = version2.split("\\.");

List<String> listA = new ArrayList<>(Arrays.asList(a));
List<String> listB = new ArrayList<>(Arrays.asList(b));

while (listA.size() < listB.size()) {
    listA.add("0");
}

while (listB.size() < listA.size()) {
    listB.add("0");
}

for (int k = 0; k < listA.size(); k++) {
    int numA = Integer.parseInt(listA.get(k));
    int numB = Integer.parseInt(listB.get(k));
    if (numA > numB) {
       return 1;
    } else if (numA < numB) {
       return -1;
    }
}
return 0;

    }
}