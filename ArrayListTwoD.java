package TwoDimensionArray;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTwoD {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(10); a.add(20); a.add(30);

        List<Integer> b = new ArrayList<>();
        b.add(40); b.add(50);

        List<Integer> c = new ArrayList<>();

        List<Integer> d = new ArrayList<>();
        d.add(60);

        List<List<Integer>> L = new ArrayList<>();
        L.add(a); L.add(b); L.add(c); L.add(d);

        for(int i=0; i<=L.size(); i++){
            for(int j=0; j<L.get(i).size(); j++){
                System.out.print(L.get(i).get(j)+" ");
            }
            System.out.println();
        }
        System.out.println(L.get(1).get(2));
    }

}
