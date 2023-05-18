import java.util.Scanner;

public class loops {

    public static void main(String[] args) {

        boolean isExit = false;
        Scanner buffer = new Scanner (System.in);

        while (!isExit) {
            String s = buffer.nextLine();
            System.out.println(s);
            isExit = s.equals("exit");
        }
        buffer.close();



    }
}
