import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());  //테스트 케이스 개수

        for (int i = 0; i < t; i++) {
            int c = Integer.parseInt(br.readLine());
            int quarter = c / 25;  //쿼터 0.25$
            c %= 25;
            int dime = c / 10;  //다임 0.10$
            c %= 10;
            int nickel = c / 5;  //니켈 0.05$
            c %= 5;
            int penny = c / 1;  //페니 0.01$

            System.out.println(quarter + " " + dime + " " + nickel + " " + penny);
        }
    }
}