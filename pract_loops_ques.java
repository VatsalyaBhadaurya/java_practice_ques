// program to print following pattern
// * * * *
// * * *
// * *
// *

public class loops {
    public static void main(String[] args) {

        int n = 4;
        for (int i=n; i>0; i--){
            for (int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.print("\n");

        }
    }
}

// progeram to write sum of first n numbers

public class loops {
    public static void main(String[] args) {

        int sum = 0;
        int n = 3 ;
        for (int i = 0; i<n; i++){
            sum = sum + (2*i);

            }
        System.out.println("sum is " + sum);
        }
    }

//
