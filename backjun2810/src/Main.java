import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numOfPeople = Integer.parseInt(br.readLine());
        String seat = br.readLine();

        int cnt = 1;  //S좌석이든 L좌석이든 왼쪽에는 무조건 *

        for (int i = 0; i < numOfPeople; i++){
            char a = seat.charAt(i);

            if (a == 'S'){
                cnt++;
            } else if (a == 'L'){
                i++;
                cnt++;
            }
        }

        // 컵홀더 수가 사람보다 많으면 인원수를 출력하면되고,
        // 만약 컵홀더숙 사람보다 적으면 컵홀더수를 출력하면된다.
        if(cnt > numOfPeople){
            System.out.print(numOfPeople);
        }else {
            System.out.print(cnt);
        }
    }
}