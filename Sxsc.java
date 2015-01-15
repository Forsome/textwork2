import java.util.Scanner;
public class Sxsc{
public static void main(String[] args){
Scanner in=new Scanner(System.in);
int n;
n=in.nextInt();
int[] sz;
sz=new int[n];
   for(int i=0;i<n;i++){
   sz[i]=in.nextInt();
   }
   for(int j=0;j<n-1;j++){
     for(int k=0;k<n-j-1;k++){
     if(sz[k]>sz[k+1]){
     int temp=sz[k];
     sz[k]=sz[k+1];
     sz[k+1]=temp;
     }
   }
   }
   for(int i=0;i<n;i++){
   System.out.print(sz[i]+" ");
   }
}
} 