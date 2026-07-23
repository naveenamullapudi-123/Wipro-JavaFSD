import java.util.*;

public class DecreasingSequence {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        boolean flag = true;

        for(int i=1;i<n;i++) {

            if(arr[i] >= arr[i-1]) {
                flag = false;
                break;
            }
        }

        if(flag)
            System.out.println("Decreasing Sequence");
        else
            System.out.println("Not a Decreasing Sequence");
    }
}