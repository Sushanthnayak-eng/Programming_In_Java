import java.util.Scanner;

class Sort{
    public void sort(int arr[],int n){
    if(n==1){
        return;
    }
    for(int i=0;i<n-1;i++){
        if(arr[i]>arr[i+1]){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
    }
    sort(arr,n-1);
    }
}

public class Bubblesort{
  public static void main(String[] args){
    Sort s=new Sort();
    System.out.println("Enter the size of the array:- ");
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
        System.out.println("Enter the "+(i+1)+" element");
        arr[i]=scn.nextInt();
    }
      s.sort(arr,n);
    for(int i=0;i<n;i++){
        System.out.println(" "+arr[i]);
    }
    scn.close();
  }
}