import java.util.Scanner;
public class matran {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("nhap so hang: ");
        int r = sc.nextInt();
        System.out.print("nhap so cot: ");
        int c = sc.nextInt();

        int[][] mat1 = new int[r][c];
        int[][] mat2 = new int[r][c];
        int[][] tongmat = new int[r][c];

        System.out.println("nhap cac phan tu cua ma tran thu nhat:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }

        System.out.println("nhap cac phan tu cua ma tran thu hai:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                tongmat[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        System.out.println("tong cua hai ma tran:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(tongmat[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
