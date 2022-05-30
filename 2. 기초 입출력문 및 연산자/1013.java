import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<2; i++) {
        	int N = Integer.parseInt(st.nextToken());
        sb.append(N).append(" ");
        }
        System.out.print(sb);
    }
}
