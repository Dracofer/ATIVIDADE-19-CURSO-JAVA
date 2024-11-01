import java.util.Scanner;

public class Main {
  public static void main(String[] args) {  
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int i;
    int in=0;
    int out=0;
    int x=0;
    
    for(i=0 ; i!=n ; i=i+1){
            x = sc.nextInt();
    if(x >= 10 && x <= 20){
        in=in+1;
    }else{ 
        out=out+1;
    }
    }
            System.out.printf("%d in%n", in);
            System.out.printf("%d out%n", out);
    
    sc.close();
  }
}
