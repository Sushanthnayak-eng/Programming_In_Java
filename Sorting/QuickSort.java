import java.util.Scanner;
class Sort{
    public void qs(int arr[],int low,int high){
        if(low<high){
            int partionindex=part(arr,low,high);
            qs(arr,low,partionindex-1);
            qs(arr,partionindex+1,high);
        }
    }
   public int part(int arr[],int low,int high){
      int pivot=arr[low];
      int i=low,j=high;
      while(i<j){
        while(i <= high && arr[i]<=pivot){
            i++;
        }
        while(j >= low && arr[j]>pivot){
            j--;
        }
        if(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
      }
           int temp=arr[low];
            arr[low]=arr[j];
            arr[j]=temp;
            return j;
    }
}

public class QuickSort {
public static void main(String[] args){
   Scanner scn=new Scanner(System .in);
   Sort s=new Sort();
   System.out.println("Enter the number of terms in an array:- ");
   int n=scn.nextInt();
   int arr[]=new int[n];
   for(int i=0;i<n;i++){
    System.out.println("Enter the "+(i+1)+" element:- ");
    arr[i] = scn.nextInt();
   }
   s.qs(arr, 0, n-1);
   for(int i=0;i<n;i++){
    System.out.print(arr[i]+" ");
   }
   scn.close();
}
    
}
