import java.io.*;

public class Main {
    static int a = 0;  // 5분 (5 * 60 = 300초)
    static int b = 0;  // 1분 (1 * 60 = 60초)
    static int c = 0;  // 10초

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        // 입력된 요리시간을 최소 초단위인 10초로 나누었을때 나머지가 0이 아니라면 -1 을 출력
        if(t % 10 != 0) {
            System.out.println(-1);
            return;
        }
        f(t);
        System.out.println(a + " " + b + " " + c );
    }

   // 3. 재귀함수 구현
    static void f(int n){
        if (n == 0) return;
        if (n >= 300) {
            n -= 300;
            a++;
            f(n);
        } else if (n >= 60) {
            n -= 60;
            b++;
            f(n);
        } else {
            n -= 10;
            c++;
            f(n);
        }
    }
}