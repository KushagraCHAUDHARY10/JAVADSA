import java.util.*;
public class reversearr {
    public void reverse(int[] arr, int n) {
        helper(0, arr, n-1); 
    }
    void helper(int i, int[] arr, int j){
        if(i>=j) return; 
        int temp= arr[i]; 
        arr[i]=arr[j]; 
        arr[j]=temp; 
        helper(i+1,arr,j-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements");
        for (int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        reversearr rev = new reversearr();
        rev.reverse(arr,n);
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}