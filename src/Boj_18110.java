import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Boj_18110 {
    //  time out
    //    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> levels = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            levels.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(levels);

        int cut = (int)Math.round(N * 0.15);
        double sum = 0;
        for(int i = cut; i < N -  cut; i++){
            sum += levels.get(i);
        }
        int x = (int)Math.round(sum / (N - cut*2));

        System.out.println(x);
    }
}
