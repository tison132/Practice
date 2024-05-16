package Recursion;

import java.util.ArrayList;
import java.util.List;

public class subsequence {
    public static void main(String[] args) {
        int arr[]={2,1,4};
        List<List<Integer>> arrayList= new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        helper(0,arrayList,temp,arr);
        System.out.println(arrayList);
    }

    private static void helper(int ind, List<List<Integer>> arrayList,
                               List<Integer> temp, int[] arr) {
        if(ind>=arr.length){
            arrayList.add(new ArrayList<>(temp));
            return;
        }
        temp.add(arr[ind]);
        helper(ind+1,arrayList,temp,arr);
        temp.remove(temp.size()-1);
        helper(ind+1,arrayList,temp,arr);
    }
}
//o/p
//[[2, 1, 4], [2, 1], [2, 4], [2], [1, 4], [1], [4], []]
