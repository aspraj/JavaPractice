package hundred_questions_for_basic_development;

public class BinarySearch {
  public static void main(String[] args) {
    int a[] = {0,1,2,4,6,7,8,9};
    int n = 8;
    int maxVal = a.length - 1;
    int minVal = 0;
    int midVal = 0;

    while(a[minVal]<=a[maxVal]){
      midVal = (minVal + maxVal)/2;

      if(a[midVal] == n){
        break;
      }
      if(n<a[midVal]){
        maxVal = midVal - 1;
      }
      if(n>a[midVal]){
        minVal = midVal+1;
      }
    }
System.out.println(n + " is present at location " + midVal);


  }
}
