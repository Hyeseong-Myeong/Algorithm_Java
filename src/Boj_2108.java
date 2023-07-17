import java.util.*;

public class Boj_2108 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numList = new ArrayList<>();

        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            int num = sc.nextInt();
            numList.add(num);
        }

        //산술평균
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += numList.get(i);
        }

        System.out.println((int)Math.round((double)sum / n));


        //중앙값
        Collections.sort(numList);
        System.out.println(numList.get(n/2));


        //최빈값
        Map<Integer, Integer> map = new HashMap<>();
        if(n == 1){
            System.out.println(numList.get(0));
        }
        else{
            for(int i = 0; i < n; i++){
                if(map.containsKey(numList.get(i))){
                    map.put(numList.get(i), map.get(numList.get(i)) + 1);
                }else{
                    map.put(numList.get(i), 1);
                }
            }

            int biggest = Collections.max(map.values());

            ArrayList<Integer> bigestnumsofNum = new ArrayList<>();
            for(Map.Entry<Integer, Integer> m : map.entrySet()){
                if(m.getValue() == biggest){
                    bigestnumsofNum.add(m.getKey());
                }
            }
            Collections.sort(bigestnumsofNum);

            if(bigestnumsofNum.size() >= 2)
                System.out.println(bigestnumsofNum.get(1));
            else
                System.out.println(bigestnumsofNum.get(0));

        }



        //범위
        int range = numList.get(n - 1) - numList.get(0);
        System.out.println(range);

    }
}
