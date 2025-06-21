package basic.technical.array;


import java.util.Arrays;

public class problem2 {
  public static void main(String[] args) {
    int a[] = {1, 2};
    int b[] = new int[12];
    int c = 1;
    int sum=0;
    b[0] = 0;
    for(int i=0;i<a.length;i++) {
      for (int j = c; j <= a.length; j++) {
        b[j] = sum + a[j - 1];
      }
      c++;
    }
    System.out.println(Arrays.toString(b));
//    Scanner sc = new Scanner(System.in);
//    int length = sc.nextInt();
//    for(int i=0; i<length; i++){
//      a[i] = sc.nextInt();
//    }


  }
}
