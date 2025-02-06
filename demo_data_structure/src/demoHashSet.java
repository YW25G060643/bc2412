import java.util.HashSet;

public class demoHashSet {
    public static void main(String[] args) {
        HashSet<String> strings = new HashSet<>();
        strings.add("abc");
        strings.add("def");
        System.out.println(strings.size());//2

        //difference between hashset and arraylist
        System.out.println(strings.add("abc"));//false
        System.out.println(strings.size());//2, hashset avoid duplicate item
        
        System.out.println(strings.add("ijk"));//true
        System.out.println(strings.size());//3

        strings.remove("ijk");
        System.out.println(strings.size());//2
        
        //HashSet cannot be ordering natually
        //caz its underlying data structure is not a array
        //not provide remove by index method
        // int targetRemoveIndex = 1;
        // String targetRemoveString = null;
        // int index = 0;

        // for(String s : strings){
        //     if (targetRemoveIndex == index) {
        //         targetRemoveString = s;
        //         break;
        //     }
        //     index++;
        // }
        // strings.remove(targetRemoveString);
    }
}
