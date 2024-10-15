import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        TreeSet<String> treeSet2 = new TreeSet<>();
        treeSet.add("a");
        treeSet.add("b");
        System.out.println(treeSet);
        treeSet.pollFirst();
        treeSet2 = (TreeSet)treeSet.subSet("a",true,"b",true);
        System.out.println(treeSet2);
        System.out.println("\\");
        String[] a = new String[]{"dd ", "dsf"};
        System.out.println(a.length);
    }
}