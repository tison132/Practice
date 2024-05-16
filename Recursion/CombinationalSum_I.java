package Recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationalSum_I {
    public static void main(String[] args) {
        int arr[]={2,1,4};
        int target=7;
        List<List<Integer>> arrayList= new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        helper(0,arrayList,temp,arr,target);
        System.out.println(arrayList);
    }

    private static void helper(int ind, List<List<Integer>> arrayList,
                               List<Integer> temp, int[] arr,int target) {
        if(ind>=arr.length){
            if(target==0){
                arrayList.add(new ArrayList<>(temp));
            }
            return;
        }
        if(arr[ind]<=target){
            temp.add(arr[ind]);
            helper(ind,arrayList,temp,arr,target-arr[ind]);
            temp.remove(temp.size()-1);
        }
        helper(ind+1,arrayList,temp,arr,target);

    }

}
