import java.util.Scanner;
import java.util.Random;

public class conditionals {
    public static void main(String[] args) {

        System.out.println("RPS Game");
        System.out.println("Enter 1 for rock, 2 for paper & 3 for scissors");

        Scanner a = new Scanner(System.in);
        int a1 = a.nextInt();

        Random r1 = new Random();
        int rn = r1.nextInt(1,3);
        System.out.println("Robot drew "+rn);

        if (a1 == 1 && rn ==1){
            System.out.println("Both drew rock, Draw");
        }

        if (a1 == 2 && rn == 1){
            System.out.println("You drew paper and robot drew rock");
            System.out.println("You won!");
        }

        if(a1 == 3 && rn == 1){
            System.out.println("You drew scissors and robot drew rock");
            System.out.println("Robot won!");
        }

        if (a1 == 2 && rn == 2){
            System.out.println("Both drew paper, Draw");
        }

        if (a1 == 3 && rn == 2){
            System.out.println("You drew scissors and robot drew paper");
            System.out.println("You won");
        }

        if (a1 == 1 && rn == 3){
            System.out.println("You drew rock and robot drew scissors");
            System.out.println("You won");
        }

        if (a1 == 2 && rn == 3){
            System.out.println("You drew paper and robot drew scissors");
            System.out.println("Robot won");
        }

        if (a1 == 3 && rn == 3){
            System.out.println("Both drew scissors, Draw");
        }

        if (a1 == 1 && rn == 2){
            System.out.println("You drew rock and robot drew paper");
            System.out.println("Robot won");

        }
    }
}
