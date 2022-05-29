package stdin_and_stdout;

import java.util.*;

public class javaStdinAndStdout01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number01 = scan.nextInt();
        int number02 = scan.nextInt();
        int number03 = scan.nextInt();

        System.out.println(number01);
        System.out.println(number02);
        System.out.println(number03);
    }

}
