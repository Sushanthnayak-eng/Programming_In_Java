import java.util.*;

class MergeSort{
  public void merge(int arr[],int first,int mid,int last){


    int n1=mid-first+1;
    int n2=last-mid;

    int L[]=new int[n1];
    int R[]=new int[n2];
    
    for(int i = 0; i < n1; i++){
    L[i] = arr[first + i];
}
for(int i = 0; i < n2; i++){
    R[i] = arr[mid + 1 + i];
}
 
    int i=0,j=0,k=first;
    while(i<n1&&j<n2){
       if(L[i]<R[j]){
           arr[k]=L[i];
           i++;
       }else{
           arr[k]=R[j];
           j++;
       }
       k++;
    }

    while(i<n1){
        arr[k]=L[i];
        k++;
        i++;
    }
    while(j<n2){
        arr[k]=R[j];
        k++;
        j++;
    }

  }

  public void mergesorting(int arr[],int first,int last){
    if(first<last){
        int mid=(first+last)/2;
        mergesorting(arr,first,mid);
        mergesorting(arr,mid+1,last);
        merge(arr,first,mid,last);
    }
  }
}

public class Insertion{
    public static void main(String[] args){
     MergeSort me=new MergeSort();
     Scanner scn=new Scanner(System.in);
     
     System.out.println("Enter the size of the array:- ");
     int n=scn.nextInt();
     int arr[]=new int[n];
     for(int i=0;i<n;i++){
        System.out.println("Enter the "+(i+1)+ "Element");
        arr[i]=scn.nextInt();
     }

     me.mergesorting(arr,0,n-1);

     for(int i=0;i<n;i++){
        System.out.println(arr[i]+" ");
     }
     scn.close();
    }
}
