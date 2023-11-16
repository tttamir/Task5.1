import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int a;
        int b;
        int[][] arr;

        System.out.print("vvedi col-vo stolbcov - ");
        a = sc.nextInt();
        System.out.print("vvedi col-vo strok - ");
        b = sc.nextInt();
        arr = new int[a][b];
        System.out.println("1- random     2- samomu");
        int x = sc.nextInt();
        switch (x){
            case 1: for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j]= random.nextInt(0, 10);
                }
            }
                break;
            case 2:  for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print("["+ i +"]["+j+"] = ");
                    int q = sc.nextInt();
                    arr[i][j]=q;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum +=arr[i][j];
            }
        }
        System.out.println("sum = "+sum);

        String[][] arr1 = new String[8][8];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                if ((i+j)%2==0)
                    arr1[i][j] = "W";
                else
                    arr1[i][j] = "B";
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }

        int a2=0;
        int b2=0;
        int[][] arr2;

        System.out.print("vvedi col-vo stolbcov - ");
        a = sc.nextInt();
        System.out.print("vvedi col-vo strok - ");
        b = sc.nextInt();
        arr2 = new int[a2][b2];

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {

            }

        }
    }
}