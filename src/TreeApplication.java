import model.MyTree;
import model.SuperInfo;
import model.TestClass;
import model.comparators.SuperInfoComparatorByString;
import model.comparators.SuperInfoComparatorByTVal;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TreeApplication {

    public static void main(String[] args) {

        MyTree<Integer> myTree = new MyTree<>();
        for (int i = 0; i < 9; i++) {
            //myTree.add((int) (Math.random() * 50));
            //myTree.add(i);
            myTree.put(i);
        }

        System.out.println("**************************");
        for (Object o : myTree.outTree()) {
            System.out.println(o);
        }


        System.out.println("**************************");

        /*MyTree<SuperInfo> myTree1 = new MyTree<>();

        myTree1.put(new SuperInfo("Какая-то строка"));
        myTree1.put(new SuperInfo("Какая-то строка1"));
        myTree1.put(new SuperInfo("Какая-то строка2"));
        myTree1.put(new SuperInfo("1Какая-то строка")); */

        Comparator<SuperInfo> newComparator = new SuperInfoComparatorByString(true)
                .thenComparing(new SuperInfoComparatorByTVal(true));

        List<SuperInfo<Integer>> superInfoList = new LinkedList<>();
        superInfoList.add(new SuperInfo("a",1));
        superInfoList.add(new SuperInfo("d",5));
        superInfoList.add(new SuperInfo("c",2));
        superInfoList.add(new SuperInfo("d",4));

        superInfoList.sort(newComparator);

        for (SuperInfo s : superInfoList) {
            System.out.print(" " + s);
        }

        TestClass testClass1 = new TestClass("Cтрока", 5);
        TestClass testClass2 = new TestClass("Cтрока", 10);
        System.out.println();
        System.out.println(testClass1.equals(testClass2));





        /*for (Object o : myTree1.outTree()) {
            System.out.println(o);
        }*/

    }
}
