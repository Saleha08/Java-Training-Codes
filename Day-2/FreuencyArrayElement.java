import java.util.*;
public class FreuencyArrayElement {
    public static void main(String[] args){
        int[] arr={5,1,1,2,5,3,4};

        System.out.println(getFrequency(arr));

    }
    public static Map<Integer,Integer> getFrequency(int[] arr){
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i< arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1 );
            }else{
                map.put(arr[i],1);
            }
        }
        return map;
    }
}
