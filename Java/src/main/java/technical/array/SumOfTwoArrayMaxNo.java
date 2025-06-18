package technical.array;

public class SumOfTwoArrayMaxNo {
  public static void main(String[] args) {
    int a[] = {2,3,1,1};
    int b[] = {2,4,4,1};
    int c = 0;

    for(int i=0; i<a.length; i++){
      if(a[i] >= b[i]){
        c = c + a[i];
      }
      if(a[i] < b[i]){
        c = c + b[i];
      }
    }
    System.out.println(c);
  }
}
