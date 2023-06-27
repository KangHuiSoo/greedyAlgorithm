// import java.io.*;
// import java.util.*;

// public class Main{
//     static int coinCnt = 0;
//     static int c;

//     public static void main(String[] args) throws IOException{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         int t = Integer.parseInt(br.readLine());
//         c = 1000 - t;

//         for(int i = 0; i < c; i++){
//             int fiveHundred = c / 500;
//             c %= 500;
//             int hundred = c / 100;
//             c %= 100;
//             int fifty = c / 50;
//             c %= 50;
//             int ten = c / 10;
//             c %= 10;
//             int five = c / 5;
//             c %= 5;
//             int one = c / 1;
//             c %= 1;
//             System.out.print(fiveHundred + hundred + fifty + ten + five + one);
//         }
//     }
// }

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String [] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        int change = 1000 - t;
        int result = 0;

        int [] coins = {500,100,50,10,5,1};

        for(int coin : coins){

            if (coin > change)
                continue;
            result += change / coin;
            change %= coin;

        }
        System.out.println(result);
    }
}