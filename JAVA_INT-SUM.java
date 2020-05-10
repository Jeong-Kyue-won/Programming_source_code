import java.util.Scanner;

public class Code0 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum=0;
        System.out.println("입력 받은 모든 정수의 합을 구합니다.");
        System.out.println("단 -1을 입력 시 종료\n정수 입력>> ");
        while(true){
            int n = sc.nextInt();
            if(n==-1)
                break;
            sum += n;
        }
        System.out.println("입력받은 모든 정수의 합 : "+sum);
    }

}
