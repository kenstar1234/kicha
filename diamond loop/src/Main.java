import java.util.Scanner;
class Kenstar{
    public static void main(String[] args){
      int n;
      Scanner line=new Scanner(System.in);
      n=line.nextInt();
      for(int i=n;i>=1;i=i-1)
      {
          for(int a=i+1;a<=n;a++)
          {
              System.out.print(+a);
          }
         for(int b=1;b<=i;b++)
          {
              System.out.print(+b);
          }
          System.out.println();

      }
    }
}
