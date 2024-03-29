import java.io.*; 
import java.util.*;
class rotate{ 
    static void rotateMatrix(int N, int mat[][]) 
    { 
        for (int x = 0; x < N / 2; x++) { 
            for (int y = x; y < N - x - 1; y++) {  
                int temp = mat[x][y];  
                mat[x][y] = mat[y][N - 1 - x]; 
                mat[y][N - 1 - x]= mat[N - 1 - x][N - 1 - y]; 
                mat[N - 1 - x][N - 1 - y] = mat[N - 1 - y][x]; 
                mat[N - 1 - y][x] = temp; 
            } 
        } 
    } 
    static void displayMatrix(int N, int mat[][]) 
    { 
        for (int i = 0; i < N; i++) { 
            for (int j = 0; j < N; j++) 
                System.out.print(" " + mat[i][j]); 
  
            System.out.print("\n"); 
        } 
        System.out.print("\n"); 
    } 
    public static void main(String[] args) 
    { 
       
  	int r=0,c=0;
	Scanner sc=new Scanner(System.in);
	r=sc.nextInt();
	c=sc.nextInt();
	int mat[][]=new int[r][c];
	for (int i = 0; i <r; i++) 
            for (int j = 0; j <c; j++) 
		mat[i][j]=sc.nextInt();
	int n=sc.nextInt();
	for(int i=1;i<=n;i++)
        {
		rotateMatrix(r, mat);
	} 
        displayMatrix(r, mat); 
    } 
} 