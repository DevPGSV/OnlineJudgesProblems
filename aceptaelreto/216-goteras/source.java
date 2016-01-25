import java.util.Scanner;



public class Gotas {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int drops;

        for (int i = in.nextInt(); i > 0; i--) {
            drops = in.nextInt();
            System.out.println(String.format("%02d:%02d:%02d", (drops / 60) / 60, (drops / 60) % 60, drops % 60));
        }

        in.close();
    }

}
