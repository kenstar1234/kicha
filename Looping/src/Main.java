import java.util.Scanner;
class Main {
    public static void main(String[] args) {

        int s;
        Scanner value=new Scanner(System.in);
        System.out.print("NUMBER OF LIST :");
        s=value.nextInt();

        for(int i=0;i<s;i++) {
            System.out.print("VALUE OF A :");
            int a = value.nextInt();
            System.out.print("VALUE OF B :");
            int b = value.nextInt();
            System.out.print("NUMBER OF SERIES:");
            int n = value.nextInt();
            System.out.print("THE VALUES ARE :");

            for (int j = 0; j < n; j++)
            {
                a=a+b;

                System.out.print(a+" ");
                b=b*2;
            }
            System.out.println(" ");
        }
    }
}