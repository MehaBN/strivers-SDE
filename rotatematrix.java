import java.util.*;
class rotatematrix{

public void rotateMatrix(int[][] matrix) {
    int n = matrix.length;
    int b[][] = new int[n][n];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                b[j][n-i-1] = matrix[i][j];
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                System.out.print(b[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        rotatematrix obj = new rotatematrix();
        int n=sc.nextInt();
        
        int matrix[][] = new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        obj.rotateMatrix(matrix);

        sc.close();
    }
}