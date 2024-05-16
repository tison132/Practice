package Recursion;

import java.util.ArrayList;
import java.util.List;

public class subsequence {
    public static void main(String[] args) {
        int arr[]={2,1,4};
        List<List<Integer>> arrayList= new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        helper(0,arrayList,temp,arr);
    }

    private static void helper(int i, List<List<Integer>> arrayList,
                               List<Integer> temp, int[] arr) {

    }
}
