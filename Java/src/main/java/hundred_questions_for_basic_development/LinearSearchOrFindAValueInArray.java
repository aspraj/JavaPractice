package hundred_questions_for_basic_development;
import java.util.Scanner;

public class LinearSearchOrFindAValueInArray {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter number of array elements you will enter:");
    int a = in.nextInt();
    int arr[] = new int[a];
    System.out.println("Enter " + a + " elements in array:");
    for(int i = 0; i<a; i++){
      arr[i] = in.nextInt();
    }
    System.out.println("Enter a element to check in array:");
    int target = in.nextInt();
    for(int i = 0 ; i < arr.length ; i++){
      if(arr[i] == target){
        System.out.println(target + " is present at location " + i);
      }
    }
//    String s = Arrays.toString(arr);
//    if(s.contains("5")){
//      System.out.println(target + " is present at location " + s.indexOf("5"));
//    }
  }
}
