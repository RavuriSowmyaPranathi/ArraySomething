package Question;
import java.util.Scanner;

public class Array {
		@SuppressWarnings("null")
		public static void main(String []args)
		{
			@SuppressWarnings("resource")
			Scanner s1 = new Scanner(System.in);
			int r = s1.nextInt();
			int c = s1.nextInt();
			int n = s1.nextInt();

			int[][] matrix1 = new int[r][c];
			int[][] matrix2 = new int[c][r];
			int[][] matrix3 = new int[r][r];
			
			for(int i=0;i<r;i++){    
				for(int j=0;j<c;j++){ 
					matrix1[i][j]=n;
					n=n+1;
				}
			}
			for (int i = 0; i < r; i++)
			{
			    for(int j = 0; j < c; j++) {
			        System.out.println("Row ["+i+"]:  Column "+j+" :" + matrix1[i][j] );
			}
			}
				for(int ii=0;ii<c;ii++){    
					for(int jj=0;jj<r;jj++){ 
						matrix2[ii][jj]=matrix1[jj][ii];
					}
				}
				for (int i = 0; i < c; i++)
				{
				    for(int j = 0; j < r; j++) {
				        System.out.println("Row ["+i+"]:  Column "+j+" :" + matrix2[i][j] );
				}
				}
				
				for(int a=0;a<r;a++){    
					for(int b=0;b<r;b++){
						matrix3[a][b]=0;
						for(int k=0;k<c;k++) {
							matrix3[a][b]+=matrix1[a][k]*matrix2[k][b];
						}
						}
						
				}
				for (int i = 0; i < r; i++)
				{
				    for(int j = 0; j < r; j++) {
				        System.out.println("Row ["+i+"]:  Column "+j+" :" + matrix3[i][j] );
				}
				}
				
			
		}
	}
