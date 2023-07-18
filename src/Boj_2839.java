import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Boj_2839   {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<>();
        int N = sc.nextInt();

        int fNum = 0;
        while(fNum * 5 <= N ){
            if((N - (5 * fNum)) % 3 == 0) {
                int tNum = (N - (5*fNum)) / 3;
                numList.add(fNum + tNum);
            }
            fNum++;
        }

        if(numList.size() == 0)
            System.out.println(-1);
        else {
            Collections.sort(numList);
            System.out.println(numList.get(0));
        }
    }
}
